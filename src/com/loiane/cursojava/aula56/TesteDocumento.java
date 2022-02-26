package com.loiane.cursojava.aula56;

public class TesteDocumento {

	public static void main(String[] args) {

		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}

		System.out.println();

		Pessoa pessoaFisica = new Pessoa();
		pessoaFisica.setTipoDocumento(TipoDocumento.CPF);
		pessoaFisica.setNumeroDocumento(pessoaFisica.getTipoDocumento().geraNumeroTeste());
		System.out.println(pessoaFisica);

		Pessoa pessoaJuridica = new Pessoa();
		pessoaJuridica.setTipoDocumento(TipoDocumento.CNPJ);
		pessoaJuridica.setNumeroDocumento(pessoaJuridica.getTipoDocumento().geraNumeroTeste());
		System.out.println(pessoaJuridica);

	}

}
