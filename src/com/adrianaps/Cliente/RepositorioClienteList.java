package com.adrianaps.Cliente;


import java.util.ArrayList;
import java.util.List;

import com.adriana.psExececao.ClienteExisteException;
import com.adriana.psExececao.ClienteNaoEncontradoException;
import com.adriana.psExececao.ErroCadastroDadosException;
import com.adriana.psExececao.PreenchimentoObrigatorioException;
import com.adriana.psExececao.cpfClienteValidoException;
import com.adriana.psExececao.nenhumClienteNovoException;
import com.adriana.psExececao.nenhumClienteRemovidoExcetion;


public class RepositorioClienteList implements IRepositorioCliente{
	
	private List<Cliente> repositorio;
	
	public RepositorioClienteList(){
		repositorio = new ArrayList<>();
	}

	@Override
	public void cadastrar(Cliente cliente)
			throws PreenchimentoObrigatorioException, ClienteExisteException,cpfClienteValidoException, ErroCadastroDadosException {
		try{
			
		}catch(PreenchimentoObrigatorioException| ClienteExisteException |cpfClienteValidoException |ErroCadastroDadosException ){
			throw new PreenchimentoObrigatorioException();
		}
		
	}

	@Override
	public void atualizar(Cliente cliente) throws nenhumClienteNovoException,
			PreenchimentoObrigatorioException, ClienteExisteException,
			cpfClienteValidoException, ErroCadastroDadosException {
		
		
	}

	@Override
	public boolean remover(String cpf) throws nenhumClienteRemovidoExcetion,
			ErroCadastroDadosException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente procurar(String cliente)
			throws ClienteNaoEncontradoException, ErroCadastroDadosException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String cpf) throws ErroCadastroDadosException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Cliente> Listar(String nome)
			throws ClienteNaoEncontradoException, ErroCadastroDadosException {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
