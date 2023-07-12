package com.microsoft.dukes;


import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.core.Application;

@ApplicationPath("")
public class CompleteDukeApplication extends Application {

    public String main(String[] args) throws InterruptedException {

        return "Hi this is riyaz";
    }

}
