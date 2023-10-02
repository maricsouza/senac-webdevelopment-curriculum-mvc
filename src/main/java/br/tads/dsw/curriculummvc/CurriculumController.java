/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.tads.dsw.curriculummvc;

import br.tads.dsw.curriculummvc.Model.LayerOne;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author souza
 */
@Controller
@RequestMapping("/curriculum")
public class CurriculumController {
    @GetMapping("/")
    public ModelAndView getCurriculum() {
        ModelAndView view = new ModelAndView("curriculum");
        view.addObject("lay01", new LayerOne());
        return view;
    }
}
