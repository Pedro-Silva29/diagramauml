
import java.util.ArrayList;

public class Biblioteca {

     ArrayList<Ebook> ebooks;
     UsuarioColaborador usuario;

     public Biblioteca() {
          ebooks = new ArrayList<>();
      }

     public void adicionarEbook(Ebook ebook){
          ebooks.add(ebook);
     }
     public void excluirEbook(Ebook ebook){
          ebooks.remove(ebook);
     }


     public void listarTodosEbooks() {
           for (Ebook ebook : ebooks){
               ebook.mostrarDados();

           }
      }

     public void listarEbooksAutorais() {
          
          for (Ebook ebook : ebooks) {
               if (ebook instanceof EbooksAutorais) {
                    ebook.mostrarDados();;
               }
          }
     
     }

     public void listarEbooksAdquiridos() {
          
          for (Ebook ebook : ebooks) {
               if (ebook instanceof EbooksAdquiridos) {
                    ebook.mostrarDados();;
               }
          }
          
     }
}
