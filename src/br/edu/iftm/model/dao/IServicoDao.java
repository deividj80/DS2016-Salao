package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.Servico;

public interface IServicoDao {
	
	void salvar(Servico servico);

	void atualizar(Servico servico);

	void excluir(Integer id);

	List<Servico> buscar(Servico servico);

	Servico buscarPorId(Integer id);

}
