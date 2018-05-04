package com.tsb;

import java.awt.*;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.*;

import com.sun.deploy.util.ArrayUtil;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class HamcrestMatchers {

    String str = "123";
    String copyStr = str;
    int[] arr = {1, 2, 3};
    int num1 = 1;
    int num2 = 2;
    double db1 = 2.5d;
    double db2 = 3.5d;

    @Test
    public void testEqualTo(){
        assertThat(Arrays.toString(arr), is("[1, 2, 3]"));
        assertThat(Arrays.toString(arr), is(anyOf(equalTo("[1, 2, 3]"), equalTo("123"))));
        //is enhances readability but does nothing except check if the values are equal, calling -
        //equalTo uses the object's equals() method
        //anyOf acts as an OR statement

    }

    @Test
    public void testHasString(){
        assertThat(num1, allOf(hasToString("1"), equalTo(1)));
        //hasToString() uses the object's toString() method and checks the returns
        //allOf() acts as an AND check
    }

    @Test
    public void testInstanceOf(){
        assertThat(num1, is(allOf(instanceOf(Integer.class),
                instanceOf(Number.class),
                instanceOf(Object.class)
        )));
        //instanceOf checks the type of the given object
    }

    @Test
    public void testTypeCompatibleWith(){
        assertThat(Double.class, is(typeCompatibleWith(Number.class)));
        assertThat(List.class, is(typeCompatibleWith(ItemSelectable.class)));
        //typeCompatibleWith checks if the given classes are part of an inheritance tree
        //typeCompatibleWith also checks if the given class implements an interface
    }

    @Test
    public void testNotNull(){
        assertThat(1, is(notNullValue()));
        assertThat(null, is(nullValue()));
        //notNullValue checks if the value given is not null and vice versa
    }

    @Test
    public void testSomeInstance(){
        assertThat(str, is(sameInstance(copyStr)));
        //sameInstance checks if the two given objects point to the same instance
    }

    @Test
    public void testArrayMatcher(){
        assertThat(new Integer[]{1, 2, 3}, allOf(array(
                instanceOf(Integer.class),
                equalTo(2),
                notNullValue()),
                hasItemInArray(1)
                ));
        //array checks each element of the specified array against a specified matcher
        //hasItemInArray checks an array for the specified item
    }

    @Test
    public void testMapHas(){
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("1", "one");
        assertThat(myMap, allOf(
                hasKey("1"),
                hasValue("one"),
                hasEntry("1", "one")
        ));
        //hasKey, hasValue, hasEntry check a map for those objects
    }

    @Test
    public void testCollections(){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("1");
        myList.add("2");

        assertThat(myList, hasItem("1"));
        assertThat(myList, hasItems(new String[]{"1", "2"}));
        //hasItem/s checks if a given collection contains the specified values
    }

    @Test
    public void testCloseTo(){
        assertThat(db1, closeTo(db2, 1d));
        //closeTo checks if two given floating point numbers are equal withing a margin of error
    }

    @Test
    public void testText(){
        assertThat("The", equalToIgnoringCase("the"));
        assertThat("Th e", equalToIgnoringWhiteSpace(" th  e "));
        assertThat("the", allOf(
                containsString("h"),
                startsWith("t"),
                endsWith("e")
        ));
        //equalToIgnoring case checks if string are equal after making both cases match
        //equalToIgnoringWhiteSpace does not ignore whitespaces completely
        //instead, it ignores trailing and leading spaces, as well as extra white spaces
        //contains and *With explains itself
    }



}
