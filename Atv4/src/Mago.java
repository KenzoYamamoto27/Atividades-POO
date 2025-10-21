public class Mago extends Personagem{
    public Mago(String nome, double nivel) {
        super(nome, nivel);
    }

    @Override
    public String atacar() {
        return "azarath metrion zinthos!";
    }


}