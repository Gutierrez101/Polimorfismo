/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espew.herencia;

/**
 *
 * @author USUARIO
 */
public class Triangulo extends FiguraGeometrica {
private double base;
private double altura;

    public Triangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double CalcularArea() {
        Area=(base*altura)/2;
        return Area;
    }
    
    
    public String toString(){
        return "Triangulo";
    }
}
