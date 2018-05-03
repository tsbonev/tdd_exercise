package com.tsb;

public class Publisher {

    Subscriber subscriber;

    public void add (Subscriber subscriber){
        this.subscriber = subscriber;
    }

    public void publish (String message){
        this.subscriber.receive(message);
    }

}
