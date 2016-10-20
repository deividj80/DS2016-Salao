package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Categoria;
import br.edu.iftm.model.domain.Cliente;

public class ClienteDao implements IClienteDao{

	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(Cliente cliente) {
		entityManager.persist(cliente);
		
	}

	@Override
	@Transactional
	public void atualizar(Cliente cliente) {
		Cliente merge = entityManager.merge(cliente);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idcliente) {
		
		Categoria cliente = entityManager.find(Categoria.class, idcliente);				
		entityManager.remove(cliente);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Cliente> buscar(Cliente cliente) {
		Query query = entityManager.createQuery("from cliente");
		return query.getResultList();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from cliente where idcliente = :idcliente");
		query.setParameter("idcliente",id);
		return (Cliente)query.getSingleResult();
	}

}
