/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

import genifer.Rule.And;
import genifer.Rule.Or;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author me
 */
public class TestTerm {
    
    @Test public void testTerm1() {
        
        Memifer m = new Memifer();
        
        Atom t1 = new Atom("a");
        assertEquals("a", t1.toString());
        assertEquals(false, t1.hasVar());
        
        Atom t2 = new Atom("b");
        
        Atom v1 = new Var("v", 0.5);
        assertEquals("?v", v1.toString());
        assertEquals(true, v1.hasVar());
        
        And pre1 = new And(t1, v1);
        Or pre2 = new Or(t1, v1);
        
        Lst post = new Lst(t2);
        
        Rule r1 = new Rule(pre1, post);
        System.out.println(r1.toString());
        
        Rule r2 = new Rule(pre2, post);
        System.out.println(r2.toString());
                
        System.out.println(new Rule(new And(new Lst(t1, t2), v1), post));
        /*Rule r3 = new ChangeRuleMode().apply(m, r2);
        assertEquals(Mode.OR, r3.getMode());
        System.out.println(r3);*/
    }
            
}
