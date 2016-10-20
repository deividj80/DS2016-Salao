package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.Produto;

public interface IProdutoDao {
	
	void salvar(Produto produto);

	void atualizar(Produto produto);

	void excluir(Integer id);

	List<Produto> buscar(Produto produto);

	Produto buscarPorId(Integer id);

}
