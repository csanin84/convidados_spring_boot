package com.algaworks.festa.controller;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repository.IConvidado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

    @Autowired
    private IConvidado convidados;

    @GetMapping
    public ModelAndView listar(){
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");

        modelAndView.addObject("convidados", convidados.findAll());
        modelAndView.addObject("convidado", new Convidado());

        return modelAndView;
    }

    @PostMapping
    public String salvar(Convidado convidado){
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }
}
