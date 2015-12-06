package com.sapient.spring.boot.jersey.res;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.sapient.spring.boot.jersey.JerseyApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(JerseyApplication.class)
@WebIntegrationTest(randomPort=true)
public class SecurityResourceTest {
	
	@Value("${local.server.port}")
	private int port;
	
	private RestTemplate restTemplate=new TestRestTemplate();

	@Test
	public void pingtest() {
		ResponseEntity<String> pingResponse=restTemplate.getForEntity("http://localhost:"+port+"/trade/ping", String.class);
		assertEquals(HttpStatus.OK,pingResponse.getStatusCode());
	}

}
