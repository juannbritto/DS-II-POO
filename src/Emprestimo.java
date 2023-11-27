import java.time.LocalDate;

public class Emprestimo {

    private int idEmprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoRealizada;

    public Emprestimo(int idEmprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista, LocalDate dataDevolucaoRealizada) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoRealizada = dataDevolucaoRealizada;
    }



    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoRealizada() {
        return dataDevolucaoRealizada;
    }
}
