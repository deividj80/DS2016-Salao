package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.ContasPagar;

public interface IContasPagarDao {
	
	void salvar(ContasPagar contasPagar);

	void atualizar(ContasPagar contasPagar);

	void excluir(Integer id);

	List<ContasPagar> buscar(ContasPagar contasPagar);

	ContasPagar buscarPorId(Integer id);

}
