/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.tads.dsw.curriculummvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author souza
 */

@Controller
@RequestMapping("/old")
public class ExemploController {
    @GetMapping("/curriculum")
    public ModelAndView getMessage() {
        ModelAndView view = new ModelAndView("curriculum-view");
        view.addObject("nome", "Mariana Souza do Carmo");
        view.addObject("email", "mariana0026souza@gmail.com");
        view.addObject("telefone","(11) 98888-7777");
        view.addObject("dataNascimento", "26/08/2004");
        view.addObject("github", "https://github.com/maricsouza");
        view.addObject("linkedin", "https://www.linkedin.com/in/mariana-souza-240368224");
        return view;
    }
}
