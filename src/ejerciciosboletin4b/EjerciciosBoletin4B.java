package ejerciciosboletin4b;
//@author ylagorebollar

import javax.swing.JOptionPane;

public class EjerciciosBoletin4B {
    public static void main(String[] args) {
      /*Consumo cons=new Consumo();*/ //Creación de obxeto sen parámetros
    
    
    float litros=50f,pGas=1.57f,km,vMed; //Declaración de variables
       String resultado=JOptionPane.showInputDialog("Km");
             km=Float.parseFloat(resultado);
       String resultado1=JOptionPane.showInputDialog("Velocidade media");
            vMed=Float.parseFloat(resultado1);
       Consumo cons1=new Consumo(km,litros,vMed,pGas); //Creación de obxeto con parámetros
       JOptionPane.showMessageDialog(null,"Consumo medio"+cons1.calcularConsumoMedio(litros, km));
    
    }  
    }
               

      

