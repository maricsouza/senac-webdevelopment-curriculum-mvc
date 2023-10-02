/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.tads.dsw.curriculummvc.Model;

/**
 *
 * @author souza
 */
public class Formation {
    String data;
    String local;
    String course;
    
    public Formation(String data, String local, String course)  {
        this.data = data;
        this.local = local;
        this.course = course;
    }
    
    public Formation (String local, String course) {
        this.local = local;
        this.course = course;
    }
}
