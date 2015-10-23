package com.adrianaps.Cliente;

import java.util.ArrayList;

import com.adriana.psExececao.ClienteExisteException;
import com.adriana.psExececao.ClienteNaoEncontradoException;
import com.adriana.psExececao.ErroCadastroDadosException;
import com.adriana.psExececao.PreenchimentoObrigatorioException;
import com.adriana.psExececao.cpfClienteValidoException;
import com.adriana.psExececao.nenhumClienteNovoException;
import com.adriana.psExececao.nenhumClienteRemovidoExcetion;


public interface IRepositorioCliente {
	
	public void cadastrar(Cliente cliente)throws PreenchimentoObrigatorioException,ClienteExisteException,cpfClienteValidoException,ErroCadastroDadosException;	
	public void atualizar(Cliente cliente)throws nenhumClienteNovoException,PreenchimentoObrigatorioException,ClienteExisteException,cpfClienteValidoException,ErroCadastroDadosException;	
	public boolean remover(String cpf)throws nenhumClienteRemovidoExcetion,ErroCadastroDadosException;
	public Cliente procurar(String cliente)throws ClienteNaoEncontradoException, ErroCadastroDadosException;	
	public boolean existe(String cpf)throws ErroCadastroDadosException;	
	public ArrayList<Cliente>Listar(String nome)throws  ClienteNaoEncontradoException,ErroCadastroDadosException;
	
	
	

}
