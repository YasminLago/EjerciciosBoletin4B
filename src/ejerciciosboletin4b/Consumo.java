package ejerciciosboletin4b;
//@author ylagorebollar
public class Consumo {
    private float km,litros,vMed,pGas;//Atributos
    
    //Constructores
    public Consumo(float km,float litros,float vMed,float pGas){    
    }
    
    public Consumo(){
    }
    
    //Metodos
    public float getTempo(float km,float vMed){
        return km/vMed;
    }
     
    public void setKms(float km){
        this.km=km;
    }
    
    public void setLitros(float litros){
        this.litros=litros;
    }
    
    public void setvMed(float vMed){
        this.vMed=vMed;
    }
    
    public void setpGas(float pGas){
        this.pGas=pGas;
    }
    public float calcularConsumoMedio(float litros,float km){
        return litros/(km*100);
    }
    
    public float calcularConsumoEuros(float pGas,float km){
        return pGas/(km*100);
    }  
}

