package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.ContasReceber;

public interface IContasReceberDao {
	
	void salvar(ContasReceber contasReceber);

	void atualizar(ContasReceber contasReceber);

	void excluir(Integer id);

	List<ContasReceber> buscar(ContasReceber contasReceber);

	ContasReceber buscarPorId(Integer id);

}
