public class Horista extends Funcionario{
    private double horaTrabalhada;
    private double valorHora;

    public Horista(String nome, double valorHora, double horaTrabalhada) {
        super(nome);
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horaTrabalhada * valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "valorHora=" + valorHora +
                ", nome='" + nome + '\'' +
                '}';
    }
}
