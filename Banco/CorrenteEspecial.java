public class CorrenteEspecial extends Conta_Corrente {

    private double limiteCredito;

    public CorrenteEspecial(int agencia, int numero, double saldo, String nome, String cpf, double limiteCredito) {
        super(agencia, numero, saldo, nome, cpf);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}
