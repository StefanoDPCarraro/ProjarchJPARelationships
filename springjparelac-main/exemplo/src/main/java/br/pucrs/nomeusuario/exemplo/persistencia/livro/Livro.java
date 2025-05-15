package br.pucrs.nomeusuario.exemplo.persistencia.livro;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.pucrs.nomeusuario.exemplo.persistencia.autor.Autor;
import br.pucrs.nomeusuario.exemplo.persistencia.editora.Editora;
import jakarta.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Livro {
    @Id
    private long id;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Editora editora;
    private String titulo;
    @ManyToOne()
    private Autor autor;
    private int ano;

    protected Livro() {        
    }

    public Livro(long id, Editora editora, String titulo, Autor autor, int ano) {
        this.id = id;
        this.editora = editora;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public Editora getEditora() {
        return editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

}
