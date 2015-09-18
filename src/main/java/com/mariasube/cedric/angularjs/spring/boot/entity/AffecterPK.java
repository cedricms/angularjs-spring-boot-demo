package com.mariasube.cedric.angularjs.spring.boot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
 * Classe sérialisé de 2 clés étrangères permettant d'en faire le tout une clé primaire.
 */

@Embeddable
public class AffecterPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_ticket")
	protected long id_ticket;
	
	@Column(name="id_version")
    protected long id_version;

    public AffecterPK() {}
    
    /*
     * @param id_ticket		l'identifiant du ticket
     * @param id_version	l'identifiant de la version
     */
    public AffecterPK(long id_ticket, long id_version) {
        this.id_ticket = id_ticket;
        this.id_version = id_version;
    }

	public long getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(long id_ticket) {
		this.id_ticket = id_ticket;
	}

	public long getId_version() {
		return id_version;
	}

	public void setId_version(long id_version) {
		this.id_version = id_version;
	}
}
