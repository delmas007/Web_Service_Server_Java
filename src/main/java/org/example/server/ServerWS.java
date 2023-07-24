package org.example.server;

import jakarta.xml.ws.Endpoint;
import org.example.service.Operatione;

public class ServerWS {
    public static void main(String[] args){
        String url = "http://192.168.1.4:8084/";

        try {
            Endpoint.publish(url, new Operatione());
            System.out.println("Service bien déployé");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
