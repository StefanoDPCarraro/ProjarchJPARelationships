package br.pucrs.nomeusuario.exemplo.persistencia.autor;

import java.util.List;

public interface IAutorRepository {
    List<Autor> getAutores();
    Autor getAutor(long id);
}
