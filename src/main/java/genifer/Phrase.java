/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

/**
 *
 * @author me
 */
public class Phrase implements Term {
    
    public final Term[] components;
    
    public Phrase(Term... components) {
        this.components = components;
    }
    
    
}