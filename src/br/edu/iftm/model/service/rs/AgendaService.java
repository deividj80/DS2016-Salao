package br.edu.iftm.model.service.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.iftm.model.dao.IAgendaDao;
import br.edu.iftm.model.domain.Agenda;
import br.edu.iftm.model.service.IAgendaService;

@Path("/agenda")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class AgendaService implements IAgendaService {

	@Inject
	private IAgendaDao agendaDao;

	@Override
	@POST
	public void salvar(Agenda agenda) {
		agendaDao.salvar(agenda);
	}

	@Override
	@PUT
	public void atualizar(Agenda agenda) {
		agendaDao.atualizar(agenda);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo") Integer codigo) {
		agendaDao.excluir(codigo);
	}
	
	@GET
	@Override
	@Path("/{codigo}")
	public Agenda buscarPorId(@PathParam("codigo") Integer codigo) {
		return agendaDao.buscarPorId(codigo);
	}

	@Override
	@GET
	public List<Agenda> buscarTodos() {
		return agendaDao.buscar(new Agenda());
	}
}