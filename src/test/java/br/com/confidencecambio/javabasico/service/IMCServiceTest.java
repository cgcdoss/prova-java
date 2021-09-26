package br.com.confidencecambio.javabasico.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class IMCServiceTest {

	private IMCService service;

	@BeforeEach
	public void init() {
		service = new IMCService();
	}

	@Test
	public void quandoPassarUmNomeQueroEleDeResposta() {
		double imc = 25.95;
		double valorValido = service.retornarIMC(1.70, 75);
		assertEquals(imc, valorValido, 0);
	}

}
