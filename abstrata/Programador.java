  package abstrata;
 
 public class Programador extends Funcionario{

    public Programador(String nome, double salario){

        super(nome, salario);

    }

    public void aumentaSalario(){

        setSalario(getSalario()*1.20);
    }

 }