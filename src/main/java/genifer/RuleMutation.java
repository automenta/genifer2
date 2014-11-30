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
abstract public interface RuleMutation {

    /** returns null if not/applicable */
    public Rule apply(Memifer m, Rule r);
    
}
