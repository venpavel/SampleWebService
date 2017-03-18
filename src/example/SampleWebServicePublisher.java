package example;

import javax.xml.ws.Endpoint;
import example.SampleWebServiceImpl;

/**
 * Created by venpavel on 17.03.17.
 */
public class SampleWebServicePublisher {

    public static void main(String[] argv) {
        Object implementor = new SampleWebServiceImpl();
        String address = "http://localhost:9000/SampleWebService";
        Endpoint.publish(address, implementor);
    }

}

