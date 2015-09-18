package com.mariasube.cedric.angularjs.spring.boot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/*
 * Classe qui affecte un (ou plusieurs) ticket à une version.
 * D'autres paramètres sont pris en compte lors de ce lien.
 * Elle importe une classe sérialisé pour la clé primaire.
 */

@Entity
@Table(name="affecter")
public class AffecterEntity extends Object {
	@EmbeddedId
	private AffecterPK affecterPK;
	
    @MapsId("ticketId") //references EmbeddedId's property
    @JoinColumn(name = "id_ticket", referencedColumnName = "id")
    @ManyToOne
    private TicketEntity ticketEntity;
	
    @MapsId("versionId") //references EmbeddedId's property
    @JoinColumn(name = "id_version", referencedColumnName = "id")
    @ManyToOne
    private VersionEntity versionEntity;
	
	@Column(name="etat_recette")
	private byte etat_recette;
	
	@Column(name="etat_dev")
	private byte etat_dev;
	
	@Column(name="etat_bordereau")
	private byte etat_bordereau;
	
	@Column(name="date_correction")
	private Date date_correction;
	
	@Column(name = "intervenant")
	@Size(max = 30)
	private String intervenant;
	
	@Column(name = "groupe")
	private byte groupe;
	
	protected AffecterEntity() {
    	
    }

	public AffecterPK getAffecterPK() {
		return affecterPK;
	}

	public void setAffecterPK(AffecterPK affecterPK) {
		this.affecterPK = affecterPK;
	}

	public TicketEntity getTicketEntity() {
		return ticketEntity;
	}

	public void setTicketEntity(TicketEntity ticketEntity) {
		this.ticketEntity = ticketEntity;
	}

	public VersionEntity getVersionEntity() {
		return versionEntity;
	}

	public void setVersionEntity(VersionEntity versionEntity) {
		this.versionEntity = versionEntity;
	}

	public byte getEtat_recette() {
		return etat_recette;
	}

	public void setEtat_recette(byte etat_recette) {
		this.etat_recette = etat_recette;
	}

	public byte getEtat_dev() {
		return etat_dev;
	}

	public void setEtat_dev(byte etat_dev) {
		this.etat_dev = etat_dev;
	}

	public byte getEtat_bordereau() {
		return etat_bordereau;
	}

	public void setEtat_bordereau(byte etat_bordereau) {
		this.etat_bordereau = etat_bordereau;
	}

	public Date getDate_fin() {
		return date_correction;
	}

	public void setDate_fin(Date date_fin) {
		this.date_correction = date_fin;
	}

	public String getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}

	public byte getGroupe() {
		return groupe;
	}

	public void setGroupe(byte groupe) {
		this.groupe = groupe;
	}
}