package br.pucrs.nomeusuario.exemplo.persistencia.livro;

import java.util.List;

public interface IAcervoRepository {
    List<Livro> getLivros();
    Livro getLivroId(long id);
}