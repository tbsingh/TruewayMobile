package com.trueway.mobile.website.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "OFFER")
@EntityListeners(AuditingEntityListener.class)
public class PlanOffer extends MobileEntity implements Serializable {
	public PlanOffer(@NotBlank String name, String desc,int valuePerc, int valueFixed) {
		super(name, desc);
		this.valuePerc = valuePerc;
		this.valueFixed = valueFixed;
	}
	public PlanOffer() {
		super();
	}
	
    private int valuePerc;
    private int valueFixed;
    private int active;
    
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE},  mappedBy = "offers")
    private List<MobilePlan> plans=new ArrayList<>();
    
	public List<MobilePlan> getPlans() {
		return plans;
	}
	public void setPlans(List<MobilePlan> plans) {
		this.plans = plans;
	}
	public int getValuePerc() {
		return valuePerc;
	}
	public void setValuePerc(int valuePerc) {
		this.valuePerc = valuePerc;
	}
	public int getValueFixed() {
		return valueFixed;
	}
	public void setValueFixed(int valueFixed) {
		this.valueFixed = valueFixed;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
}