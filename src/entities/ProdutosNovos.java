package entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ProdutosNovos extends produtos {
    
    // ATRIBUTOS
    private Date vencimento;
    // ATRIBUTOS

    // CONSTRUTORES
  

    public ProdutosNovos(String nome, Double preco, Integer quantidade, Tipo tipo, Date fabricacao, Date vencimento) {
        super(nome, preco, quantidade, tipo, fabricacao);
        this.vencimento = vencimento;
    }
    // CONSTRUTORES



    // ENCAPSULAMENTO
    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
    // ENCAPSULAMENTO

    // METODOS
    public String toString() {
        return "Produto: " + getNome() + 
        "\n Preço: R$" + getPreco() + ", Quantidade: " + getQuantidade() + 
        "\n Tipo: " + getTipo() + 
        "\n Fabricação: " + sdf.format(getFabricado()) + " | Vencimento: " + sdf.format(vencimento) +
        "\n !NOVO!";
    }
    // METODOS
    

}