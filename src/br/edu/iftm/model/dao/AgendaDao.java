package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Agenda;

public class AgendaDao implements IAgendaDao{
	
	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(Agenda agenda) {
		entityManager.persist(agenda);
		
	}

	@Override
	@Transactional
	public void atualizar(Agenda agenda) {
		Agenda merge = entityManager.merge(agenda);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idagenda) {
		
		Agenda agenda = entityManager.find(Agenda.class, idagenda);				
		entityManager.remove(agenda);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Agenda> buscar(Agenda agenda) {
		Query query = entityManager.createQuery("from Agenda");
		return query.getResultList();
	}

	@Override
	public Agenda buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from Agenda where idagenda = :idagenda");
		query.setParameter("idagenda",id);
		return (Agenda)query.getSingleResult();
	}

}
