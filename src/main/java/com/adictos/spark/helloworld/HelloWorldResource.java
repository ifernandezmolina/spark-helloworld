package com.adictos.spark.helloworld;

import static spark.Spark.get;
import static spark.Spark.port;

public class HelloWorldResource {
	public static void main(String[] args) {
		port(8080);
		get("/helloworld", (req, res) ->
		{		
			res.status(200);
			res.type("application/json");
			return "{\"message\": \"Hello " + req.queryParams("name") + "\"}";
		});
		
	}	
}
