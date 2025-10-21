public class KenzoDungeon {
    public static void main(String[] args) {
        Personagem greg = new Guerreiro("Gregório o Bravo", 16);
        Personagem enzo = new Mago("Enzo o Necromante", 16);

        System.out.println("PLAYERS!!!");
        greg.exibirStatus();
        System.out.println(greg.atacar());

        System.out.println("--/--/--/--/--/--/--/--/--");

        enzo.exibirStatus();
        System.out.println(enzo.atacar());
    }
}