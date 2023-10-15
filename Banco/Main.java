public class Main {
    public static void main(String[] args) {

        Agencia_Bancaria agencia = new Agencia_Bancaria(123, "Comercio", "Joao");

        agencia.abrirCorrenteSimples("123.456.789-00", "Gabriel");
        agencia.abrirCorrenteEspecial("098.765.432-11", "Paulo");
        agencia.abrirCorrenteSimples("322.463.764.00", "Maria");
        agencia.listarContas();

    }
}