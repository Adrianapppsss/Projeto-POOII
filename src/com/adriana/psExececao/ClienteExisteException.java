package com.adriana.psExececao;

public class ClienteExisteException extends Exception {
	
	public ClienteExisteException(){
		super ("Cliente j� existe");
	}

}
