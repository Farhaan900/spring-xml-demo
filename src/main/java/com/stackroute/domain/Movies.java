package com.stackroute.domain;

public class Movies {

    private Actors actor;

    public Actors getActor() {
        return actor;
    }

    public void setActor(Actors actor) {
        this.actor = actor;
    }

    public void printer(){
        System.out.println("Hello movie");
    }
}
