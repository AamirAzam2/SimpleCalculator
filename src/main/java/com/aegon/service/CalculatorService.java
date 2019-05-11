package com.aegon.service;

import com.aegon.model.Response;

public interface CalculatorService {
    Response getAdd(int firstNumber, int SecondNumber);
    Response getSub(int firstNumber, int SecondNumber);
    Response getMultiply(int firstNumber, int SecondNumber);
    Response getDivide(int firstNumber, int SecondNumber);


}

