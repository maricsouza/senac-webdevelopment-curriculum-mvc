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
@RequestMapping("/exemplo")
public class ExemploController {
    @GetMapping("/curriculum")
    public ModelAndView getMessage() {
        ModelAndView view = new ModelAndView("curriculum");
        return view;
    }
}
