package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.ServicoDao;
import br.edu.iftm.model.domain.Servico;
import br.edu.iftm.model.service.IServicoService;

@WebService(serviceName="ws/servico")
public class ServicoService implements IServicoService {
		
	@Inject
	private ServicoDao servicoDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="servico") Servico servico) {
		servicoDao.salvar(servico);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="servico") Servico servico) {
		servicoDao.atualizar(servico);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idservico") Integer codigo) {
		servicoDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<Servico> buscarTodos() {
		return servicoDao.buscar(new Servico());
	}

	@Override
	@WebMethod
	public Servico buscarPorId(@WebParam(name="idservico") Integer codigo) {
		return servicoDao.buscarPorId(codigo);
	}

}
