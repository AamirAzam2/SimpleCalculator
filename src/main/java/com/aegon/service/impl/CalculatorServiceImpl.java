package com.aegon.service.impl;

import com.aegon.model.Response;
import com.aegon.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Response getAdd( int firstNumber , int secondNumber) {
        Response response = new Response(firstNumber, secondNumber, 0 , "+");
        response.setAnswer(firstNumber + secondNumber);
        return response;
    }


    @Override
    public Response getSub( int firstNumber , int secondNumber) {
        Response response = new Response(firstNumber, secondNumber, 0 , "-");
        response.setAnswer(firstNumber - secondNumber);
        return response;
    }

    @Override
    public Response getMultiply( int firstNumber , int secondNumber) {
        Response response = new Response(firstNumber, secondNumber, 0 , "*");
        response.setAnswer(firstNumber * secondNumber);
        return response;
    }

    @Override
    public Response getDivide( int firstNumber , int secondNumber) {
        Response response = new Response(firstNumber, secondNumber, 0 , "/");
        try {
            response.setAnswer(firstNumber / secondNumber);
            return response;
        }catch(ArithmeticException e) {
            e.printStackTrace();
            return response;
        }
    }

}

