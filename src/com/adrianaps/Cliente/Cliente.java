package com.adrianaps.Cliente;

public class Cliente {
	
	private String nome;	
	private String endereco;	
	private String cpf;	
	private String email;	
	private String telefone;
	
	public Cliente(String nome, String endereco,String cpf,String email,String telefone){
		this.nome=nome;
		this.endereco=endereco;
		this.cpf=cpf;
		this.email=email;
		this.telefone=telefone;
	} 
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setEndereco(String endereco){
		this.endereco=endereco;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public void setCPF(String cpf){
		this.cpf=cpf;
	}
	public String getCPF(){
		return this.cpf;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setTelefone(String telefone){
		this.telefone=telefone;		
	}
	public String getTelefone(){
		return this.telefone;
	}
	public String toString(){
		return "Nome ="+nome+ "Endereço ="+endereco+"CPF ="+cpf+"Email ="+email+"Telefone ="+telefone;
	}
	
	
}
