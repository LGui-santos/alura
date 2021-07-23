package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.model.Produto;

public class ProdutoDao {
	
	private EntityManager entityManager;

	public ProdutoDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void create(Produto produto) {
		this.entityManager.persist(produto);
	}

}
