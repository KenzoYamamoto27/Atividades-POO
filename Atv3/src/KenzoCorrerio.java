    public class KenzoCorrerio {
    public static void main(String[] args) {
        Entrega n1 = new EntregaLocal("MetanolEngarrafado1029384756");

        Entrega n2 = new EntregaNacional("PremioMarcelão122333444455555",24);

        n1.exibirResumo();
        System.out.println("-//-//-//-//-//-//-//-//-//-//-//-");
        n2.exibirResumo();
    }
}