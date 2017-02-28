package de.codecentric.boot.admin.repository;

import de.codecentric.boot.admin.model.Application;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jaime on 14/02/17.
 */
public interface ApplicationRepository extends GraphRepository<Application> {

}
