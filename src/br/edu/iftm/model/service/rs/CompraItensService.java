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

import br.edu.iftm.model.dao.ICompraItensDao;
import br.edu.iftm.model.domain.CompraItens;
import br.edu.iftm.model.service.ICompraItensService;

@Path("/compraitens")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class CompraItensService implements ICompraItensService {

	@Inject
	private ICompraItensDao compraitensDao;

	@Override
	@POST
	public void salvar(CompraItens compraitens) {
		compraitensDao.salvar(compraitens);
	}

	@Override
	@PUT
	public void atualizar(CompraItens compraitens) {
		compraitensDao.atualizar(compraitens);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo") Integer codigo) {
		compraitensDao.excluir(codigo);
	}
	
	@GET
	@Override
	@Path("/{codigo}")
	public CompraItens buscarPorId(@PathParam("codigo") Integer codigo) {
		return compraitensDao.buscarPorId(codigo);
	}

	@Override
	@GET
	public List<CompraItens> buscarTodos() {
		return compraitensDao.buscar(new CompraItens());
	}
}