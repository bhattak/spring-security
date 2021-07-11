package com.jwt.security.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@NonNull
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cogenthealth")
public class CogentHealth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String firstname;

	private String lastname;

	private String username;

	private String email;

}
