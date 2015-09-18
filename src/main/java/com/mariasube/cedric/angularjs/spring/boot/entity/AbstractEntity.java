package com.mariasube.cedric.angularjs.spring.boot.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*
 * Classe d'héritage d'une clé primaire auto-incrémenté.
 */

@MappedSuperclass
public abstract class AbstractEntity extends Object {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    protected AbstractEntity() {
    	
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}