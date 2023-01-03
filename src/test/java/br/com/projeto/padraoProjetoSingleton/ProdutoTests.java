package br.com.projeto.padraoProjetoSingleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.padraoProjetoSingleton.produto.Produto;

@SpringBootTest
class ProdutoTests {

	Produto produtoPrimeiraInstancia = Produto.INSTANCE;

	@Test
	void segundaInstanciaUtilizarMesmaInstanciaCriada_quandoSucesso() {

		Produto produtoSegundaInstancia = Produto.INSTANCE;

		assertEquals(produtoPrimeiraInstancia.hashCode(), produtoSegundaInstancia.hashCode());

	}

	@Test
	void terceiraInstanciaUtilizarMesmaInstanciaCriada_quandoSucesso() {

		Produto produtoTerceiraInstancia = Produto.INSTANCE;

		assertEquals(produtoPrimeiraInstancia.hashCode(), produtoTerceiraInstancia.hashCode());

	}

}
