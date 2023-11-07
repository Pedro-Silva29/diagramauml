public class Usuario {
    protected String nome;
    protected String email;
    protected String endereco;
    protected String numeroContato;

    public Usuario(String nome, String email,String endereco,String numeroContato){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.numeroContato = numeroContato;
    }
    //public void avaliarEbook(Ebook ebook, double nota){
    //    ebook.nota += nota;
    //    ebook.totalVotos +=1;
    //}

    public void comentarEbook(){
        System.out.println("Bla bla bla");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }
}