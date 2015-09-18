package com.mariasube.cedric.angularjs.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mariasube.cedric.angularjs.spring.boot.entity.TestEntity;

/**
 * Cf. http://docs.spring.io/spring-data/jpa/docs/1.5.1.RELEASE/reference/html/jpa.repositories.html#jpa.query-methods.query-creation
 *
 */
@Repository
public interface TestRepository extends CrudRepository<TestEntity, Long>  {

	public Iterable<TestEntity> findByDescriptionIgnoreCaseContaining(@Param("description") String description);
}
