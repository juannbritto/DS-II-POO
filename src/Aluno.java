import java.util.ArrayList;

public class Aluno extends Usuario{

    public Aluno(int idNome, String nome, String email, String endereco, ArrayList<Emprestimo> listaEmprestimos) {
        super(idNome, nome, email, endereco, listaEmprestimos);
    }

    public int getLimiteEmprestimos() {
        return 3;
    }
}
