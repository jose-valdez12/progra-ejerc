
package calculadora;


public class calcuOperaciones {
   
    public double raiz ;
    public double potencia;
    public double seno;
    public double cos;
    public double radian;
    

    //metodos de operaciones 
    public double raiz (double primerNumero){
        return  raiz =(double)Math.sqrt(primerNumero);
    }

    public double potencia1 (int primerNumero,int segundoNumero){
       return potencia =(int) Math.pow (primerNumero,segundoNumero);
    }

    public double seno1(double primerNumero){
      return seno= Math.sin(Math.PI / primerNumero);
    }

    public double cos1(double radian){
     return cos = Math.cos(radian);
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getSeno() {
        return seno;
    }

    public void setSeno(double seno) {
        this.seno = seno;
    }

    public double getcos() {
        return cos;
    }

    public void setcos(double random) {
        this.cos = random;
    }
    
}
