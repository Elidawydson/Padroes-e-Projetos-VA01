public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Usuario usuario1 = new Usuario("Ana");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.exibirLivrosDisponiveis();
        usuario1.emprestarLivro(biblioteca, livro1);
        usuario1.exibirLivrosEmprestados();
        biblioteca.exibirLivrosDisponiveis();
        usuario1.devolverLivro(biblioteca, livro1);
}
}