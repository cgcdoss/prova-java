package br.com.confidencecambio.javabasico.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModeloTest {

	private Modelo modelo;

	@BeforeEach
	public void init() {
		modelo = new Modelo("João Soares Silva");
	}

	@Test
	public void naoPodeSerNulo() {
		IllegalArgumentException thrown = assertThrows(
				IllegalArgumentException.class, 
				() -> modelo.setNome(null),
				"Nome inválido");

		assertTrue(thrown.getMessage().equals("Nome inválido"));
	}

	@Test
	public void naoPodeSerVazio() {
		IllegalArgumentException thrown = assertThrows(
				IllegalArgumentException.class, 
				() -> modelo.setNome(""),
				"Nome inválido");

		assertTrue(thrown.getMessage().equals("Nome inválido"));
	}

	@Test
	public void deveObterOPrimeiroNome() {
		assertEquals(modelo.getPrimeiroNome(), "João");
	}

	@Test
	public void deveObterOUltimoNome() {
		assertEquals(modelo.getUltimoNome(), "Soares Silva");
	}

	@Test
	public void deveObterONomeMaiusculo() {
		assertEquals(modelo.getUppercaseNome(), "JOÃO SOARES SILVA");
	}

	@Test
	public void deveObterONomeAbreviado() {
		assertEquals(modelo.getNomeAbreviado(), "João S. Silva");
	}

}
