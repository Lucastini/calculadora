
package negocio;

public class Operacion {
    float num1;
    float num2;
    String signo;
   
    /*public Operacion(float n1,String sig, float n2){
        num1=n1;
        num2=n2;
        signo=sig;
    }*/

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
    
    public float sumar(){
        return num1+num2;
    }
    
    public float restar(){
        return num1-num2;
    }
    
    public float multiplicar(){
        return num1*num2;
    }
    
    public float dividir(){
        float res=0f;
        if(num2!=0)
            res=num1/num2;
        return res;
    }
    
    
}
