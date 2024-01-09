package com.example.tistory;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        return input.toUpperCase();
    }
}
