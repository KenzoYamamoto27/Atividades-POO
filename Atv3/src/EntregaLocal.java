public class EntregaLocal extends Entrega {
    public EntregaLocal(String codigoPedido) {
        super(codigoPedido);
    }

    @Override
    public double calcularFrete() {
        return 10.00;
    }
}
