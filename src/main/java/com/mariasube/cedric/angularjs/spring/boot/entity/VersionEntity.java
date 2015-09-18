package com.mariasube.cedric.angularjs.spring.boot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/*
 * Une version contient un numéro et une date de mise en production prévisionnelle.
 * C'est la classe affectation qui permet de relier plusieurs
 * tickets (accumulé entre un interval de temps) à une version.
 */

@Entity
@Table(name="version")
public class VersionEntity extends AbstractEntity {
	
	@Column(name="numero")
	@Size(max=15)
	private String numero;
	
	@Column(name="date_mep_prev")
	private Date date_mep_prev;
	
	protected VersionEntity() {
    	
    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDate_mep_p() {
		return date_mep_prev;
	}

	public void setDate_mep_p(Date date_mep_p) {
		this.date_mep_prev = date_mep_p;
	}
}
