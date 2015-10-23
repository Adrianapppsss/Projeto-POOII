package com.adrianaps.Loja;

import java.util.ArrayList;


public interface IRepositorioLoja {
	
	public void cadastrar(Loja loja);	
	public void atualizar(Loja loja);	
	public boolean remover(String cnpj);	
	public Loja procurar(String Loja);	
	public boolean existe(String cpf);	
	public ArrayList<Loja>Listar();
	public int size();
	
	

}
