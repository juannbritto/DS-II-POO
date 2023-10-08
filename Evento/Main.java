
public class Main {
    public static void main(String[] args) {
        // Criando um evento
        Evento evento = new Evento("Festa de Aniversário", "2023-10-15", "Salão de Festas", 100, 50.0, 20.0);

        // Vender ingressos
        try {
            evento.venderIngresso("VIP", "Cliente 1");
            evento.venderIngresso("Básico", "Cliente 2");
            evento.venderIngresso("VIP", "Cliente 3");
        } catch (EEventoLotadoException e) {
            System.out.println("Não é possível vender mais ingressos, o evento está lotado.");
        } catch (ETipoInvalidoException e) {
            System.out.println("Tipo de ingresso inválido.");
        }

        // Exibindo informações do evento
        System.out.println("Nome do Evento: " + evento.getNome());
        System.out.println("Data do Evento: " + evento.getData());
        System.out.println("Local do Evento: " + evento.getLocal());
        System.out.println("Quantidade de Ingressos Disponíveis: " + evento.getQuantidadeIngressosDisponiveis());
        System.out.println("Valor Arrecadado: R$" + evento.getValorArrecadado());

        // Alterando a quantidade máxima de ingressos (deve gerar exceção)
        try {
            evento.setQuantidadeMaximaIngressos(90);
        } catch (EValorInvalidoException e) {
            System.out.println("Não foi possível alterar a quantidade máxima de ingressos.");
        }

        // Alterando os valores dos ingressos
        try {
            evento.setValoresIngresso(60.0, 30.0);
        } catch (EValorInvalidoException e) {
            System.out.println("Não foi possível alterar os valores dos ingressos.");
        }
    }
}
