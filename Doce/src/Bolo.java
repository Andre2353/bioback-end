public class Bolo extends Doce {

    public Bolo(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void Cobertura() {
        System.out.println("Cobertura de materia escura (chocolatee)");
    }

}