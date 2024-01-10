package com.promineotech.dogrescue.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

import com.promineotech.dogrescue.DogRescueApplication;
import com.promineotech.dogrescue.controller.model.DogData;

@SpringBootTest(webEnvironment = WebEnvironment.NONE, classes = DogRescueApplication.class)
@ActiveProfiles("test")
@Sql(scripts = {"classpath:schema.sql"})
@SqlConfig(encoding = "utf-8")
public class DogControllerTest extends RescueServiceTestSupport {

	@Test
	public void testInsertLocation() {
		DogData request = builderInsertDog(1);
		DogData expected = builderInsertDog(1);
		
		ResponseEntity<DogData> response = insertDog(request);
		DogData actual = response.getBody();
		HttpStatusCode status = response.getStatusCode();
		int statusCode = status.value();
		// boolean results = actual.equals(expected);
		
		// assertEquals(true, results);
		assertEquals(statusCode, 200);
	}
}
