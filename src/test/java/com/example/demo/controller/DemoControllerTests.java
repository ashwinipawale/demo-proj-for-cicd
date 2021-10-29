package com.example.demo.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest(DemoController.class) 
public class DemoControllerTests {
	  @Autowired 
	  private MockMvc mockMvc;
	  
	  @InjectMocks 
	  private DemoController controller;
	  
	  @Before 
	  public void setup() { 
	  this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build(); 
		  }
	  
	  @Test
	  public void demoMethodShouldReturnTestMessage() throws Exception {
		  this.mockMvc.perform(get("/demo")).andDo(print()).andExpect(status().isOk())
			.andExpect(content().string(containsString("<h1>This is a test message from Demo application</h1>")));
	  }
}
