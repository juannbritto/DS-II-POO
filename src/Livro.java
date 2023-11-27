public class Livro {

    private int isbn;
    private String titulo;
    private int anoPublicacao;
    private int quantExemplares;

    public Livro(int isbn, String titulo, int anoPublicacao, int quantExemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.quantExemplares = quantExemplares;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantExemplares() {
        return quantExemplares;
    }

    public void setQuantExemplares(int quantExemplares) {
        this.quantExemplares = quantExemplares;
    }


}
