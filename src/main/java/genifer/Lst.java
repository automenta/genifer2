/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

import java.util.Arrays;

/**
 *
 * @author me
 */
public class Lst implements Term {
    
    public final Term[] components;
    transient private boolean hasVariable;
    
    public Lst(Term... components) {
        this.components = components;
        
        if (components.length > 1) {
            for (int j = 0; j < this.components.length; j++) {
                if (this.components[j] instanceof Atom)
                    this.components[j] = ((Atom)this.components[j]).l();                
            }
        }
        
        this.hasVariable = false;
        for (Term t : components)
            if (t.hasVar()) { this.hasVariable = true; break; }
    }

    @Override
    public int arity() {
        return components.length;
    }

    @Override
    public boolean hasVar() {
        return hasVariable;
    }

    @Override
    public String toString() {
        return Arrays.toString(components);
    }
    
    
    
    
}
