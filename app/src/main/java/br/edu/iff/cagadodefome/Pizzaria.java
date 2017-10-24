package br.edu.iff.cagadodefome;

/**
 * Created by kamik on 23/10/2017.
 */

public class Pizzaria {

    public Pizzaria(String nome, String status, String horario_funcionamento, String telefone, int imagem, long id) {
        this.nome = nome;
        this.status = status;
        this.horario_funcionamento = horario_funcionamento;
        this.telefone = telefone;
        this.imagem = imagem;
        this.id = id;
    }

    private String nome;
    private String status;
    private String horario_funcionamento;
    private String telefone;
    private int imagem;
    private long id;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public int getImagem(){
        return imagem;
    }

    public void setImagem(int imagem){
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHorario_funcionamento() {
        return horario_funcionamento;
    }

    public void setHorario_funcionamento(String horario_funcionamento) {
        this.horario_funcionamento = horario_funcionamento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
