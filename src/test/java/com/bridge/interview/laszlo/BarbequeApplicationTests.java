package com.bridge.interview.laszlo;

import com.bridge.interview.laszlo.dto.Current;
import com.bridge.interview.laszlo.dto.Rain;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,
		classes = BarbequeApplication.class)
@AutoConfigureMockMvc
public class BarbequeApplicationTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private Rain rain;
	private Current current;

	@Test
	public void e2e_thenStatus200_andContainsBarbeque() throws Exception {
		mvc.perform(get("/barbeque")).andExpect(status().isOk())
				.andExpect(content().string(containsString("BARBEQUE")));;
	}

//	@Test
//	public void givenRainChanceLowHighTemp_thenNoBarbeque() throws Exception {
//		when(rain.getChance()).thenReturn((float) 0.1);
//		when(current.getTemp()).thenReturn((float) 30);
//		mvc.perform(get("/barbeque")).andExpect(status().isOk())
//				.andExpect(content().string(containsString("BARBEQUE TIME!")));;
//	}
}
