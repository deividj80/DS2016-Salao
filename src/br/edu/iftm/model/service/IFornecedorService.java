package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.Fornecedor;

public interface IFornecedorService {
	
	void salvar(Fornecedor fornecedor);

	void atualizar(Fornecedor fornecedor);

	void excluir(Integer codigo);
	
	List<Fornecedor> buscarTodos();
	
	public Fornecedor buscarPorId(Integer codigo);

}
