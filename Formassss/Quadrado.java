  package Formassss;

public class Quadrado implements IFormaGeometrica{
    
    private double lado;
    
    public Quadrado(double lado){

        this.lado = lado;

    }


    public double area(){

        return lado * lado; 

    }

    public double comprimento(){

        return lado * 4;
    }


}
