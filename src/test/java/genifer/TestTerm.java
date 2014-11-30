/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

import genifer.Rule.Mode;
import genifer.mutate.ChangeRuleMode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author me
 */
public class TestTerm {
    
    @Test public void testTerm1() {
        
        Memifer m = new Memifer();
        
        Term t1 = new Atom("a");
        assertEquals("a", t1.toString());
        assertEquals(0, t1.arity());
        assertEquals(false, t1.hasVar());
        
        Term t2 = new Atom("b");
        
        Term v1 = new Var("v", 0.5);
        assertEquals("?v", v1.toString());
        assertEquals(0, v1.arity());
        assertEquals(true, v1.hasVar());
        
        Phrase p1 = new Phrase(t1, v1);
        
        Phrase p2 = new Phrase(t2);
        
        Rule r1 = new Rule(p1, p2);
        System.out.println(r1.toString());
        
        Rule r2 = new Rule(new Term[] { t1, v1 }, p2, Mode.AND);
        System.out.println(r2.toString());
                
        Rule r3 = new ChangeRuleMode().apply(m, r2);
        assertEquals(Mode.OR, r3.getMode());
        System.out.println(r3);
    }
            
}
