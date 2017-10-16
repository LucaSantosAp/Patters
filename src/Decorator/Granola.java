/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Luciano
 */
public class Granola extends Ingrediente{
    
    public Granola(Sobremesa sobremesa){
        super(sobremesa, "Granola", 1.50);
    }
}
