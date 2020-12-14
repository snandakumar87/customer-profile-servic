package com.redhat;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class UserManagementRoute extends RouteBuilder {
    @Override
    public void configure() {

      //TODO add camel route for exposing REST service


    }
}
