package com.matt.workshopmongo.dto;

import java.io.Serializable;

import com.matt.workshopmongo.domain.User;

/*DTO (Data Transfer Object): é um objeto que tem o papel de carregar dados das entidades de forma simples,
podendo inclusive "projetar" apenas alguns dados da entidade original. Vantagens:
- Otimizar o tráfego (trafegando menos dados)
- Evitar que dados de interesse exclusivo do sistema fiquem sendo expostos (por exemplo: senhas, dados de
auditoria como data de criação e data de atualização do objeto, etc.)
- Customizar os objetos trafegados conforme a necessidade de cada requisição (por exemplo: para alterar
um produto, você precisa dos dados A, B e C; já para listar os produtos, eu preciso dos dados A, B e a
categoria de cada produto, etc.).*/




public class UserDTO implements Serializable{
	/**
	 * 
	 */
	/*implementacao serializable sempre colocar o serialverion uid*/
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String email;
	
	
	/*construtor vazio*/
	public UserDTO() {
	}
	
		/*instacia obj entity correspondente e abaixo os gets and setters */
		public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getNome();
		email =obj.getEmail();
		
		
	}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

}
