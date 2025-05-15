package br.pucrs.nomeusuario.exemplo.persistencia.autor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.pucrs.nomeusuario.exemplo.persistencia.livro.Livro;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "numero")
public class Autor {
    @Id
    private long numero;
    private String nome;
    private int anoNascimento;
    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;
    
    public Autor() {
    }
    
    public long getNumero() {
        return numero;
    }
  
  public void setNumero(long numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
