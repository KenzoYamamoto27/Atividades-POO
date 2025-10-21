public class Guerreiro extends Personagem{
    public Guerreiro(String nome, double nivel) {
        super(nome, nivel);
    }

    @Override
    public String atacar() {
        return "Golpe de espada!";
    }
}
