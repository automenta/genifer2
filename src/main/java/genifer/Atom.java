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
public class Atom implements Term {
        
    public final CharSequence name;

    public Atom(CharSequence name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Atom)) return false;
        Atom a = (Atom)obj;
        return name.equals(a.name);
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public boolean hasVar() {
        return false;
    }

    @Override
    public String toString() {
        return name.toString();
    }
    
    
    
    
    
    
    
    
}
