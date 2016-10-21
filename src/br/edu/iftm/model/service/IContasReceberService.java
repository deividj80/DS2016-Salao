package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.ContasReceber;

public interface IContasReceberService {

	void salvar(ContasReceber contasReceber);

	void atualizar(ContasReceber contasReceber);

	void excluir(Integer codigo);

	List<ContasReceber> buscarTodos();

	public ContasReceber buscarPorId(Integer codigo);

}
