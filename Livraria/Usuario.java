import java.util.ArrayList;

    public abstract class Usuario {

        private int idNome;
        private String nome;
        private String email;
        private String endereco;
        private ArrayList<Emprestimo> listaEmprestimos;
        protected int maxLivrosEmprestados;


        public Usuario(int idNome, String nome, String email, String endereco, ArrayList<Emprestimo> listaEmprestimos, int maxLivrosEmprestados) {
            this.idNome = idNome;
            this.nome = nome;
            this.email = email;
            this.endereco = endereco;
            this.listaEmprestimos = new ArrayList<>();
            this.maxLivrosEmprestados = maxLivrosEmprestados;
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

        public void realizarEmprestimo(Livro livro) throws QuantidadeInvalidaException {
            if (livro.getQuantExemplares() <= 0) {
                throw new QuantidadeInvalidaException("Exemplares esgotados, não foi possivel fazer o emprestimo");
            }

            livro.emprestarLivro();
            Emprestimo emprestimo = new Emprestimo();
            listaEmprestimos.add(emprestimo);

        }

        public void devolverLivro (Livro livro) {
            livro.devolucao();
        }

}

