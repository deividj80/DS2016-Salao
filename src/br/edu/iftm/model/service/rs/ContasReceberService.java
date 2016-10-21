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

import br.edu.iftm.model.dao.IContasReceberDao;
import br.edu.iftm.model.domain.ContasReceber;
import br.edu.iftm.model.service.IContasReceberService;

@Path("/contasreceber")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ContasReceberService implements IContasReceberService {

	@Inject
	private IContasReceberDao contasreceberDao;

	@Override
	@POST
	public void salvar(ContasReceber contasreceber) {
		contasreceberDao.salvar(contasreceber);
	}

	@Override
	@PUT
	public void atualizar(ContasReceber contasreceber) {
		contasreceberDao.atualizar(contasreceber);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo") Integer codigo) {
		contasreceberDao.excluir(codigo);
	}
	
	@GET
	@Override
	@Path("/{codigo}")
	public ContasReceber buscarPorId(@PathParam("codigo") Integer codigo) {
		return contasreceberDao.buscarPorId(codigo);
	}

	@Override
	@GET
	public List<ContasReceber> buscarTodos() {
		return contasreceberDao.buscar(new ContasReceber());
	}
}