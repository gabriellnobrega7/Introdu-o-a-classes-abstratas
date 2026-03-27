 package Formas;

public class Circulo extends FormaGeometrica{
    
    private double raio;


    public Circulo(double raio){
        this.raio = raio;
    }

    public void area (){

        setRaio(getRaio()*raio * 3.14);

    }

    public void comprimento(){

        setRaio(getRaio()*(2 * 3.14));
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }



}
