package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.AgendaDao;
import br.edu.iftm.model.domain.Agenda;
import br.edu.iftm.model.service.IAgendaService;

@WebService(serviceName="ws/agenda")
public class AgendaService implements IAgendaService {
		
	@Inject
	private AgendaDao agendaDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="agenda") Agenda agenda) {
		agendaDao.salvar(agenda);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="agenda") Agenda agenda) {
		agendaDao.atualizar(agenda);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idagenda") Integer codigo) {
		agendaDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<Agenda> buscarTodos() {
		return agendaDao.buscar(new Agenda());
	}

	@Override
	@WebMethod
	public Agenda buscarPorId(@WebParam(name="idagenda") Integer codigo) {
		return agendaDao.buscarPorId(codigo);
	}

}
