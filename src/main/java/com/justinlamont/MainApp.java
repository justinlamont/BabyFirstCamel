package com.justinlamont;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

    public static void main(String... args) throws Exception {

        CamelContext context = new DefaultCamelContext();

        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("file:data/start?noop=true")
                    .to("file:data/finish");
            }
        });

        context.start();
        Thread.sleep(3000);
        context.stop();
    }

}