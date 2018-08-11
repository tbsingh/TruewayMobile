package com.trueway.mobile.website.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "INVOICE")
@EntityListeners(AuditingEntityListener.class)
public class Invoice extends MobileEntity{
	@Column(name = "PLAN_ID")
	private Long planId;
	@Column(name = "CUST_ID")
	private Long custId;
	private Long discount;
	private Long totalAmt;
	private Long netAmt;
	private String payMethod;
	private Boolean active;
	public Long getPlanId() {
		return planId;
	}
	public Invoice() {
		super();
	}
	public Invoice(@NotBlank String name, String desc, Long planId, Long custId, Long discount, Long totalAmt, Long netAmt, String payMethod) {
		super(name, desc);
		this.planId = planId;
		this.custId = custId;
		this.discount = discount;
		this.totalAmt = totalAmt;
		this.netAmt = netAmt;
		this.payMethod = payMethod;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public Long getDiscount() {
		return discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	public Long getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Long totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Long getNetAmt() {
		return netAmt;
	}
	public void setNetAmt(Long netAmt) {
		this.netAmt = netAmt;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
