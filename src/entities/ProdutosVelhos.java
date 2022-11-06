package entities;

import java.util.Date;

public class ProdutosVelhos extends produtos {
    
    // ATRIBUTOS
    private Date vencido;
    // ATRIBUTOS

    // CONSTRUTORES
    public ProdutosVelhos() {
        super();
    }

    public ProdutosVelhos(Date vencido) {
        this.vencido = vencido;
    }

    public ProdutosVelhos(String nome, Double preco, Integer quantidade, Tipo tipo, Date fabricado, Date vencido) {
        super(nome, preco, quantidade, tipo, fabricado);
        this.vencido = vencido;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public void setVencido(Date vencido) {
        this.vencido = vencido;
    }

    public Date getVencido() {
        return vencido;
    }
    // ENCAPSULAMENTO

    // METODOS
    public String toString() {
        return "Produto: " + getNome() + 
        "\n Preço: R$" + getPreco() + ", Quantidade: " + getQuantidade() + 
        "\n Tipo: " + getTipo() + 
        "\n Fabricação: " + sdf.format(getFabricado()) + " | Vencimento: " + sdf.format(vencido) + 
        "\n !VELHOS!";
    }
    // METODOS

    
    

}
