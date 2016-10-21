package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.ContasReceberDao;
import br.edu.iftm.model.domain.ContasReceber;
import br.edu.iftm.model.service.IContasReceberService;

@WebService(serviceName="ws/contasreceber")
public class ContasReceberService implements IContasReceberService {
		
	@Inject
	private ContasReceberDao contasReceberDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="contasreceber") ContasReceber contasReceber) {
		contasReceberDao.salvar(contasReceber);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="contasreceber") ContasReceber contasReceber) {
		contasReceberDao.atualizar(contasReceber);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idcontasreceber") Integer codigo) {
		contasReceberDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<ContasReceber> buscarTodos() {
		return contasReceberDao.buscar(new ContasReceber());
	}

	@Override
	@WebMethod
	public ContasReceber buscarPorId(@WebParam(name="idcontasreceber") Integer codigo) {
		return contasReceberDao.buscarPorId(codigo);
	}

}
