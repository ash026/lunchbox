package com.example.controller;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.service.TiffinServices;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class LunchBoxControllerTest {
	@Mock
	TiffinServices tiffinServices;
	@InjectMocks
	LunchBoxController lunchBoxController;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(lunchBoxController).build();
	}
	
	@Test
	public void sayHiTest() throws Exception {
		mockMvc.perform(get("/lunchbox/")).andExpect(status().isOk()).andExpect(view().name("welcome"));
	}
	
	
}
