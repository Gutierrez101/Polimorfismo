/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espew.herencia;
import java.util.Scanner;
/**
 *
 * @author MateoGutierrez
 */
public class Herencia {

    public static void main(String[] args) {
        
    FiguraGeometrica figuras[] = new FiguraGeometrica[]{new Circulo(5), new Triangulo(3,5) ,  new Rectangulo(3,6)};
    
    for(FiguraGeometrica fig: figuras){
        System.out.println("El area de la figura es: " + fig.CalcularArea());
        System.out.println("La figura es: " + fig.toString());
    }
    
    /*
        double radio,altura,base;
        //Area de circulo
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio=leer.nextDouble();
        Circulo circulo1=new Circulo(radio);
        System.out.println("El area del circulo es: "+ circulo1.CalcularArea());
        //Area de triangulo
        System.out.println("Ingrese la base del triangulo: ");
        base=leer.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura=leer.nextDouble();
        Triangulo triangulo1=new Triangulo(base,altura);
        System.out.println("El area del triangulo es: "+ triangulo1.CalcularArea());
        System.out.println("Ingrese la altura del rectangulo: ");
        base=leer.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura=leer.nextDouble();
        Rectangulo rectangulo1=new Rectangulo(base,altura);
        System.out.println("El area del rectangulo es: " + rectangulo1.CalcularArea());
        
    */
    }
}
