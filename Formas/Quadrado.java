 package Formas;

public class Quadrado extends FormaGeometrica{
    
    private double lado;

    public Quadrado(double lado){

        this.lado = lado;

    }

    public void area(){

        setLado(getLado()*lado);

    }

    public void comprimento(){

        setLado(getLado()*4);
    }


    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
