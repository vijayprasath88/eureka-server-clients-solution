package com.codework.eurekacountrylist5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class AllCountriesListController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/countrystates")
    public @ResponseBody String getCountryStates() {
        return statesBuilder();

    }

    public String statesBuilder(){
        String eol = System.getProperty("line.separator");
        StringBuilder builder = new StringBuilder();
        builder.append("United States: ");
        builder.append(getCountryWiseStates("eureka-client-us-1"));
        builder.append(eol);
        builder.append("United Kingdom: ");
        builder.append(getCountryWiseStates("eureka-client-uk-2"));
        builder.append(eol);
        builder.append("India: ");
        builder.append(getCountryWiseStates("eureka-client-india-3"));
        builder.append(eol);
        builder.append("Europe: ");
        builder.append(getCountryWiseStates("eureka-client-europe-4"));
        builder.append(eol);
        return builder.toString();
    }

    public String getCountryWiseStates(String service){
        List<ServiceInstance> instances = discoveryClient.getInstances(service);
        if(instances != null && instances.size() > 0){
            URI uri = instances.get(0).getUri();
            if(uri != null){
                return (new RestTemplate()).getForObject(uri,String.class);
            }
        }
        return null;
    }
}
