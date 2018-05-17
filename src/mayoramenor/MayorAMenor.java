/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoramenor;
import java.util.Scanner;
/**
 *
 * @author TinTO
 */
public class MayorAMenor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int num3=0;
        int mayor;
        int medio;
        int menor;
Scanner numero = new Scanner(System.in);
boolean aux= false;
do  {        
System.out.printf("Ingrese primer numero: ");   
String letra = numero.next();  
try {
  num1 = Integer.parseInt(letra);
  aux= true;
}catch(Exception ex){
  System.out.println("Ingrese un valor correcto");}
}while (!aux);
do  {
aux= false;
System.out.printf("Ingrese segundo numero: ");      
String letra2 = numero.next();  
try {
  num2 = Integer.parseInt(letra2);
  aux= true;
}catch(Exception ex){
  System.out.println("Ingrese un valor correcto");}
}while (!aux);
do{
aux= false;
System.out.printf("Ingrese tercer numero: ");
String letra3 = numero.next();  
try {
  num3 = Integer.parseInt(letra3);
  aux= true;
}catch(Exception ex){
  System.out.println("Ingrese un valor correcto");} 
}while (!aux);
if ((num1!=num2)&&(num2!=num3)&&(num1!=num3)){    
    if ((num1>num2)&&(num1>num3)){
                mayor=num1;           
        }else if((num2 >num1)&&(num2>num3)){
                mayor=num2;        
        }else{
                mayor=num3;                      
        }
    if ((num1<num2)&&(num1<num3)){
                menor=num1;           
        }else if((num2<num1)&&(num2<num3)){
                menor=num2;        
        }else{
                menor=num3;                      
        }    
    medio = (num1+num2+num3)-(mayor+menor);
    
     System.out.println("ORDEN MAYOR A MENOR ");
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero medio es: "+medio);
        System.out.println("El numero menorr es: "+menor);    
    System.out.println("ORDEN MENOR A MAYOR ");
        System.out.println("El numero menor es: "+menor);  
        System.out.println("El numero medio es: "+medio);
        System.out.println("El numero mayor es: "+mayor);
}else if ((num1==num2)&&(num1==num3)&&(num2==num3)){
             System.out.println("los numeros son iguales");
    }else if ((num1==num2)&&(num1>num3)){
        System.out.println("Los dos primeros numeros son Iguales y Mayores al tercero: "+num1+","+num2+","+num3);
    }else if ((num1==num2)&&(num1<num3)){
        System.out.println("Los dos primeros numeros son Iguales y Menores al tercero: "+num1+","+num2+","+num3);
    }else if ((num1==num3)&&(num1>num2)){
        System.out.println("Los numeros 1 y 3 son Iguales y Mayores al segundo: "+num1+","+num2+","+num3);
    }else if ((num1==num3)&&(num1<num2)){
        System.out.println("Los numeros 1 y 3 son Iguales y Menores al segundo:: "+num1+","+num2+","+num3);
    }else if ((num3==num2)&&(num3>num1)){
        System.out.println("Los dos ultimos numeros son Iguales y Mayores al primero: "+num1+","+num2+","+num3);
    }else if ((num3==num2)&&(num3<num1)){
        System.out.println("Los dos ultimos numeros son Iguales y Menores al primero: "+num1+","+num2+","+num3);
    }
       
       
       
       
              
    } 
  }


    

