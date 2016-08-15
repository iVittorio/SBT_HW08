package ru.sbt.socialnetwork.domain;

import java.util.Date;

/**
 * Created by i.viktor on 15/08/16.
 */
public class User {
    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
