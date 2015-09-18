package com.mariasube.cedric.angularjs.spring.boot.service;

import java.util.List;

import com.mariasube.cedric.angularjs.spring.boot.entity.TestEntity;

public interface TestService {

	public List<TestEntity> findAll();
	
	public List<TestEntity> findByDescriptionIgnoreCaseContaining(String description);
}
