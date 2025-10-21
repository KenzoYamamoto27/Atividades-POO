public abstract class Entrega {
    private String codigoPedido;

    public Entrega(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public abstract double calcularFrete();


    public void exibirResumo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        double valorFrete = calcularFrete();

        return "Entrega [Código: " + this.codigoPedido +
                ", Valor do Frete: R$ " + valorFrete + "]";
    }
}
