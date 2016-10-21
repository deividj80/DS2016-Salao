package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Produto;

public class ProdutoDao implements IProdutoDao {

	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(Produto produto) {
		entityManager.persist(produto);
		
	}

	@Override
	@Transactional
	public void atualizar(Produto produto) {
		Produto merge = entityManager.merge(produto);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idproduto) {
		
		Produto produto = entityManager.find(Produto.class, idproduto);				
		entityManager.remove(produto);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Produto> buscar(Produto produto) {
		Query query = entityManager.createQuery("from Produto");
		return query.getResultList();
	}

	@Override
	public Produto buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from Produto where idproduto = :idproduto");
		query.setParameter("idproduto",id);
		return (Produto)query.getSingleResult();
	}
}
