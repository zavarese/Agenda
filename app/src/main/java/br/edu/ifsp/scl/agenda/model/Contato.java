package br.edu.ifsp.scl.agenda.model;

import java.io.Serializable;

public class Contato implements Serializable {
    private int id;
    private String nome;
    private int foto;
    private String mail;

    public Contato() {

    }

    public Contato(int id) {
        this.id = id;
    }

    public Contato(String nome, int foto, String mail) {
        this.id = id;
        this.nome = nome;
        this.foto = foto;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getNome() {
        return nome;
    }

    public int getFoto() {
        return foto;
    }

    public String getMail() { return mail; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setMail(String mail) { this.mail = mail; }
}
