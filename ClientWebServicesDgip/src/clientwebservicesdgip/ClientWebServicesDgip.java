/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwebservicesdgip;

/**
 *
 * @author dennis
 */
public class ClientWebServicesDgip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }

    private static double calcularhorast(double dia1, double dia2, double dia3, double dia4, double dia5) {
        uddi.Calcularhoras_Service service = new uddi.Calcularhoras_Service();
        uddi.Calcularhoras port = service.getCalcularhorasPort();
        return port.calcularhorast(dia1, dia2, dia3, dia4, dia5);
    }

    private static double calcularsueldo(double horas, double valorhora) {
        uddi.Calcularhoras_Service service = new uddi.Calcularhoras_Service();
        uddi.Calcularhoras port = service.getCalcularhorasPort();
        return port.calcularsueldo(horas, valorhora);
    }
    
    
}
