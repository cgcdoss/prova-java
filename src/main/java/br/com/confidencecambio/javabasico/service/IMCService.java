package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Component;

@Component
public class IMCService {

    public double retornarIMC(double altura, double peso) {
    	double imc = peso / Math.pow(altura, 2);
    	return Math.round(imc * 100.0) / 100.0;
    }
}
