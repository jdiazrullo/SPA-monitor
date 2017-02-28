package de.codecentric.boot.admin.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jaime on 16/02/17.
 */
@NodeEntity
public class Project {
    @GraphId
    private Long id;
    @Property(name="name")
    private String name;
    private Set<SuperApplication> superApplications;

    public Project(Set<SuperApplication> superApplications) {
        if(superApplications == null)
            this.superApplications= new HashSet<>();
        else
            this.superApplications = superApplications;
    }
    public Project() {
        this.superApplications= new HashSet<>();
    }

}
