import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public abstract class Usuario {

    private int idNome;
    private String nome;
    private String email;
    private String endereco;
    protected ArrayList<Emprestimo> listaEmprestimos;

    public Usuario(int idNome, String nome, String email, String endereco, ArrayList<Emprestimo> listaEmprestimos) {
        this.idNome = idNome;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.listaEmprestimos = new ArrayList<>();
    }

    public int getIdNome() {
        return idNome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void realizarEmprestimo(Emprestimo emprestimo) throws ExistePendenciaException, LimiteExcedidoException {
        if (temPendencias()) {
            throw new ExistePendenciaException("Você possui devoluções atrasadas.");
        }

        if (listaEmprestimos.size() >= getLimiteEmprestimos()) {
            throw new LimiteExcedidoException("Limite de empréstimos excedido");
        }

        listaEmprestimos.add(emprestimo);

        emprestimo.getLivro().emprestarLivro();
    }

    public int getQuantidadeEmprestimos() {
        return listaEmprestimos.size();
    }

    public abstract int getLimiteEmprestimos();

    public boolean temPendencias() {
        Date dataAtual = new Date();

        for (Emprestimo emprestimo : listaEmprestimos) {
            LocalDate dataDevolucao = emprestimo.getDataDevolucaoPrevista();

            if (dataDevolucao != null && dataAtual.after(dataDevolucao)) {
                return true;
            }
        }

        return false;
    }
}
