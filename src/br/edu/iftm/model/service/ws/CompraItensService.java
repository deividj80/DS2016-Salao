package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.CompraItensDao;
import br.edu.iftm.model.domain.CompraItens;
import br.edu.iftm.model.service.ICompraItensService;

@WebService(serviceName="ws/compraitens")
public class CompraItensService implements ICompraItensService {
		
	@Inject
	private CompraItensDao compraitensDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="compraitens") CompraItens compraitens) {
		compraitensDao.salvar(compraitens);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="compraitens") CompraItens compraitens) {
		compraitensDao.atualizar(compraitens);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idcompraitens") Integer codigo) {
		compraitensDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<CompraItens> buscarTodos() {
		return compraitensDao.buscar(new CompraItens());
	}

	@Override
	@WebMethod
	public CompraItens buscarPorId(@WebParam(name="idcompraitens") Integer codigo) {
		return compraitensDao.buscarPorId(codigo);
	}

}
