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

import br.edu.iftm.model.dao.IContasPagarDao;
import br.edu.iftm.model.domain.ContasPagar;
import br.edu.iftm.model.service.IContasPagarService;

@Path("/contaspagar")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ContasPagarService implements IContasPagarService {

	@Inject
	private IContasPagarDao contaspagarDao;

	@Override
	@POST
	public void salvar(ContasPagar contaspagar) {
		contaspagarDao.salvar(contaspagar);
	}

	@Override
	@PUT
	public void atualizar(ContasPagar contaspagar) {
		contaspagarDao.atualizar(contaspagar);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo") Integer codigo) {
		contaspagarDao.excluir(codigo);
	}
	
	@GET
	@Override
	@Path("/{codigo}")
	public ContasPagar buscarPorId(@PathParam("codigo") Integer codigo) {
		return contaspagarDao.buscarPorId(codigo);
	}

	@Override
	@GET
	public List<ContasPagar> buscarTodos() {
		return contaspagarDao.buscar(new ContasPagar());
	}
}