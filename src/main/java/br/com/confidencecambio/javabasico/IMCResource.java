package br.com.confidencecambio.javabasico;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.model.Imc;
import br.com.confidencecambio.javabasico.service.IMCService;

@RestController
public class IMCResource {

	private IMCService service;

	public IMCResource(final IMCService service) {
		this.service = service;
	}

	@RequestMapping(value = "/imc", method = RequestMethod.GET)
	public ResponseEntity<Double> getImc(@RequestParam double altura, @RequestParam double peso) {
		var retorno = service.retornarIMC(altura, peso);
		return new ResponseEntity<Double>(retorno, HttpStatus.OK);
	}

	@RequestMapping(value = "/imc", method = RequestMethod.POST)
	public ResponseEntity<Double> postImc(@RequestBody Imc imc) {
		var retorno = service.retornarIMC(imc.getAltura(), imc.getPeso());
		return new ResponseEntity<Double>(retorno, HttpStatus.OK);
	}
}
