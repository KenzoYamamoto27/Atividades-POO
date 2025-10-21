public abstract class Veiculo {
    private String moelo;
    private String marca;

    public Veiculo(String marca, String moelo) {
        this.marca = marca;
        this.moelo = moelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "moelo='" + moelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
