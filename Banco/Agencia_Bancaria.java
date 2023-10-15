import java.util.ArrayList;
import java.util.List;

public class Agencia_Bancaria {

    private int numeroAgencia;
    private String local;
    private String nomeGerente;
    private List<String> contasCriadas;


    public Agencia_Bancaria(int numeroAgencia, String local, String nomeGerente) {
        this.numeroAgencia = numeroAgencia;
        this.local = local;
        this.nomeGerente = nomeGerente;
        this.contasCriadas = new ArrayList<>();


    }

    public int getNumero() {
        return numeroAgencia;
    }

    public String getLocal() {
        return local;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public List<String> getContasCriadas() {
        return contasCriadas;
    }

    public void abrirCorrenteSimples(String cpf, String nomeCliente) {
        String numeroConta = gerarNumeroConta();
        contasCriadas.add(numeroConta);
    }

    public void abrirCorrenteEspecial(String cpf, String NomeCliente) {
        String numeroConta = gerarNumeroConta();
        contasCriadas.add(numeroConta);
    }

    public void listarContas() {
        System.out.println("Agencia " + numeroAgencia + ";");
        System.out.println("Gerente: " + nomeGerente);
        System.out.println("Local: " + local);
        for (String conta : contasCriadas) {
            System.out.println("Numero da Conta: " + conta);
        }

    }

    private String gerarNumeroConta() {
        return "" + contasCriadas.size() ;
    }



    @Override
    public String toString() {
        return "Agencia_Bancaria: " +
                "\n Numero da Agencia: " + numeroAgencia +
                "\n Local: " + local +
                "\n Nome do Gerente: " + nomeGerente +
                "\n Contas Criadas: " + contasCriadas;
    }
}
