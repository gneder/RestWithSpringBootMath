package br.com.neder.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class MathControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void sumReturnsCorrectResult() {
		Double result = restTemplate.getForObject("/sun/3/4", Double.class);
		assertEquals(7.0, result);
	}

	@Test
	void subtractionReturnsCorrectResult() {
		Double result = restTemplate.getForObject("/subtration/10/4", Double.class);
		assertEquals(6.0, result);
	}

	@Test
	void multiplicationReturnsCorrectResult() {
		Double result = restTemplate.getForObject("/multiplication/3/4", Double.class);
		assertEquals(12.0, result);
	}

	@Test
	void divisionReturnsCorrectResult() {
		Double result = restTemplate.getForObject("/division/12/4", Double.class);
		assertEquals(3.0, result);
	}

	@Test
	void squareRootReturnsCorrectResult() {
		Double result = restTemplate.getForObject("/squareRoot/9", Double.class);
		assertEquals(3.0, result);
	}

	@Test
	void nonNumericInputReturnsBadRequest() {
		ResponseEntity<String> response = restTemplate.getForEntity("/sun/abc/4", String.class);
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
	}
}
