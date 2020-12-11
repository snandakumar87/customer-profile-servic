package com.redhat;

import org.apache.camel.Exchange;

import java.util.HashMap;
import java.util.Map;

public class ResidencyLookupBean {
    public static Map<String,String> residencyMap;
    static {
       residencyMap = new HashMap<>();
       residencyMap.put("1","RESIDENT");
       residencyMap.put("2","NON-RESIDENT");
       residencyMap.put("3","RESIDENT");
       residencyMap.put("4","RESIDENT");
       residencyMap.put("5","NON-RESIDENT");
    }

    public String lookupCustomerResidency(Exchange exchange) {
        //TODO look up residency for customer
        return null;
    }
}

