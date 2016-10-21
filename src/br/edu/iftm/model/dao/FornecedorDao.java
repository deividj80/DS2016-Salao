package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.ContasReceber;
import br.edu.iftm.model.domain.Fornecedor;

public class FornecedorDao implements IFornecedorDao {
	

	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(Fornecedor fornecedor) {
		entityManager.persist(fornecedor);
		
	}

	@Override
	@Transactional
	public void atualizar(Fornecedor fornecedor) {
		Fornecedor merge = entityManager.merge(fornecedor);
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
	public List<Fornecedor> buscar(Fornecedor fornecedor) {
		Query query = entityManager.createQuery("from Fornecedor");
		return query.getResultList();
	}

	@Override
	public Fornecedor buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from Fornecedor where idfornecedor = :idfornecedor");
		query.setParameter("idfornecedor",id);
		return (Fornecedor)query.getSingleResult();
	}

}
