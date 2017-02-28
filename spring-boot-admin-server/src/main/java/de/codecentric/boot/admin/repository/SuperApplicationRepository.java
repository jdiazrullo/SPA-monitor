package de.codecentric.boot.admin.repository;

import de.codecentric.boot.admin.model.Application;
import de.codecentric.boot.admin.model.SuperApplication;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Created by jaime on 14/02/17.
 */
public interface SuperApplicationRepository extends GraphRepository<SuperApplicationRepository> {

    @Query("MATCH (m:SuperApplication) WHERE m.name =~ ('(?i).*'+{name}+'.*') RETURN m")
    Collection<SuperApplication> findByName(@Param("name") String name);

}
