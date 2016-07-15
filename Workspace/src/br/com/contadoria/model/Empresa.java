package br.com.contadoria.model;

public class Empresa {

	private Integer  id;	
	
	private String razaoSocial;	
	
	private String CNPJ;
	
	private String email;
	
	private String telefone;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getRazaoSocial(){
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial){
		this.razaoSocial = razaoSocial;
	}
	
	public String getCNPJ(){
		return CNPJ;
	}
	
	public void setCNPJ(String CNPJ){
		this.CNPJ = CNPJ;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	
}
