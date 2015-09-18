package com.mariasube.cedric.angularjs.spring.boot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/*
 * Un ticket (un incident, une demande, un bug...) à sa représentation propre ici.
 */

@Entity
@Table(name = "ticket")
public class TicketEntity extends AbstractEntity {
	
	@Column(name = "reference")
	@Size(max = 100)
	private String reference;

	@Column(name = "demandeur")
	@Size(max = 30)
	private String demandeur;

	@Column(name = "beneficiaire")
	@Size(max = 30)
	private String beneficiaire;

	@Column(name = "description")
	@Size(max = 1000)
	private String description;

	@Column(name = "commentaire")
	@Size(max = 5000)
	private String commentaire;

	@Column(name = "date_creation")
	private Date date_creation;

	@Column(name = "type_livraison")
	private byte typeLivraison;

	@Column(name = "systeme_source")
	private byte systemeSource;
	
	@Column(name = "sujet")
	@Size(max = 100)
	private String sujet;

	protected TicketEntity() {

	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDemandeur() {
		return demandeur;
	}

	public void setDemandeur(String demandeur) {
		this.demandeur = demandeur;
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public byte getTypeLivraison() {
		return typeLivraison;
	}

	public void setTypeLivraison(byte typeLivraison) {
		this.typeLivraison = typeLivraison;
	}

	public byte getSystemeSource() {
		return systemeSource;
	}

	public void setSystemeSource(byte systemeSource) {
		this.systemeSource = systemeSource;
	}
}