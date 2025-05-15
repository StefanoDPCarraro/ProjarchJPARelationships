package br.pucrs.nomeusuario.exemplo.apresentacao;

import br.pucrs.nomeusuario.exemplo.persistencia.autor.Autor;
import br.pucrs.nomeusuario.exemplo.persistencia.autor.IAutorRepository;
import br.pucrs.nomeusuario.exemplo.persistencia.editora.Editora;
import br.pucrs.nomeusuario.exemplo.persistencia.editora.IEditoraRepository;
import br.pucrs.nomeusuario.exemplo.persistencia.livro.IAcervoRepository;
import br.pucrs.nomeusuario.exemplo.persistencia.livro.Livro;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/biblioteca")
public class ExemploController {
    private IAcervoRepository acervo;
    private IEditoraRepository editoras;
    private IAutorRepository autores;

    @Autowired
    public ExemploController(IAcervoRepository acervo, IEditoraRepository editoras, IAutorRepository authors) {
        this.acervo = acervo;        
        this.editoras = editoras;
        this.autores = authors;
    }

    @GetMapping("")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return acervo.getLivros();
    }

    @GetMapping("/livroid/{id}")
    public Livro getLivroId(@PathVariable("id") long id) {
        return acervo.getLivroId(id);
    }

    @GetMapping("/editoras")
    public List<Editora> getEditoras() {
        return editoras.getEditoras();
    }

    @GetMapping("/editoracod/{cod}")
    public Editora getEditoraCodigo(@PathVariable("cod") long codigo) {
        return editoras.getEditoraCodigo(codigo);
    }

    @PostMapping("/novaeditora")
    public boolean cadastraLNovaEditora(@RequestBody final Editora editora) {
        editoras.addEditora(editora);
        return true;
    }

    @GetMapping("/autorid/{id}")
    public Autor getAutor(@PathVariable Long id){
        return autores.getAutor(id);
    }

    @GetMapping("/autores")
    public List<Autor> getAutores(){
        return autores.getAutores();
    }

}