/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.tads.dsw.curriculummvc.Model;

/**
 *
 * @author souza
 */
public class LayerOne {
    private String area;
    private String title;
    private String text;
    private Links links;
    
    public LayerOne() {
        this.area= "Back-end developer";
        this.title = "Olá, eu sou a Mariana!";
        this.text = "Tenho 19 anos e estou estudando programação à 2 anos. Atualmente tenho foco e atuo em programação com NodeJS (back-end) e eventualmente ReactJS (front-end). Atualmente, meus planos estão voltados à Inteligencia Artificial, tendo isso como objetivo e meta para alcançar futuramente.";
        this.links = new Links();
    }
}
