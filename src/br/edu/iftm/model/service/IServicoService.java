package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.Servico;

public interface IServicoService {
	
	void salvar(Servico servico);

	void atualizar(Servico servico);

	void excluir(Integer codigo);
	
	List<Servico> buscarTodos();
	
	public Servico buscarPorId(Integer codigo);

}
