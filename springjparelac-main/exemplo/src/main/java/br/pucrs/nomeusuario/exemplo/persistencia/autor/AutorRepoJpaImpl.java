package br.pucrs.nomeusuario.exemplo.persistencia.autor;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class AutorRepoJpaImpl implements IAutorRepository {
    private IAutorJpaItfRep repository;
    public AutorRepoJpaImpl(IAutorJpaItfRep iAutorJpaItfRep){
        repository = iAutorJpaItfRep;
    }
    @Override
    public Autor getAutor(long id) {
        Autor autor = repository.findById(id);
        return autor;
    }
    @Override
    public List<Autor> getAutores() {
        List<Autor> autores = repository.findAll();
        if(autores.size() == 0){
            return new LinkedList<Autor>();
        } else{
            return autores.stream().toList();
        }
    }
}
