package com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloService {
	@Path("/john")
	@GET
	@Produces("text/plain")	// 提供資料的形式, text/plain -> 純文字
	public String HelloJohn() {
		return "Hello John";
	}
}
