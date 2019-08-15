package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestGoldwinddemo {

        GoldwinddemoDelegate goldwinddemoDelegate = new GoldwinddemoDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = goldwinddemoDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}