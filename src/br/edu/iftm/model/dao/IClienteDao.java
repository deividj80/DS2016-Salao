package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.Cliente;

public interface IClienteDao {
	
	void salvar(Cliente cliente);

	void atualizar(Cliente cliente);

	void excluir(Integer id);

	List<Cliente> buscar(Cliente cliente);

	Cliente buscarPorId(Integer id);

}
