/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;



@WebService(serviceName = "calcularhoras")
public class calcularhoras {
    
    
    @WebMethod(operationName = "Calcularhorast")
    public double calularhorast(@WebParam(name = "dia1") double dia1,@WebParam(name = "dia2") double dia2, @WebParam(name = "dia3") double dia3
    , @WebParam(name = "dia4") double dia4 
    , @WebParam(name = "dia5") double dia5) {
       
        double horastotales = dia1+dia2+dia3+dia4+dia5;
        return horastotales;
    }
    
    @WebMethod(operationName = "calcularsueldo")
    public double calularsueldo(@WebParam(name = "horas") double horas, @WebParam(name = "valorhora") double valorhora ) {
       
        double sueldototal = (horas)*(valorhora);
        return sueldototal;
    }
   
}
