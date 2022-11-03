package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtos {

    // ATRIBUTOS
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Tipo tipo;
    private Date fabricado;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    // ATRIBUTOS

    // CONSTRUTORES
    public produtos() {
    }

    public produtos(String nome, Double preco, Integer quantidade, Tipo tipo, Date fabricado) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.fabricado = fabricado;
    }
    // CONSTRUTORES


    // ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setFabricado(Date fabricado) {
        this.fabricado = fabricado;
    }
    public Date getFabricado() {
        return fabricado;
    }
    // ENCAPSULAMENTO

}