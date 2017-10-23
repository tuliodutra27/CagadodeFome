package br.edu.iff.cagadodefome;

/**
 * Created by kamik on 22/10/2017.
 */

public class Estabelecimento {

    private String nome;
    private long id;
    private int imagem;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setImagem(int imagem){
        this.imagem = imagem;
    }

    public String getNome(){
        return this.nome;
    }

    public long getId(){
        return this.id;
    }

    public int getImagem(){
        return this.imagem;
    }

    public Estabelecimento(String nome, long id, int imagem){
        this.nome = nome;
        this.id = id;
        this.imagem = imagem;
    }
}
