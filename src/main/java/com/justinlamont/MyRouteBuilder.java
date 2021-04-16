package com.justinlamont;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

    public void configure() {

        System.out.println("Help!");
        from("file:src/data?noop=true")
            .to("Sup");
    }
    /*.to("salesforce:createSObject")*/
}
