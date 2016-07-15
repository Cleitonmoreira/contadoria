package br.com.contadoria.model;

public class Usuario {
	
	private Integer  id;	
	
	private String nomeUsuario;
	
	private String senhaUsuario;
	
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getNomeUsuario(){
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario){
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getSenhaUsuario(){
		return senhaUsuario;
	}
	
	public void setSenhaUsuario(String senhaUsuario){
		this.senhaUsuario = senhaUsuario;
	}

}
