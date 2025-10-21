public class Main {
    public static void main(String[] args) {
        Funcionario gregMensal = new Mensalista("GregórioMensalista", 10000);
        Funcionario enzoHorinha = new Horista("EnzoHorista", 150.0, 32);
        Funcionario eduardoSafado = new Comissionado("EduardoComissão",2000,1.5,1000);

        System.out.println(gregMensal.calcularSalario());
        System.out.println(enzoHorinha.calcularSalario());
        System.out.println(eduardoSafado.calcularSalario());
    }
}