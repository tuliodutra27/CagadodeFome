package br.edu.iff.cagadodefome;

/**
 * Created by kamik on 24/10/2017.
 */

public class Cardapio {

    String nome;
    String descricao;
    String preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Cardapio(String nome, String descricao, String preco){
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
    }
}
