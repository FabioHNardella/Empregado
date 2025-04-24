public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    @Override
    public double calcularSalario() {
        return totalDeVendas * comissao / 100;
    }


}
