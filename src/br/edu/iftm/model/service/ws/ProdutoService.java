package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.ProdutoDao;
import br.edu.iftm.model.domain.Produto;
import br.edu.iftm.model.service.IProdutoService;

@WebService(serviceName="ws/produto")
public class ProdutoService implements IProdutoService {
		
	@Inject
	private ProdutoDao produtoDao ;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="produto") Produto produto) {
		produtoDao.salvar(produto);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="produto") Produto produto) {
		produtoDao.atualizar(produto);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="idproduto") Integer codigo) {
		produtoDao.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<Produto> buscarTodos() {
		return produtoDao.buscar(new Produto());
	}

	@Override
	@WebMethod
	public Produto buscarPorId(@WebParam(name="idproduto") Integer codigo) {
		return produtoDao.buscarPorId(codigo);
	}

}
