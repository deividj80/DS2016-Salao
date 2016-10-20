package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Compra;

public class CompraDao implements ICompraDao {

	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(Compra compra) {
		entityManager.persist(compra);
		
	}

	@Override
	@Transactional
	public void atualizar(Compra compra) {
		Compra merge = entityManager.merge(compra);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idcompra) {
		
		Compra compra = entityManager.find(Compra.class, idcompra);				
		entityManager.remove(compra);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Compra> buscar(Compra compra) {
		Query query = entityManager.createQuery("from compra");
		return query.getResultList();
	}

	@Override
	public Compra buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from cliente where idcompra = :idcompra");
		query.setParameter("idcompra",id);
		return (Compra)query.getSingleResult();
	}

}
