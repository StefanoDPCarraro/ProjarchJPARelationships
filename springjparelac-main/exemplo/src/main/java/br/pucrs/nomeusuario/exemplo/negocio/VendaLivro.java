package br.pucrs.nomeusuario.exemplo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.pucrs.nomeusuario.exemplo.persistencia.livro.Livro;


@Component
public class VendaLivro {

    @Autowired
    public VendaLivro() {
        
    }

    public double calculaPreco(Livro livro) {
        if(livro.getAno() >= 2023)
            return 100;
        else
            return 50;
    }

}
