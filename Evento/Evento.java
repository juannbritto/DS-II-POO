import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private int quantidadeMaximaIngressos;
    private double valorIngressoBasico;
    private double valorAdicionalVIP;
    private List<String> ingressosVendidos;

    public Evento(String nome, String data, String local, int quantidadeMaximaIngressos, double valorIngressoBasico, double valorAdicionalVIP) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.quantidadeMaximaIngressos = quantidadeMaximaIngressos;
        this.valorIngressoBasico = valorIngressoBasico;
        this.valorAdicionalVIP = valorAdicionalVIP;
        this.ingressosVendidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public double getValorArrecadado() {
        double valorTotal = 0.0;
        for (String ingresso : ingressosVendidos) {
            if (ingresso.equals("VIP")) {
                valorTotal += valorIngressoBasico + valorAdicionalVIP;
            } else {
                valorTotal += valorIngressoBasico;
            }
        }
        return valorTotal;
    }

    public double getValorIngressoBasico() {
        return valorIngressoBasico;
    }

    public double getValorAdicionalVIP() {
        return valorAdicionalVIP;
    }

    public int getQuantidadeIngressosDisponiveis() {
        return quantidadeMaximaIngressos - ingressosVendidos.size();
    }

    public void setQuantidadeMaximaIngressos(int novaQuantidade) {
        if (novaQuantidade >= ingressosVendidos.size()) {
            quantidadeMaximaIngressos = novaQuantidade;
        } else {
            throw new EValorInvalidoException("A nova quantidade não pode ser menor que a quantidade de ingressos vendidos.");
        }
    }

    public void setValoresIngresso(double novoValorIngressoBasico, double novoValorAdicionalVIP) {
        if (novoValorIngressoBasico > 0 && novoValorAdicionalVIP > 0) {
            valorIngressoBasico = novoValorIngressoBasico;
            valorAdicionalVIP = novoValorAdicionalVIP;
        } else {
            throw new EValorInvalidoException("Os novos valores de ingresso não podem ser menores ou iguais a zero.");
        }
    }

    public void venderIngresso(String tipoIngresso, String dadosCliente) {
        if (getQuantidadeIngressosDisponiveis() > 0) {
            if (tipoIngresso.equals("VIP") || tipoIngresso.equals("Básico")) {
                ingressosVendidos.add(tipoIngresso);
            } else {
                throw new ETipoInvalidoException("Tipo de ingresso inválido. Use 'VIP' ou 'Básico'.");
            }
        } else {
            throw new EEventoLotadoException("O evento está lotado, não é possível vender mais ingressos.");
        }
    }

    // Outros métodos, getters e setters podem ser adicionados conforme necessário.
}



