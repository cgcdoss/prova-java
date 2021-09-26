package br.com.confidencecambio.javabasico.model;

public class Modelo {

	private String nome;

	public Modelo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!isNomeValido(nome)) {
			throw new IllegalArgumentException("Nome inválido");
		}

		this.nome = nome;
	}

	public boolean isNomeValido(String nome) {
		if (nome == null) {
			return false;
		}
		if (nome.trim().isEmpty()) {
			return false;
		}

		return true;
	}

	public String getPrimeiroNome() {
		return nome.substring(0, nome.indexOf(" "));
	}

	public String getUltimoNome() {
		return nome.substring(nome.indexOf(" ") + 1, nome.length());
	}

	public String getUppercaseNome() {
		return nome.toUpperCase();
	}

	public String getNomeAbreviado() {
		String[] nomes = nome.split(" ");
		String primeiroNome = nomes[0];
		String ultimoNome = " " + nomes[nomes.length - 1];
		String nomeDoMeio = "";
		
		for(String nome: nomes) {
			if (primeiroNome.contains(nome) || ultimoNome.contains(nome)) {
				continue;
			}
			nomeDoMeio += " " + nome.substring(0, 1) + ".";
		}
		
		return primeiroNome + nomeDoMeio + ultimoNome;
	}

}
