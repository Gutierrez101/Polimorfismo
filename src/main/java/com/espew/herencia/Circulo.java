/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espew.herencia;

/**
 *
 * @author MateoGutierrez
 */
public class Circulo extends FiguraGeometrica {
private double radio;

//constructor
    public Circulo(double radio){
        this.radio=radio;
    }

    @Override
    public double CalcularArea(){
        Area=3.1416*radio*radio;
        return Area;
    }
    
    
@Override
    public String toString(){
        return "Circulo";
    }
}
