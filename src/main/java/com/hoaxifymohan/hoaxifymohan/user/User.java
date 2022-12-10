package com.hoaxifymohan.hoaxifymohan.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = "user name"))
//We can use @Table annotation to set custom name for the User table
@Table(name="users" )
public class User {
	
	@Id
	@GeneratedValue
	
	private long id;
	@NotNull(message= "{hoxifymohan.constraints.username.NotNull.message}")
	//@NotNull(message= "User name cannot be null")
	@Size(min = 4, max = 255)
	private String username;	
	
	@NotNull	
	@Size(min = 4, max = 255)
	
	private String displayName;
	
	@NotNull
	@Size(min = 8, max = 255)
	
	@Pattern(regexp =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message= "{hoxifymohan.constraints.password.Pattern.message}")
	//"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$")
	private String password;

}
