package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import servicio.CalculadoraService;


@Named(value = "calculaControl")
@SessionScoped
public class CalculadoraControl implements Serializable {
    
    private int nro1;
    private int nro2;
    private String resultado="";
    char operador;

    public void calcular(){
        resultado=CalculadoraService.respuesta(nro1, nro2, operador);
 /*       switch(operador){
            case '0': resultado = "Selecionar un operador monse"; break;
            case '+': resultado = String.valueOf(nro1+nro2); break;
            case '-': resultado = String.valueOf(nro1-nro2); break;
            case '*': resultado = String.valueOf(nro1*nro2); break;
            case '/': resultado = String.valueOf(nro1/nro2); break;
        }*/
    }
    
    public void limpiar(){
        setnro1(10);
        setnro2(10);
        setResultado("");
        
    }
}
