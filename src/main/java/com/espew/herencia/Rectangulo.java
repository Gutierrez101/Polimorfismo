/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espew.herencia;

/**
 *
 * @author MateoGutierrez
 */
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double CalcularArea() {
        Area=base*altura;
        return Area;
    }
    
    
    @Override
    public String toString(){
        return "Rectangulo";
    }
}
