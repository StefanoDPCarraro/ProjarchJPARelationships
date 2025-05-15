package br.pucrs.nomeusuario.exemplo.persistencia.autor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IAutorJpaItfRep extends CrudRepository<Autor,Long>{
    List<Autor> findAll();
    Autor findById(long id);
}
