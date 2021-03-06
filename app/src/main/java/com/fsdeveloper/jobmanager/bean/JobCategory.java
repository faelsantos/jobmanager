package com.fsdeveloper.jobmanager.bean;

import java.io.Serializable;

/**
 * The JobCategory class represents all objects of type JobCategory.
 * All objects of type JobCategory are implemented as instances of this class.
 *
 * @author Douglas Rafael
 * @version 1.0
 */
public class JobCategory implements Serializable {
    private static final long serialVersionUID = -7372855818195544957L;

    private int id;
    private String name;

    /**
     * JobCategory class constructor.
     *
     * @param id   The id of category.
     * @param name The name of category.
     */
    public JobCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * JobCategory class constructor.
     *
     * @param name The name of category.
     */
    public JobCategory(String name) {
        this.name = name;
    }

    /**
     * Constructor empty.
     */
    public JobCategory() {
    }

    /**
     * Retrieve/get the id of category.
     *
     * @return The id of category.
     */
    public int getId() {
        return id;
    }

    /**
     * Set the id of category.
     *
     * @param id The id of category.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieve/get the name of category.
     *
     * @return The name of category.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of category.
     *
     * @param name The name of category.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JobCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobCategory category = (JobCategory) o;

        if (id != category.id) return false;
        return name != null ? name.equals(category.name) : category.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
