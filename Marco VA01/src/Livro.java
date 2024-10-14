public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }
    public String getTitulo(){
        return titulo;
    }
    public void exibirInformacoes(){
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoDePublicacao);
}
}