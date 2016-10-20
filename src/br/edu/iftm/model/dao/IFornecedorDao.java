package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.Fornecedor;

public interface IFornecedorDao {
	
	void salvar(Fornecedor fornecedor);

	void atualizar(Fornecedor fornecedor);

	void excluir(Integer id);

	List<Fornecedor> buscar(Fornecedor fornecedor);

	Fornecedor buscarPorId(Integer id);

}
