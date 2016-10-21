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

import br.edu.iftm.model.dao.ICompraDao;
import br.edu.iftm.model.domain.Compra;
import br.edu.iftm.model.service.ICompraService;

@Path("/compra")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class CompraService implements ICompraService {

	@Inject
	private ICompraDao compraDao;

	@Override
	@POST
	public void salvar(Compra compra) {
		compraDao.salvar(compra);
	}

	@Override
	@PUT
	public void atualizar(Compra compra) {
		compraDao.atualizar(compra);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo") Integer codigo) {
		compraDao.excluir(codigo);
	}
	
	@GET
	@Override
	@Path("/{codigo}")
	public Compra buscarPorId(@PathParam("codigo") Integer codigo) {
		return compraDao.buscarPorId(codigo);
	}

	@Override
	@GET
	public List<Compra> buscarTodos() {
		return compraDao.buscar(new Compra());
	}
}