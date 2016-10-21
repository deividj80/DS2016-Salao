package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.ContasPagarDao;
import br.edu.iftm.model.domain.ContasPagar;
import br.edu.iftm.model.service.IContasPagarService;

@WebService(serviceName="ws/contaspagar")
public class ContasPagarService implements IContasPagarService {
		
	@Inject
	private ContasPagarDao contasPagarDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="contaspagar") ContasPagar contasPagar) {
		contasPagarDao.salvar(contasPagar);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="contaspagar") ContasPagar contasPagar) {
		contasPagarDao.atualizar(contasPagar);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idcontaspagar") Integer codigo) {
		contasPagarDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<ContasPagar> buscarTodos() {
		return contasPagarDao.buscar(new ContasPagar());
	}

	@Override
	@WebMethod
	public ContasPagar buscarPorId(@WebParam(name="idcontaspagar") Integer codigo) {
		return contasPagarDao.buscarPorId(codigo);
	}

}
