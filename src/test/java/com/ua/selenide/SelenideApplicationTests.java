package com.ua.selenide;

import com.ua.selenide.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SelenideApplicationTests {

	@Autowired
	private HomePage landingPage;

	@Test
	void contextLoads() {
		landingPage.open()
				.search("iphone 14 pro max");
	}

}
