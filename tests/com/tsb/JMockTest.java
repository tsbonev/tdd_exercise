package com.tsb;


import org.jmock.auto.Mock;
import junit.framework.TestCase;
import org.jmock.Mockery;
import org.jmock.Expectations;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JMockTest extends TestCase {
    Mockery context = new Mockery();

    /*
    @Test
    public void testOneSubscriberReceivesAMessage() {
        // set up
        final Subscriber subscriber = context.mock(Subscriber.class); //Create a mock object from an interface

        Publisher publisher = new Publisher(); //Class that will use our mock
        publisher.add(subscriber); //Add our mock to the class

        final String message = "message"; //Setup message

        // expectations
        context.checking(new Expectations() {{ // we expect that the subscriber will receive the message
            allowing (subscriber).receive(message);
        }});

        // execute
        publisher.publish(message); //The publisher gives the message to the mock

        // verify
        context.assertIsSatisfied(); //We check if our expectations were true
    }*/

    @Test
    public void onePlusTwo() {

        assertThat(1, equalTo(1));

    }

    @Test
    public void objectIsEqual(){

        String str = null;

        assertThat(str, anything());

    }

}
