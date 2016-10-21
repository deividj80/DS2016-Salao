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

import br.edu.iftm.model.dao.IFornecedorDao;
import br.edu.iftm.model.domain.Fornecedor;
import br.edu.iftm.model.service.IFornecedorService;

@Path("/fonecedor")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class FornecedorService implements IFornecedorService {

	@Inject
	private IFornecedorDao fonecedorDao;

	@Override
	@POST
	public void salvar(Fornecedor fonecedor) {
		fonecedorDao.salvar(fonecedor);
	}

	@Override
	@PUT
	public void atualizar(Fornecedor fonecedor) {
		fonecedorDao.atualizar(fonecedor);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo") Integer codigo) {
		fonecedorDao.excluir(codigo);
	}
	
	@GET
	@Override
	@Path("/{codigo}")
	public Fornecedor buscarPorId(@PathParam("codigo") Integer codigo) {
		return fonecedorDao.buscarPorId(codigo);
	}

	@Override
	@GET
	public List<Fornecedor> buscarTodos() {
		return fonecedorDao.buscar(new Fornecedor());
	}
}