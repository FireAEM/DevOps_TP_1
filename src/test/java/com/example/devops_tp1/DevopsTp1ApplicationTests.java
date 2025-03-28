package com.example.devops_tp1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DevopsTp1ApplicationTests {

	@Test
	void contextLoads() {
		Car car = new Car("44DD44", "Renault", 30);
		String brand = car.getBrand();
		assertEquals("Renault", brand);
	}

}
