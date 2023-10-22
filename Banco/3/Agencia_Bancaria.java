import java.util.ArrayList;

public class Agencia_Bancaria {
    private int numeroAgencia;
    private String local;
    private String nomeGerente;
    private ArrayList<Conta> contas;

    public Agencia_Bancaria(int numeroAgencia, String local, String nomeGerente) {
        this.numeroAgencia = numeroAgencia;
        this.local = local;
        this.nomeGerente = nomeGerente;
        this.contas = new ArrayList<>();
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getLocal() {
        return local;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public int gerarNumeroConta(){
        return contas.size();
    }

   private Conta buscarContaPorCPF (String cpf) {
        for (Conta conta : contas) {
            if (conta.getCPF().equals(cpf)) {
                return conta;
            }
        }
        return null;
   }

   public void abrirContaCorrente(String cpf, boolean especial) {
        if (buscarContaPorCPF(cpf) != null) {
            System.out.println("A conta com o CPF " + cpf + " já existe ");
        } else {
            int numeroConta = gerarNumeroConta();
            Conta conta = new Conta(numeroConta, cpf);
            contas.add(conta);
        }
   }

   public Conta obterContaPorCPF(String cpf) throws EContaNaoExisteException {
        Conta conta = buscarContaPorCPF(cpf);
        if (conta != null) {
            return conta;
        }else {
            throw new EContaNaoExisteException("A conta com o CPF: " + cpf + " não foi encontrada");
        }
   }

   public String consultarCPFPorNumeroConta(int numeroConta) throws EContaNaoExisteException {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.getCPF();
            }
        }
        throw new EContaNaoExisteException("A conta de número: " + numeroConta + " não foi encontrada ");
   }
}
