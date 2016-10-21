package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.ContasReceber;

public class ContasReceberDao implements IContasReceberDao {
	
	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(ContasReceber contasReceber) {
		entityManager.persist(contasReceber);
		
	}

	@Override
	@Transactional
	public void atualizar(ContasReceber contasReceber) {
		ContasReceber merge = entityManager.merge(contasReceber);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idcontasreceber) {
		
		ContasReceber contasReceber = entityManager.find(ContasReceber.class, idcontasreceber);				
		entityManager.remove(contasReceber);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ContasReceber> buscar(ContasReceber contasReceber) {
		Query query = entityManager.createQuery("from Contas_receber");
		return query.getResultList();
	}

	@Override
	public ContasReceber buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from Contas_receber where idcontasreceber = :idcontasreceber");
		query.setParameter("idcontasreceber",id);
		return (ContasReceber)query.getSingleResult();
	}
}
