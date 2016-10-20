package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.Agenda;

public interface IAgendaDao {
	
	void salvar(Agenda agenda);

	void atualizar(Agenda agenda);

	void excluir(Integer id);

	List<Agenda> buscar(Agenda agenda);

	Agenda buscarPorId(Integer id);

}
