package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.ContasPagar;

public class ContasPagarDao implements IContasPagarDao {
	
	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(ContasPagar contasPagar) {
		entityManager.persist(contasPagar);
		
	}

	@Override
	@Transactional
	public void atualizar(ContasPagar contasPagar) {
		ContasPagar merge = entityManager.merge(contasPagar);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idcontaspagar) {
		
		ContasPagar contaspagar = entityManager.find(ContasPagar.class, idcontaspagar);				
		entityManager.remove(contaspagar);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ContasPagar> buscar(ContasPagar contasPagar) {
		Query query = entityManager.createQuery("from Contas_pagar");
		return query.getResultList();
	}

	@Override
	public ContasPagar buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from Contas_pagar where idcontaspagar = :idcontaspagar");
		query.setParameter("idcontaspagar",id);
		return (ContasPagar)query.getSingleResult();
	}
}
