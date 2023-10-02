/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.tads.dsw.curriculummvc.Model;

/**
 *
 * @author souza
 */
public class LayerTwo {
    String title;
    Formation form1;
    Formation form2;
    Formation form3;
    Formation form4;
    
    public LayerTwo() {
        this.title = "Formação Academica";
        this.form1 = new Formation("2022-2024","Centro Universitario Senac", "Analise e Desenvolvimento de Sistemas");
        this.form2 = new Formation("2023", "Instituto Nossa Senhora de Fatima","Ingles Avancado");
        this.form3 = new Formation("2022", "Instituto Nossa Senhora de Fatima","Tecnico em Informatica");
        this.form4 = new Formation("2021", "Instituto Nossa Senhora de Fatima","Tecnico em Administracao");
    }
}
