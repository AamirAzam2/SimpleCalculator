package com.aegon.controller;

import com.aegon.model.Response;
import com.aegon.service.impl.CalculatorServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//http://localhost:8080/swagger-ui.html#/calculator-controller
@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private CalculatorServiceImpl calServiceImpl;

    @RequestMapping(method = RequestMethod.GET, value = "/add/{num1}/{num2}",produces = "application/json")
    @ApiOperation("Adds two numbers passed as path variables")
    public Response add(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return calServiceImpl.getAdd(num1,num2);
        //return String.format("%d + %d = %d", num1, num2, (num1 + num2));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/sub/{num1}/{num2}",produces = "application/json")
    @ApiOperation("Subtract two numbers passed as path variables")
    public Response sub(@PathVariable("num1")int num1 , @PathVariable("num2") int num2){
        return calServiceImpl.getSub(num1, num2);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/mul/{num1}/{num2}",produces = "application/json")
    @ApiOperation("Multiply two numbers passed as path variables")
    public Response mul(@PathVariable("num1")int num1 , @PathVariable("num2") int num2){
        return calServiceImpl.getMultiply(num1, num2);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/div/{num1}/{num2}",produces = "application/json")
    @ApiOperation("Divide two numbers passed as path variables")
    public Response div(@PathVariable("num1")int num1 , @PathVariable("num2") int num2){
        return calServiceImpl.getDivide(num1, num2);
    }
}
