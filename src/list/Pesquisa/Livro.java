package list.Pesquisa;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    
    @Override
    public String toString() {
        return "Livro [ Titulo = " + titulo + ", Autor = " + autor + ", Ano de publicação = " + anoPublicacao + " ]";
    }


    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    
}
