package com.kodilla.hibernate.tasks;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TASKS")
public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;

    public Task(String description, int duration) {
            this.description = description;
            this.created = new Date();
            this.duration = duration;
    }
    
    public Task() {
	}




	@Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
            return id;
    }
    
    @Column(name="DESCRIPTION")
    public String getDescription() {
            return description;
    }

    public Date getCreated() {
            return created;
    }

    @Column(name="DURATION")
    @NotNull
    public int getDuration() {
            return duration;
    }

	private void setId(int id) {
		this.id = id;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private void setCreated(Date created) {
		this.created = created;
	}

	private void setDuration(int duration) {
		this.duration = duration;
	}
    
    
    
}
