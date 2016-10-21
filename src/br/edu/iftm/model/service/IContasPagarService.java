package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.ContasPagar;

public interface IContasPagarService {
	
	void salvar(ContasPagar contasPagar);

	void atualizar(ContasPagar contasPagar);

	void excluir(Integer codigo);
	
	List<ContasPagar> buscarTodos();
	
	public ContasPagar buscarPorId(Integer codigo);

}
