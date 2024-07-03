/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrfleipelima.matematica;

/**
 *
 * @author ALUNO
 */
public class CanetaMagica {
    private FiguraGeometrica figuraGeometrica;
    
    public CanetaMagica(FiguraGeometrica fig) {
        this.figuraGeometrica = fig;
    }
    
    public void desenha() {
        figuraGeometrica.desenha();
    }    
}
