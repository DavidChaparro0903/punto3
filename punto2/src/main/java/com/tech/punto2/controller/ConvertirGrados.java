package com.tech.punto2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grade")
public class ConvertirGrados {
    
    @RequestMapping("/celsiusToFahrenheit/{celcius}")
    public double getCelsiusToFahrenheit(@PathVariable double celcius){
        return Math.round((celcius * 9f / 5f + 32) * 100.0) / 100.0;
    }

    @RequestMapping("/celsiusToKelvin/{celcius}")
    public double getCelsiusToKelvin(@PathVariable double celcius){
        return Math.round((celcius + 273.15) * 100.0) / 100.0;
    }

    @RequestMapping("/fahrenheitToCelcius/{fahrenheit}")
    public double getFahrenheitToCelcius(@PathVariable double fahrenheit){
        return  Math.round(((fahrenheit - 32) * (5f /9f)) * 100.0) / 100.0;
    }
    

    @RequestMapping("/farenheitToKelvin/{fahrenheit}")
    public double getFarenheitToKelvin(@PathVariable double fahrenheit){
        return  Math.round(((fahrenheit - 32) * 5/9 + 273.15) * 100.0) / 100.0;
    }

    @RequestMapping("/kelvinToCelsius/{kelvin}")
    public double getKelvinToCelsius(@PathVariable double kelvin){
        return  Math.round((kelvin - 273.15) * 100.0) / 100.0;
    }

    @RequestMapping("/kelvinToFarenheit/{kelvin}")
    public double getKelvinToFarenheit(@PathVariable double kelvin){
        return  Math.round(((kelvin -273.15) * 9/5 + 32) * 100.0) / 100.0;
    }


}
