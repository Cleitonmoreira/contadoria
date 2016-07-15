package br.com.contadoria.model;

public class Funcionario {
	
	private Integer id;
	
	private String cpf;
	
	private String nome;
	
	private String rg;
	
	private String clt;
	
	private String funçao;
	
	private String salarioInicial;
	
	private String salarioAtual;
	
	private String admiçao;
	
	private String comiçao;
	
	private String horasExtras;
	
	private String adicionais;
	
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getRg(){
		return rg;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public String getClt(){
		return clt;
	}
	
	public void setClt(String clt){
		this.clt = clt;
	}
	
	public String getFunçao(){
		return funçao;
	}
	
	public void setFunçao(String funçao){
		this.funçao = funçao;
	}
	
	public String getSalarioInicial(){
		return salarioInicial;
	}
	
	public void setSalarioInicial(String salarioInicial){
		this.salarioInicial = salarioInicial;
	}
	
	public String getSalarioAtual(){
		return salarioAtual;
	}
	
	public void setSalarioAtual(String salarioAtual){
		this.salarioAtual = salarioAtual;
	}
	
	public String getAdmiçao(){
		return admiçao;
	}
	
	public void setAdmiçao(String admiçao){
		this.admiçao = admiçao;
	}
	
	public String getComiçao(){
		return comiçao;
	}
	
	public void setComiçao(String comiçao){
		this.comiçao = comiçao;
	}
	
	public String getHorasExtras(){
		return horasExtras;
	}
	
	public void setHorasExtras(String horasExtras){
		this.horasExtras = horasExtras;
	}
	
	public String getAdicionais(){
		return adicionais;
	}
	
	public void setAdicionais(String adicionais){
		this.adicionais = adicionais;
	}

}
