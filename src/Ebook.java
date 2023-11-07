
import java.util.ArrayList;
import java.time.LocalDate;

public class Ebook {
    protected String titulo;
    protected UsuarioColaborador autor;
    protected Editoras editora;
    protected LocalDate dataPublicacao;
    protected ArrayList<String> generoEbooks;
    protected double preco;
    protected Editoras patrocinio;


    public Ebook(String titulo, UsuarioColaborador autor, Editoras editora, LocalDate dataPublicacao,
                 ArrayList<String> generos, double preco, Editoras patrocinio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.generoEbooks = generos;
        this.preco = preco;
        this.patrocinio = patrocinio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public UsuarioColaborador getAutor() {
        return autor;
    }

    public void setAutor(UsuarioColaborador autor) {
        this.autor = autor;
    }

    public Editoras getEditora() {
        return editora;
    }

    public void setEditora(Editoras editora) {
        this.editora = editora;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public ArrayList<String> getGeneroEbooks() {
        return generoEbooks;
    }

    public void setGeneroEbooks(ArrayList<String> generoEbooks) {
        this.generoEbooks = generoEbooks;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editoras getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(Editoras patrocinio) {
        this.patrocinio = patrocinio;
    }

    public void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Editora: " + editora.getNome());
        System.out.println("Data de Publicação: " + dataPublicacao);
        System.out.println("Gêneros: " + generoEbooks);
        System.out.println("Preço: " + preco);
    }
}
