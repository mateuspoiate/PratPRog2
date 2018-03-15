package Paises;

import static org.junit.jupiter.api.Assertions.*;-
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class TestPais {
	Pais pais,copia;
	static int id = 5;
	
	@Before
	public void setUp() throws Exception {
		System.out.println	("Setup");
		pais   = new Pais	(id,"TesteP", 1343490, 24543.00);
		copia  = new Pais	(id, "TesteP", 1343490, 24543.00);
		System.out.println	(pais);
		System.out.println	(copia);
	}
	@Test
	public void testeIncluir() {
		System.out.println	("Incluir");
		pais.incluir(0, null, 0, 0);
		id = pais.getId();
		copia.setId(id);
		assertEquals(pais.getId(),copia.getId(),"TESTE CRIAR");
	}
	@Test
	public void testeAtualizar() {
		System.out.println	("atualizar");
		pais.setNome		(null);
		copia.setNome		(null);
		pais.atualizar(0, null, 0, 0);
		assertEquals(pais.getNome(),copia.getNome(),"TESTE ATUALIZAR");
	}
	@Test
	public void testeExcluir() {
		System.out.println	("Excluir");
		pais.setId(id);
		copia.setId(-1);
		pais.excluir(0);
		assertEquals(pais.getId(),copia.getId(),"TESTE EXCLUIR");
	}
	@Test
	public void testeMaiorPopulacao() {
		System.out.println("Maior populacao");

	    pais.maiorPopulacao();
		long populacao = pais.getPopulacao();
		copia.setPopulacao(populacao);
		assertEquals(pais.getPopulacao(),copia.getPopulacao(),"TESTE MAIOR POPULACAO");
	}	
	@Test
	public void testeMenorArea() {
		System.out.println	("menorArea");
		pais.menorArea();
		double area = pais.getArea();
		copia.setArea(area);
		assertEquals(pais.getArea(),copia.getArea(),"TESTE MENOR AREA");
	}
	public void testVetor() {
		System.out.println	("VETOR DE PAISES");
		String[] vet = pais.vetorPaises();
		assertEquals(vet.length,3,"TESTE VETOR");
	}
}