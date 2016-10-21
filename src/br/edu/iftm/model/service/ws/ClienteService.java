package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.ClienteDao;
import br.edu.iftm.model.domain.Cliente;
import br.edu.iftm.model.service.IClienteService;

@WebService(serviceName="ws/cliente")
public class ClienteService implements IClienteService {
		
	@Inject
	private ClienteDao clienteDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="cliente") Cliente cliente) {
		clienteDao.salvar(cliente);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="cliente") Cliente cliente) {
		clienteDao.atualizar(cliente);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idcliente") Integer codigo) {
		clienteDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<Cliente> buscarTodos() {
		return clienteDao.buscar(new Cliente());
	}

	@Override
	@WebMethod
	public Cliente buscarPorId(@WebParam(name="idcliente") Integer codigo) {
		return clienteDao.buscarPorId(codigo);
	}

}
