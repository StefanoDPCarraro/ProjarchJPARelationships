package br.pucrs.nomeusuario.exemplo.persistencia.livro;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IAcervoJpaItfRep extends CrudRepository<Livro,Long>{
    @SuppressWarnings("null")
    List<Livro> findAll(); 
    Livro findById(long id); 
}




