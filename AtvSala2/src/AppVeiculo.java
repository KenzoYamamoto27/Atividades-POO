public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Toyota", "Supra");
        Veiculo v2 = new Caminhao("Scania", "R730");
        Veiculo v3 = new Moto("Kawasaki", "Ninja");
        Veiculo v4 = new Bicicleta("Caloi", "Bicicreta");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
    }
}