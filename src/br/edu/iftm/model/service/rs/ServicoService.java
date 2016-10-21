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

import br.edu.iftm.model.dao.IServicoDao;
import br.edu.iftm.model.domain.Servico;
import br.edu.iftm.model.service.IServicoService;

@Path("/servico")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ServicoService implements IServicoService {

	@Inject
	private IServicoDao servicoDao;

	@Override
	@POST
	public void salvar(Servico servico) {
		servicoDao.salvar(servico);
	}

	@Override
	@PUT
	public void atualizar(Servico servico) {
		servicoDao.atualizar(servico);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo") Integer codigo) {
		servicoDao.excluir(codigo);
	}
	
	@GET
	@Override
	@Path("/{codigo}")
	public Servico buscarPorId(@PathParam("codigo") Integer codigo) {
		return servicoDao.buscarPorId(codigo);
	}

	@Override
	@GET
	public List<Servico> buscarTodos() {
		return servicoDao.buscar(new Servico());
	}
}