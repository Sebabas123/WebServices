/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author seb
 */
@WebService(serviceName = "SOAPWebService")
public class SOAPWebService {

    private final String USERNAME = "Sebabas123";
    private final String PASSWORD = "sebabas";
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contraseña") String contraseña) {
        return new Boolean(usuario.equals(USERNAME) && contraseña.equals(PASSWORD)).toString();
    }
    
    @WebMethod(operationName = "calculadora")
    public String calculadora(@WebParam(name = "numero1") String numero1, @WebParam(name = "numero2") String numero2, @WebParam(name = "operacion") String operacion){
        Double resultado = new Double(0.0);
        System.out.println(operacion);
        if(operacion.equals("+"))
            resultado = new Double(numero2) + new Double(numero1);
        else if(operacion.equals("-"))
            resultado = new Double(numero2) - new Double(numero1);
        else if(operacion.equals("*"))
            resultado = new Double(numero2) * new Double(numero1);
        else if(operacion.equals("/"))
            resultado = new Double(numero2) / new Double(numero1);
        return resultado.toString();
    }
}
