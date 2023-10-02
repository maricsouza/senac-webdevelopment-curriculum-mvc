/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.tads.dsw.curriculummvc.Model;

/**
 *
 * @author souza
 */
public class LayerFour {
    String title;
    Formation compl1;
    Formation compl2;
    Formation compl3;
    Formation compl4;
    
    public LayerFour() {
        this.title = "Formações Complementares e Idiomas";
        this.compl1 = new Formation("2022", "Digital Innovation One","Introdução à Programação e Pensamento Computacional");
        this.compl2 = new Formation("2022", "Cisco", "Introduction to CyberSecurity");
        this.compl3 = new Formation("Espanhol", "Basico");
        this.compl4 = new Formation("Ingles", "Intermediario");
    }
}
