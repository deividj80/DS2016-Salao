package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.CompraItens;

public class CompraItensDao implements ICompraItensDao {
	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(CompraItens compraItens) {
		entityManager.persist(compraItens);
		
	}

	@Override
	@Transactional
	public void atualizar(CompraItens compraItens) {
		CompraItens merge = entityManager.merge(compraItens);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idcompra) {
		
		CompraItens compraItens = entityManager.find(CompraItens.class, idcompra);				
		entityManager.remove(compraItens);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<CompraItens> buscar(CompraItens compraItens) {
		Query query = entityManager.createQuery("from Compra_itens");
		return query.getResultList();
	}

	@Override
	public CompraItens buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from Compra_itens where idcompraitens = :idcompraitens");
		query.setParameter("idcompraitens",id);
		return (CompraItens)query.getSingleResult();
	}
}
