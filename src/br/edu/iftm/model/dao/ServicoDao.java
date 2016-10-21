package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Servico;

public class ServicoDao implements IServicoDao {
	
	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(Servico servico) {
		entityManager.persist(servico);
		
	}

	@Override
	@Transactional
	public void atualizar(Servico servico) {
		Servico merge = entityManager.merge(servico);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idservico) {
		
		Servico servico = entityManager.find(Servico.class, idservico);				
		entityManager.remove(servico);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Servico> buscar(Servico servico) {
		Query query = entityManager.createQuery("from servico");
		return query.getResultList();
	}

	@Override
	public Servico buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from servico where idservico = :idservico");
		query.setParameter("idservico",id);
		return (Servico)query.getSingleResult();
	}
}
