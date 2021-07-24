package br.com.alura.loja.test;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.model.Categoria;
import br.com.alura.loja.model.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		Categoria celulares = new Categoria("CELULARES");

		Produto celular = new Produto("Xiaomi Mi 9", "Octacore 2.2Ghz", 500, celulares);

		Produto celular2 = new Produto("Xiaomi Mi 10", "Octacore 2.0Ghz", 900, celulares);

		EntityManager entityManager = JPAUtil.getEntityManager();

		ProdutoDao produtoDao = new ProdutoDao(entityManager);
		CategoriaDao categoriaDao = new CategoriaDao(entityManager);

		entityManager.getTransaction().begin();

		categoriaDao.create(celulares);
		produtoDao.create(celular);
		produtoDao.create(celular2);

		entityManager.getTransaction().commit();

		entityManager.close();

	}

}