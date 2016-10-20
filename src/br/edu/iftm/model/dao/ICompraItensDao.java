package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.CompraItens;

public interface ICompraItensDao {
	
	void salvar(CompraItens compraItens);

	void atualizar(CompraItens compraItens);

	void excluir(Integer id);

	List<CompraItens> buscar(CompraItens compraItens);

	CompraItens buscarPorId(Integer id);

}
