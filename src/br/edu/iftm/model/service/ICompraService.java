package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.Compra;

public interface ICompraService {
	
	void salvar(Compra compra);

	void atualizar(Compra compra);

	void excluir(Integer codigo);
	
	List<Compra> buscarTodos();
	
	public Compra buscarPorId(Integer codigo);

}
