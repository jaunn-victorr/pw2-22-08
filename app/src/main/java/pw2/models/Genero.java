package pw2.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class Genero {
    private int id;
    private String nome;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
