package ufc.npi.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull 
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String nome;
	
	
	@NotNull 
	@Size(min=2,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String endereco;


	@NotNull 
	@Size(min=11,max=11, message="O tamanho deve ser entre {min} e {max}")
	private String cpf;

	@NotNull 
	@Size(min=8,max=8, message="O tamanho deve ser entre {min} e {max}")
	private String dataNascimento;

	@NotNull 
	@Size(min=4,max=12, message="O tamanho deve ser entre {min} e {max}")
	private String senha;

	@NotNull 
	@Size(min=4,max=10, message="O tamanho deve ser entre {min} e {max}")
	private String login;
	
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipo;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TipoUsuario getTipo() {
		return tipo;
	}



	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
