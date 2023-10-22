public class Conta_Corrente {
    private int agencia;
    private int numero;
    protected double saldo;
    private String nome;
    private String cpf;

    public Conta_Corrente(int agencia, int numero, double saldo, String nome, String cpf) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
        this.nome = nome;
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        }else{
            throw new EValorInvalidoException("O valor do seu deposito deve ser maior que zero ");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        }else{
            throw new ESaldoInsuficienteException("Seu Saldo é insuficiente ou o valor do saque é invalido");
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente: " +
                "\n Agencia: " + agencia +
                "\n Numero: " + numero +
                "\n Saldo: " + saldo +
                "\n Nome: " + nome +
                "\n CPF: " + cpf;
    }
}
