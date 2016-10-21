package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.CompraItens;

public interface ICompraItensService {
	
	void salvar(CompraItens comprasitens);

	void atualizar(CompraItens comprasitens);

	void excluir(Integer codigo);
	
	List<CompraItens> buscarTodos();
	
	public CompraItens buscarPorId(Integer codigo);

}
