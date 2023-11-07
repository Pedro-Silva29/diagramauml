import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        

        Biblioteca biblioteca = new Biblioteca();

        UsuarioColaborador autor = new UsuarioColaborador("14094283221","João", "joao@email.com", "Endereço", "123456789");
        Ebook ebook1 = new EbooksAdquiridos("Livro 1", autor, new Editoras("Editora Y eb1", "CNPJ da Editora Y eb1","end edit eb1","numc edito eb1","cnpj edit eb1"), LocalDate.now(), new ArrayList<String>(), 29.0, new Editoras("jureg ebook1", "email do jureg ebook1","endteste ebook1", "numcontato ebook1","cnpjEbok1"), LocalDateTime.parse("2007-12-03T10:15:30"));
        
        Ebook ebook2 = new EbooksAutorais("Livro 2", autor, new Editoras("Editora Y eb1", "CNPJ da Editora Y eb1","end edit eb1","numc edito eb1","cnpj edit eb1"), LocalDate.now(), new ArrayList<String>(), 50.0, new Editoras("jureg ebook1", "email do jureg ebook1","endteste ebook1", "numcontato ebook1","cnpjEbok1"), LocalDateTime.parse("2007-12-03T10:15:30"));

        biblioteca.adicionarEbook(ebook2);
        biblioteca.adicionarEbook(ebook1);

        System.out.println("Todos os Ebooks:");
        biblioteca.listarEbooksAdquiridos();
        System.out.println("Separaçãoooooo");
        biblioteca.listarEbooksAutorais();
        

    }
}