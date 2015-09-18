package com.mariasube.cedric.angularjs.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class TestEntity extends AbstractEntity {

    private String label;
    private String description;
    
    protected TestEntity() {
    	
    }

    public TestEntity(String label) {
        this.label = label;
    }

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

