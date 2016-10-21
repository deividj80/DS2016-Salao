package br.edu.iftm.model.dao;

import java.util.List;

import javax.persistence.*;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Categoria;

public class CategoriaDao implements ICategoriaDao{
	
	@PersistenceContext(unitName="DS2016-Salao")
	private EntityManager entityManager;
	

	@Override
	@Transactional
	public void salvar(Categoria categoria) {
		entityManager.persist(categoria);
		
	}

	@Override
	@Transactional
	public void atualizar(Categoria categoria) {
		Categoria merge = entityManager.merge(categoria);
		entityManager.persist(merge);
		
	}

	@Override	
	@Transactional
	public void excluir(Integer idcategoria) {
		
		Categoria categoria = entityManager.find(Categoria.class, idcategoria);				
		entityManager.remove(categoria);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Categoria> buscar(Categoria categoria) {
		Query query = entityManager.createQuery("from Categoria");
		return query.getResultList();
	}

	
	public Categoria buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from Categoria where idcategoria = :idcat");
		query.setParameter("idcat",id);
		return (Categoria)query.getSingleResult();
	}

}
