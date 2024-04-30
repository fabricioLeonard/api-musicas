package br.com.developeracademy.musica;

import java.io.Serializable;

public class MusicaDTO implements Serializable {
    private String nome;
    private Double duracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }
}
