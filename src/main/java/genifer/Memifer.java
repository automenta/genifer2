/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Genifer memory
 */
public class Memifer {
    
    public final Set<Fact> facts;
    public final Multimap<Term, Rule> rules; /* postcondition -> rule */

    public Memifer() {
        facts = new LinkedHashSet();
        rules = HashMultimap.create();
    }

    public Set<Fact> getFacts() {
        return facts;
    }
    
    public Collection<Rule> getRules() {
        return rules.values();
    }
    
    public void add(Memifer m, boolean overwrite) {
        //TODO add all content of m into this, optionally overwriting elements
    }
    
    public Memifer subtract(Memifer m) {
        //TODO compute the difference and returns it as a new Memifer
        return null;
    }
    
    public boolean addFact(Fact f) {
        return facts.add(f);
    }
    
    public boolean removeFact(Fact f) {
        return facts.remove(f);
    }
    
    public boolean addRule(Rule r) {
        return rules.put(r.post, r);
    }
    
    public boolean removeRule(Rule r) {
        return rules.remove(r.post, r);
    }

    public boolean hasRule(Rule rc) {
        //TODO
        return false;
    }
    
    
}
