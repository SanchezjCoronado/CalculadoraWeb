/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

public class CalculadoraService {

    public static String respuesta() {
        String resultado="";
        switch (ope){
            case '0': resultado = "Selecionar un operador monse"; break;
            case '+': resultado = String.valueOf(nro1+nro2); break;
            case '-': resultado = String.valueOf(nro1-nro2); break;
            case '*': resultado = String.valueOf(nro1*nro2); break;
            case '/': resultado = String.valueOf(nro1/nro2); break;
        }
        return resultado;
    }

    public static String respuesta(int nro1, int nro2, char operador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
