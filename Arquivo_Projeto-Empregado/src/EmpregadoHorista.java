public class EmpregadoHorista extends Empregado {
    int totalDeHorasTrabalhada;
    double valorDeHoraTrabalhada;

    @Override
    public double calcularSalario() {
        return totalDeHorasTrabalhada * valorDeHoraTrabalhada;
    }


}
