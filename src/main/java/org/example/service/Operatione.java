package org.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "Operations")
public class Operatione {

    @WebMethod(operationName = "addition")
    public double additionner(@WebParam(name = "a") double m,@WebParam(name = "b")double n){
        double resultat = m+n;
        return resultat;
    }

    @WebMethod(operationName = "division")
    public double diviser(@WebParam(name = "a") double m,@WebParam(name = "b")double n){
        double resultat = m/n;
        return resultat;
    }

    @WebMethod(operationName = "premier")
    public String EstPremier(@WebParam(name = "a") double m){
        if (m <= 1) {
            return "pas un nombre premier";
        }
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return "pas un nombre premier";
            }
        }
        return "nombre premier";
    }


}
