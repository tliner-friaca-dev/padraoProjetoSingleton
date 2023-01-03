package br.com.projeto.padraoProjetoSingleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.padraoProjetoSingleton.log.ArquivoLog;

@SpringBootTest
class ArquivoLogTests {

	ArquivoLog arquivoLogPrimeiraInstancia = ArquivoLog.getInstance();

	@Test
	void segundaInstanciaUtilizarMesmaInstanciaCriada_quandoSucesso() {

		ArquivoLog arquivoLogSegundaInstancia = ArquivoLog.getInstance();

		assertEquals(arquivoLogPrimeiraInstancia.hashCode(), arquivoLogSegundaInstancia.hashCode());

	}

	@Test
	void terceiraInstanciaUtilizarMesmaInstanciaCriada_quandoSucesso() {

		ArquivoLog arquivoLogTerceiraInstancia = ArquivoLog.getInstance();

		assertEquals(arquivoLogPrimeiraInstancia.hashCode(), arquivoLogTerceiraInstancia.hashCode());

	}

}
