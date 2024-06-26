package br.projeto.api.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controle {

    @GetMapping("")
       
    public String mensagem (){
        return "Olá, eu sou o desenvolvedor Flávio!";
    }
}
