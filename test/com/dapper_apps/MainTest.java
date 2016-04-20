package com.dapper_apps;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by falven on 4/19/16.
 */
public class MainTest {
    @Test
    public void caseOne() {
        String decent = "-1";
        System.out.println("Need: " + decent);
        String output = Main.generateDecent(1);
        System.out.println("Got: " + output);
        assertEquals(decent, output);
    }

    @Test
    public void caseTwo() {
        caseOne();
    }

    @Test
    public void caseThree() throws Exception {
        String decent = "555";
        System.out.println("Need: " + decent);
        String output = Main.generateDecent(3);
        System.out.println("Got: " + output);
        assertEquals(decent, output);
    }

    @Test
    public void caseFour() throws Exception {
        String decent = "555";
        System.out.println("Need: " + decent);
        String output = Main.generateDecent(3);
        System.out.println("Got: " + output);
        assertEquals(decent, output);
    }

    @Test
    public void caseFive() throws Exception {
        String decent = "33333";
        System.out.println("Need: " + decent);
        String output = Main.generateDecent(5);
        System.out.println("Got: " + output);
        assertEquals(decent, output);
    }

    @Test
    public void caseEleven() throws Exception {
        String decent = "55555533333";
        System.out.println("Need: " + decent);
        String output = Main.generateDecent(11);
        System.out.println("Got: " + output);
        assertEquals(decent, output);
    }
}