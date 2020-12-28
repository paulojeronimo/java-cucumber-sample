package com.ladoservidor.cucumber.helloworld;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;

import static org.junit.Assert.assertEquals;

public class HelloStepdefs {
    private Hello hello;
    private String hi;

    @Dado("^que eu tenho uma app que recebe \"([^\"]*)\"$")
    public void I_have_a_hello_app_with(String greeting) {
        hello = new Hello(greeting);
    }

    @Quando("^eu pedir que ela diga olá$")
    public void I_ask_it_to_say_hi() {
        hi = hello.sayHi();
    }

    @Entao("^ela deveria responder \"([^\"]*)!\"$")
    public void it_should_answer_with(String expectedHi) {
        assertEquals(expectedHi, hi);
    }
}
