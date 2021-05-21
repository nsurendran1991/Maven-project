package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class MavenProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void test(){
	  assertTrue(true);
	}

}
