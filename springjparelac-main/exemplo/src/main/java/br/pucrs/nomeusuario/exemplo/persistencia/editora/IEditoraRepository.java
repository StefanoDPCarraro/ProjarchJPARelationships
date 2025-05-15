package br.pucrs.nomeusuario.exemplo.persistencia.editora;

import java.util.List;

public interface IEditoraRepository {
    List<Editora> getEditoras();
    Editora getEditoraCodigo(long codigo);
    boolean addEditora(Editora editora);
}

