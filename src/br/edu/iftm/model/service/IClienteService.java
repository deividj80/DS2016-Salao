package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.Cliente;

public interface IClienteService {
	
	void salvar(Cliente cliente);

	void atualizar(Cliente cliente);

	void excluir(Integer codigo);
	
	List<Cliente> buscarTodos();
	
	public Cliente buscarPorId(Integer codigo);

}
