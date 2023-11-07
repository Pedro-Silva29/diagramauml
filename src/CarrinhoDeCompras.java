import java.time.LocalDateTime;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Ebook> ebooks;
    private double valorTotal;
    private LocalDateTime dataCompra;

    public CarrinhoDeCompras() {
        ebooks = new ArrayList<>();
        valorTotal = 0.0;
        dataCompra = LocalDateTime.now();
    }

    public void addAoCarrinho(Ebook ebook) {
        ebooks.add(ebook);
        valorTotal += ebook.getPreco();
    }

    public void removerDoCarrinho(Ebook ebook) {
        if (ebooks.contains(ebook)) {
            ebooks.remove(ebook);
            valorTotal -= ebook.getPreco();
        }
    }

    public void realizarPagamento() {
        dataCompra = LocalDateTime.now();
    }
}