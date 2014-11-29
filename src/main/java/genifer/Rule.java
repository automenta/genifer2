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
public class Rule extends Concept {
    
    public final Term[] pre;
    public final Term post;

    public Rule(Term pre, Term post) {
        this(new Term[] { pre } , post);
    }
    
    public Rule(Term[] pre, Term post) {
        this.pre = null;
        this.post = null;
    }
    
    
}
