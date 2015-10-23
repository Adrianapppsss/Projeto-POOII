package com.adrianaps.Loja;

public class Loja {
	private String nome;
	private String endereco;
	private String cnpj;
	private String email;
	private String telefone;
	private String tipoProduto;
	
	public Loja(String nome,String endereco,String cnpj,String email,String telefone,String tipoProduto){
		this.nome=nome;
		this.endereco=endereco;
		this.cnpj=cnpj;
		this.email=email;
		this.telefone=telefone;
		this.tipoProduto=tipoProduto;
		
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
	public void setCNPJ(String cnpj){
		this.cnpj=cnpj;
	}
	public String getCNPJ(){
		return this.cnpj;
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
	public void setTipoProduto(String TipoProduto){
		this.tipoProduto=TipoProduto;
	}
	public String getTipoProduto(){
		return this.tipoProduto;
	}
	public String toString(){
		return "Nome da Loja ="+nome+"Endereço ="+endereco+"CNPJ ="+cnpj
				+"Email ="+email+"Telefone ="+telefone+"Tipo de Produto da Loja ="+tipoProduto;
	}

}
