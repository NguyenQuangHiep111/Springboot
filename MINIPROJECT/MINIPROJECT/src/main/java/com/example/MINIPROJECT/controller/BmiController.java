package com.example.MINIPROJECT.controller;

import com.example.MINIPROJECT.request.BmiRequest;
import com.example.MINIPROJECT.service.BmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiController {

    @Autowired
    private BmiService bmiService;

    @GetMapping("/bmi-get")
    public double caculateBmiGet(@RequestParam double height, @RequestParam double weight){
        //return bmiService.caulateBmi(height,weight);
        return bmiService.caulateBmi(height,weight);
    }

    @GetMapping("/bmi-post")
    public double caculateBmiPost(@RequestBody BmiRequest request){
        return bmiService.caulateBmi(request.getHeight(), request.getWeight());
    }
}
