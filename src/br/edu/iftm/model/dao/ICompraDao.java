package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.Compra;

public interface ICompraDao {
	
	void salvar(Compra compra);

	void atualizar(Compra compra);

	void excluir(Integer id);

	List<Compra> buscar(Compra compra);

	Compra buscarPorId(Integer id);
}
