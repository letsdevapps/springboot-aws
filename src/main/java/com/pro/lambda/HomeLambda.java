package com.pro.lambda;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HomeLambda implements RequestHandler<Map<String, Object>, String> {

	@Override
	public String handleRequest(Map<String, Object> input, Context context) {
		return "----- Springboot AWS | Lambda | Home -----";
	}
}
