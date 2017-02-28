package de.codecentric.boot.admin.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.*;

/**
 * Created by jaime on 16/02/17.
 */
@NodeEntity
public class SuperApplication {
    @GraphId
    private Long id;
    private String name;
    private Set<Application> instances;

    public SuperApplication(String name, Set<Application> instances) {
        this.name=name;
    if(instances == null)
        this.instances= new HashSet<>();
    else
    this.instances = instances;
    }
    public SuperApplication() {
            this.instances= new HashSet<>();
    }
}
