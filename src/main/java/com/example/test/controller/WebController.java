package com.example.test.controller;

import com.example.test.model.prediction.Prediction;
import com.example.test.model.prediction.PredictionResponse;
import com.example.test.service.DirectionService;
import com.example.test.service.PredictionService;
import com.example.test.service.RouteService;
import com.example.test.service.StopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by thomasdutta on 1/12/17.
 */
@Controller
public class WebController {

    final static Logger logger = LoggerFactory.getLogger(WebController.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RouteService routeService;

    @Autowired
    DirectionService directionService;

    @Autowired
    StopService stopService;

    @Autowired
    PredictionService predictionService;


    @RequestMapping(value = "/",  method = RequestMethod.GET)
    public String getIndex(HttpServletRequest request, Model model) {
        model.addAttribute("routeMap",routeService.getRoute());
        return "index";
    }

    @RequestMapping(value = "/api/{route}",  method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> getDirection(@PathVariable String route, HttpServletRequest request, Model model) {
        return directionService.getDirection(route);
    }

    @RequestMapping(value = "/api/{route}/{direction}",  method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> getStop(@PathVariable String route, @PathVariable String direction, HttpServletRequest request, Model model) {
        return stopService.getStop(route, direction);
    }

    @RequestMapping(value = "/api/{route}/{direction}/{stop}",  method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Prediction> getPrediction(@PathVariable String route, @PathVariable String direction,
                                                   @PathVariable String stop, HttpServletRequest request, Model model) {
        logger.info("request received: /api/" + route + "/" + direction + "/" +stop);
        return predictionService.getPredictionByRouteAndStop(route, stop);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET) // , produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Prediction direction(@PathVariable String id, HttpServletRequest request, Model model) {


//        logger.info("thomas " + token);
        String route = request.getParameter("route");
        String stop = request.getParameter("stop");

//        RestTemplate restTemplate = new RestTemplate();
        String apiURL = "http://ctabustracker.com/bustime/api/v2/getpredictions?key=vxPykdNsRsC3ANepnXmvLgXYg&rt="+route+"&stpid="+stop+"&format=json";
        String strResponse = restTemplate.getForObject(apiURL, String.class);
        logger.info(strResponse);
        PredictionResponse response = restTemplate.getForObject(apiURL, PredictionResponse .class);
//        return timeResponse.getBustimeResponse().getTm();
        return response.getBustimeResponse().getPrd().get(0);
    }



//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
////    @ResponseBody
//    public String hello(@PathVariable String id, Model model) {
//        model.addAttribute("name", id);
//        return "greeting";
//    }
}
