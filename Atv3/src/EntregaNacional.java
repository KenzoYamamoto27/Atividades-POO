public class EntregaNacional extends Entrega {
    private double distancia;

    public EntregaNacional(String codigoPedido, double distancia) {
        super(codigoPedido);
        this.distancia = distancia;
    }

    @Override
    public double calcularFrete() {
        return distancia * 1.5;
    }
}
