package model;

import java.time.LocalTime;

public class Volta {

    private LocalTime tempo;
    private LocalTime hora;
    private String codigo;
    private String nome;
    private Integer numeroDaVolta;
    private Integer posicaoDeChegada;
    private Double velocidadeMedia;

    public Volta() {
    }

    public Volta(LocalTime tempo, LocalTime hora, String codigo, String nome, Integer numeroDaVolta, Integer posicaoDeChegada, Double velocidadeMedia) {
        this.tempo = tempo;
        this.hora = hora;
        this.codigo = codigo;
        this.nome = nome;
        this.numeroDaVolta = numeroDaVolta;
        this.posicaoDeChegada = posicaoDeChegada;
        this.velocidadeMedia = velocidadeMedia;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDaVolta() {
        return numeroDaVolta;
    }

    public void setNumeroDaVolta(Integer numeroDaVolta) {
        this.numeroDaVolta = numeroDaVolta;
    }

    public Integer getPosicaoDeChegada() {
        return posicaoDeChegada;
    }

    public void setPosicaoDeChegada(Integer posicaoDeChegada) {
        this.posicaoDeChegada = posicaoDeChegada;
    }

    public Double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(Double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}
