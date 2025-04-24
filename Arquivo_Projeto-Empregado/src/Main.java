public class Main {
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoHorista();
        empregado[1] = new EmpregadoComissionado();
        empregado[2] = new EmpregadoHorista();

        for (Empregado e : empregado) {
            System.out.println(e.calcularSalario());
        }


    }
}
