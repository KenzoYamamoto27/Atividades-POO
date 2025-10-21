public abstract class Personagem {
    private String nome;
    private double nivel;

    public Personagem(String nome, double nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public abstract String atacar();

    public void exibirStatus(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", nível=" + nivel +
                '}';
    }
}
