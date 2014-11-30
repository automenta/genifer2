/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

import java.util.Arrays;

/**
 *
 */
public class Rule extends Concept {

    public static enum Mode {
        NONE, AND, OR
    }
    
    private final Mode mode;
    public final Term[] pre;
    public final Term post;

    public Rule(Term pre, Term post) {
        this(new Term[] { pre } , post, Mode.NONE);
    }
    
    public Rule(Term[] pre, Term post, Mode mode) {
        super();
        this.pre = pre;
        this.post = post;
        this.mode = pre.length > 1 ? mode : Mode.NONE;
    }
    
    public int arity() { return pre.length; }

    @Override
    public String toString() {
        Mode m = getMode();
        String ms = (m == Mode.NONE) ? "" : m.toString();            
        return ms + Arrays.toString(pre) + " => " + post;
    }

    public Mode getMode() {
        if (arity() == 1)
            return Mode.NONE;
        return mode;
    }
    
    public Rule derive(Mode m) {
        return new Rule(pre, post, m);
    }
            
    
}
