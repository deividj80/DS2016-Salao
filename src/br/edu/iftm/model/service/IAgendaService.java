package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.Agenda;

public interface IAgendaService {
	
	void salvar(Agenda agenda);

	void atualizar(Agenda agenda);

	void excluir(Integer codigo);
	
	List<Agenda> buscarTodos();
	
	public Agenda buscarPorId(Integer codigo);

}
