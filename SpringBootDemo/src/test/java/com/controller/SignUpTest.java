package com.controller;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.entity.User;
import com.controller.UserController;

//import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.*;

public class SignUpTest extends SpringTest{
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private static MockMvc mvc;
	
	@Before
	public void setup() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	@Test
	public void signupTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/user/add")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content("{\"email\" : \"c@c.com\", \"password\" : \"u\",\"name\" : \"ujjval\", \"lastname\" : \"soni\",\"age\" : \"100\",\"gender\" : \"male\"}")
				.accept(MediaType.APPLICATION_JSON));
				
	}
}
