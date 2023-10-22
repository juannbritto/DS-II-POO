import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Agencia_Bancaria agencia = new Agencia_Bancaria(1, "Comercio", "Joao");
        Scanner scanner = new Scanner(System.in);

        // Sem precisar digitar para consultar
       /* try {
            // Abrir
            agencia.abrirContaCorrente("123.456.789-00", true);
            agencia.abrirContaCorrente("324.253.533-12", false);
            agencia.abrirContaCorrente("885.675.234-00", true);

            // Consulta pelo numero da conta
            int numeroConta = 1;
            String cpf = agencia.consultarCPFPorNumeroConta(numeroConta);
            System.out.println("O CPF da Conta de numero " + numeroConta + " é " + cpf);

            // Obter a conta pelo CPF
            String cpfParaConsulta = "123.456.789-00";
            Conta conta = agencia.obterContaPorCPF(cpfParaConsulta);
            System.out.println("Conta encontrada: Número: " + conta.getNumero() + ", CPF: " + conta.getCPF());
        }catch (EContaNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    } */
        // Pedindo para o usuario digitar o numero da conta e cpf para consultar
        try {
            // Criar contas
            agencia.abrirContaCorrente("123.456.789-00", true); // Conta Especial
            agencia.abrirContaCorrente("124.534.765-09", false); // Conta Simples
            agencia.abrirContaCorrente("432.654.234-00", true); // Conta Especial

            // Solicitar o número da conta a ser consultada
            System.out.print("Digite o número da conta que deseja consultar o CPF: ");
            int numeroConta = scanner.nextInt();

            // Consultar o CPF da conta
            String cpf = agencia.consultarCPFPorNumeroConta(numeroConta);
            System.out.println("O CPF da conta de número " + numeroConta + " é " + cpf);

            // Solicitar o CPF da pessoa que deseja consultar a conta
            System.out.print("Digite o CPF da pessoa que deseja consultar a conta: ");
            String cpfParaConsulta = scanner.next();

            // Obter a conta por CPF
            Conta conta = agencia.obterContaPorCPF(cpfParaConsulta);
            System.out.println("Conta encontrada: Número: " + conta.getNumero() + ", CPF: " + conta.getCPF());
        } catch (EContaNaoExisteException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}