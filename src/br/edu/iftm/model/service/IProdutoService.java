package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.Produto;

public interface IProdutoService {
	
	void salvar(Produto produto);

	void atualizar(Produto produto);

	void excluir(Integer codigo);
	
	List<Produto> buscarTodos();
	
	public Produto buscarPorId(Integer codigo);

}
