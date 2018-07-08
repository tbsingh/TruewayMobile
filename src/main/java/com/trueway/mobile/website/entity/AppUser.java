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
public class AppUser implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	private String login;
	private String password;
	private Boolean createonly;
	private Boolean readonly;
	private Boolean updateonly;
	private Boolean deactive;
	public AppUser(String login, String password, Boolean creat, Boolean read, Boolean updat,
			Boolean deactive) {
		super();
		this.login = login;
		this.password = password;
		this.createonly = creat;
		this.readonly = read;
		this.updateonly = updat;
		this.deactive = deactive;
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
	
	public Boolean getReadonly() {
		return readonly;
	}

	public void setReadonly(Boolean readonly) {
		this.readonly = readonly;
	}

	public Boolean getUpdateonly() {
		return updateonly;
	}

	public void setUpdateonly(Boolean updateonly) {
		this.updateonly = updateonly;
	}

	public Boolean getDeactive() {
		return deactive;
	}
	public void setDeactive(Boolean deactive) {
		this.deactive = deactive;
	}
	public Boolean getCreateonly() {
		return createonly;
	}

	public void setCreateonly(Boolean createonly) {
		this.createonly = createonly;
	}
	
}