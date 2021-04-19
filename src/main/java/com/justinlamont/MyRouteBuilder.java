package com.justinlamont;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

    public void configure() {
        from("file:data/start?noop=true")
                .to("file:data/finish");
    }
}
