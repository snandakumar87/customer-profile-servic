package com.redhat;

import org.apache.camel.Exchange;

import java.util.HashMap;
import java.util.Map;

public class ProfileLookupBean {
    public static Map<String,String> customerClassMap;
    static {
       customerClassMap = new HashMap<>();
       customerClassMap.put("1","GOLD");
       customerClassMap.put("2","SILVER");
       customerClassMap.put("3","SILVER");
       customerClassMap.put("4","PLATINUM");
       customerClassMap.put("5","STANDARD");
    }

    public String lookupCustomerClass(Exchange exchange) {
        //TODO look up customer profile
    return null;
    }
}

