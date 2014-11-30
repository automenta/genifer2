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
public class Var extends Atom {

    final double probability;
    
    public Var(CharSequence name, double probability) {
        super(name);
        this.probability = probability;
    }
    
    @Override
    public boolean hasVar() {
        return true;
    }

    @Override
    public String toString() {
        return "?" + super.toString();
    }
    
    
    
}
