package com.mariasube.cedric.angularjs.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.april.shiva.reporting.bon.livraison.entity.TestEntity;
import com.april.shiva.reporting.bon.livraison.repository.TestRepository;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testRepository;

	public List<TestEntity> findAll() {
		List<TestEntity> result = new ArrayList<TestEntity>();
		
		Iterable<TestEntity> tests = testRepository.findAll();
		for (TestEntity testEntity : tests) {
			result.add(testEntity);
		}
		
		return result;
	}

	@Override
	public List<TestEntity> findByDescriptionIgnoreCaseContaining(String description) {

		List<TestEntity> result = new ArrayList<TestEntity>();
		
		Iterable<TestEntity> tests = testRepository.findByDescriptionIgnoreCaseContaining(description);
		for (TestEntity testEntity : tests) {
			result.add(testEntity);
		}
		
		return result;
	}
}

