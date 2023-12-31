import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class UsuarioColaborador extends Usuario  {
    private String cpf;
    private CarrinhoDeCompras carrinho; 
    private Biblioteca biblioteca;
    
    public UsuarioColaborador(String nome, String email,String endereco,String numeroContato,String cpf, CarrinhoDeCompras carrinho, Biblioteca biblioteca) {
    super(nome,email,endereco,numeroContato);    this.cpf = cpf;
    this.carrinho = carrinho;
    this.biblioteca = biblioteca;
    }
 public String getCpf() {
 return cpf;
}
public void setCpf(String cpf) {
 this.cpf = cpf;
 }
    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }   
 public void setCarrinho(CarrinhoDeCompras carrinho) {
 this.carrinho = carrinho;
 }
 public Biblioteca getBiblioteca() {
 return biblioteca;
}
 public void setBiblioteca(Biblioteca biblioteca) {
 this.biblioteca = biblioteca;
 }
 

           
    public void adiquirirEbook(Ebook ebook){
            carrinho.addAoCarrinho(ebook);
        }
  public Ebook postarEbook(String titulo, UsuarioColaborador autor, Editoras editora, LocalDate dataPublicacao, ArrayList<String> generos, double preco, Editoras patrocinio, LocalDateTime localDateTime){
        Ebook e = new EbooksAutorais(  titulo,  autor,  editora, dataPublicacao,  generos,  preco,  patrocinio,localDateTime);
        return e;
    } 
}
