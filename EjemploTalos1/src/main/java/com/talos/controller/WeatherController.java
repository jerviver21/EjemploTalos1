package com.talos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.talos.model.Cities;



@Controller
public class WeatherController {
	
	
	@RequestMapping(value="/weather", method=RequestMethod.GET)
	public @ResponseBody Cities findWeather(@RequestParam(value="city", required=false, defaultValue="Medellin") String city, 
			@RequestParam(value="metric", required=false, defaultValue="Metric") String metric){
		System.out.println(city+" - "+metric);
		
		RestTemplate restTemplate = new RestTemplate();
        Cities data = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/find?q=London&units=metric&mode=json", Cities.class);
        
        System.out.println(data);

		return data;
	}
	


}
