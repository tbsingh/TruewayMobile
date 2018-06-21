package com.trueway.mobile.website.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Offer")
@EntityListeners(AuditingEntityListener.class)
public class PlanOffer extends MobileEntity implements Serializable {
	private static final long serialVersionUID = 1L;
    private int valuePerc;
    private int valueFixed;
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
}