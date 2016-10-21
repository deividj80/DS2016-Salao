package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.CompraDao;
import br.edu.iftm.model.domain.Compra;
import br.edu.iftm.model.service.ICompraService;

@WebService(serviceName="ws/compra")
public class CompraService implements ICompraService {
		
	@Inject
	private CompraDao compraDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="compra") Compra compra) {
		compraDao.salvar(compra);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="compra") Compra compra) {
		compraDao.atualizar(compra);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idcompra") Integer codigo) {
		compraDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<Compra> buscarTodos() {
		return compraDao.buscar(new Compra());
	}

	@Override
	@WebMethod
	public Compra buscarPorId(@WebParam(name="idcompra") Integer codigo) {
		return compraDao.buscarPorId(codigo);
	}

}
