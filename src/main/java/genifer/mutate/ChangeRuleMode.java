/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer.mutate;

import genifer.RuleMutation;

/**
 *
 * @author me
 */
abstract public class ChangeRuleMode implements RuleMutation {


//    @Override
//    public Rule apply(Memifer m, Rule r) {
//        Mode mode = r.getMode();
//        if (mode == Mode.NONE) return null;
//        
//        Rule rc = r.derive(mode == Mode.AND ? Mode.OR : Mode.AND);
//        if (m.hasRule(rc)) return null;
//        
//        return rc;
//    }
    
}
