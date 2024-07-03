/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mrfleipelima.matematica;

/**
 *
 * @author ALUNO
 */
public class Matematica {

    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica();
        figura.desenha();
        
        Circulo circulo = new Circulo();
        circulo.desenha();
        
        Quadrado quadrado = new Quadrado();
        quadrado.desenha();
        
        Triangulo triangulo = new Triangulo();
        triangulo.desenha();
        
        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero();
        trianguloEquilatero.desenha();
        
        CanetaMagica caneta = new CanetaMagica(quadrado);
        caneta.desenha();
    }
}
