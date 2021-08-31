package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// import io.quarkus.funqy.Funq;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Welcome, Quarkus Serverless Functions Refcard";
    }

    // @Funq("awsfunction")
    // public String hello() {
    //     return "Hi, Quarkus Funqy on AWS Lambda";
    // }

}