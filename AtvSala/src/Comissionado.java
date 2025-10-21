public class Comissionado extends Funcionario{
    private double salarioBase;
    private double txComissao;
    private double totalvenda;

    public Comissionado(String nome, double salarioBase, double txComissao, double totalvenda) {
        super(nome);
        this.salarioBase = salarioBase;
        this.txComissao = txComissao;
        this.totalvenda = totalvenda;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (txComissao * totalvenda);
    }
}
