package com.trueway.mobile.website.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "APPUSER")
@EntityListeners(AuditingEntityListener.class)
public class AppUser extends MobileEntity implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	private String login;
	private String password;
	private String createOnly;
	private String readOnly;
	private String updateOnly;
	private Boolean active;
	public AppUser(String login, String password, String creat, String read, String updat
			) {
		super();
		this.login = login;
		this.password = password;
		this.createOnly = creat;
		this.readOnly = read;
		this.updateOnly = updat;
	}
		
	public AppUser() {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

	public String getUpdateOnly() {
		return updateOnly;
	}

	public void setUpdateOnly(String updateOnly) {
		this.updateOnly = updateOnly;
	}

	
	public String getCreateOnly() {
		return createOnly;
	}

	public void setCreateOnly(String createOnly) {
		this.createOnly = createOnly;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
}