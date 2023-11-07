import java.util.ArrayList;

public class Editoras extends Usuario{
    private String CNPJ;
    private ArrayList<Ebook> livrosPatrocinados;

    public Editoras(String nome, String email, String endereco, String numeroContato,String CNPJ) {
        super(nome, email, endereco, numeroContato);
        this.CNPJ = CNPJ;
        this.livrosPatrocinados = new ArrayList<>();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public ArrayList<Ebook> getLivrosPatrocinados() {
        return livrosPatrocinados;
    }

    public void setLivrosPatrocinados(ArrayList<Ebook> livrosPatrocinados) {
        this.livrosPatrocinados = livrosPatrocinados;
    }

    public void patrocinarEbook(Ebook ebook) {
        livrosPatrocinados.add(ebook);
    }

    public String getNome() {
        return getNome();
    }
}

