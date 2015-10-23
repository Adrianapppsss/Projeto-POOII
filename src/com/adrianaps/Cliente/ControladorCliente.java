package com.adrianaps.Cliente;

import java.util.ArrayList;

import com.adriana.psExececao.ClienteExisteException;
import com.adriana.psExececao.ErroCadastroDadosException;
import com.adriana.psExececao.PreenchimentoObrigatorioException;
import com.adriana.psExececao.cpfClienteValidoException;
import com.adriana.psExececao.nenhumClienteNovoException;

public class ControladorCliente {
	
	private IRepositorioCliente repositorioCliente;
	
	public ControladorCliente(){
		this.repositorioCliente = new RepositorioClienteList();
	}
	
	public void cadastrar(Cliente cliente) throws PreenchimentoObrigatorioException, ClienteExisteException, cpfClienteValidoException, ErroCadastroDadosException{
		this.repositorioCliente.cadastrar(cliente);
	}
	
	public void atualizar(Cliente cliente) throws nenhumClienteNovoException, PreenchimentoObrigatorioException, ClienteExisteException, cpfClienteValidoException, ErroCadastroDadosException{
		if(this.equals(cliente)){
			this.repositorioCliente.atualizar(cliente);
			
	}
	}
	public boolean remover(String cpf) {
		if(!this.repositorioCliente.equals(cpf)){
			return this.remover(cpf);
		}
		return false;
	}

	public Cliente procurar(String cliente) {	
		if(this.equals(cliente)){
			this.procurar(cliente);
}
		return null;
}
public ArrayList<Cliente> Listar() {
		
		return this.repositorioCliente.Listar();
}
}