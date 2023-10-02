/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.tads.dsw.curriculummvc.Model;

/**
 *
 * @author souza
 */

public class CurriculumObject {
    
    private LayerOne lay01;
    private LayerTwo lay02;
    private LayerThree lay03;
    private LayerFour lay04;

    public CurriculumObject () {
        this.lay01 = new LayerOne();
        this.lay02 = new LayerTwo();
        this.lay03 = new LayerThree();
        this.lay04 = new LayerFour();
    }
}