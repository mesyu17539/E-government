package com.project.web.person;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {
		"classpath:META-INF/*-context.xml"
	}
)
@WebAppConfiguration()
public class PersonControllerTest {
	//@Autowired ServletContext context;
	@Autowired PersonService service;
	@Test
	public void testHome() {
		Map<String,String> map = new HashMap<>();
		//String path = context.getContextPath();
		String result = "존재하지 않습니다.";
		map.put("type", "member");
		map.put("id", "id");
		map.put("pass", "pass");
		map.put("data1", "anti2110");
		map.put("data2", "4512");
		
		if(service.exist(map) == 1) {
			result = "존재합니다.";
		}
		assertEquals("존재합니다.", result);
	}

}
