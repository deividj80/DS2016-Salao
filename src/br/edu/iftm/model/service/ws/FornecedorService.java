package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.FornecedorDao;
import br.edu.iftm.model.domain.Fornecedor;
import br.edu.iftm.model.service.IFornecedorService;

@WebService(serviceName="ws/fornecedor")
public class FornecedorService implements IFornecedorService {
		
	@Inject
	private FornecedorDao fornecedorDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="fornecedor") Fornecedor fornecedor) {
		fornecedorDao.salvar(fornecedor);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="forncedor") Fornecedor fornecedor) {
		fornecedorDao.atualizar(fornecedor);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idfornecedor") Integer codigo) {
		fornecedorDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<Fornecedor> buscarTodos() {
		return fornecedorDao.buscar(new Fornecedor());
	}

	@Override
	@WebMethod
	public Fornecedor buscarPorId(@WebParam(name="idfornecedor") Integer codigo) {
		return fornecedorDao.buscarPorId(codigo);
	}

}
