package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogosLivros {
    //Atributo
    private List<Livro> livroList;

    /*
    Criando uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. 
    Cada livro possui atributos como título, autor e ano de publicação 
    */
    public CatalogosLivros() {
        this.livroList = new ArrayList<>();
    }

    //Adiciona um livro ao catálogo.
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro>livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    //Pesquisa livros por título e retorna o primeiro livro encontrado.
    public Livro pesquisarPorTitulo (String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogosLivros catalogosLivros = new CatalogosLivros();
        catalogosLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogosLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogosLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogosLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogosLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogosLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogosLivros.pesquisaPorIntervaloAnos(2020,2022));
        System.out.println(catalogosLivros.pesquisarPorTitulo("Livro 1"));

    }
}
