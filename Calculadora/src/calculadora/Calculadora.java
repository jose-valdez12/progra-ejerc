
package calculadora;

 import java.util.Scanner;

public class Calculadora {
     public static void main(String[] args) {
    
     
     
       System.out.println("***bienvenido***");
    
       
       Scanner sc= new Scanner(System.in);
       
       //System.out.println ("Ingrese el numero para realizar la raiz cuadrada");
       //double primerNumero = sc.nextDouble();
       
       //calcuOperaciones Calculadora = new calcuOperaciones ();
       //System.out.println(Calculadora.raiz(primerNumero));
       //System.out.println("su total es :"+Calculadora.raiz);
       
       
       //System.out.println ("Ingrese el numero para realizar la potencia");
       //System.out.println("Ingrese el segundo numero ");
       //int primerNumero= sc.nextInt();
       //int segundoNumero=sc.nextInt();
      
       //calcuOperaciones Calculadora = new calcuOperaciones ();
       //System.out.println(Calculadora.potencia1(primerNumero,segundoNumero));
       //System.out.println("su total es :"+Calculadora.potencia);
       
       
       
       //System.out.println ("Ingrese el numero para realizar el seno");
       //double primerNumero= sc.nextDouble();
      
       //calcuOperaciones Calculadora = new calcuOperaciones ();
       //System.out.println(Calculadora.seno1(primerNumero));
       //System.out.println("su total es :"+Calculadora.seno);
   
      
       System.out.println ("Ingrese el numero para realizar el coseno");
       double radian=sc.nextDouble();
      
       calcuOperaciones Calculadora = new calcuOperaciones();
       System.out.println(Calculadora.cos1(radian));
       System.out.println("su total es :"+Calculadora.cos);
  }
     
}

         
    

 
