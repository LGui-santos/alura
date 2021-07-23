package br.com.alura.loja.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.model.Produto;

public class CadastroDeProduto {

	public static void main(String[] args) {
	
		Produto celular = new Produto();
		
		celular.setNome("Xiaomi Mi 9");
		celular.setDescricao("Octacore 2.2Ghz");
		celular.setPreco(500);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(celular);
		
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}