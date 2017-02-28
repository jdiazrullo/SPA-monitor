package de.codecentric.boot.admin.repository;

import de.codecentric.boot.admin.model.Application;
import de.codecentric.boot.admin.model.Project;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by jaime on 14/02/17.
 */
public interface ProjectRepository extends GraphRepository<Project> {

}
