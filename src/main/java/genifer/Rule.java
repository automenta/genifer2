/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

/**
 *
 */
public class Rule extends Concept {

    public final Term pre;
    public final Term post;

    
    public Rule(Term pre, Term post) {
        super();
        this.pre = pre;
        this.post = post;
    }
    

    @Override
    public String toString() {
        return pre + " => " + post;
    }

    public static class Or extends Lst {

        public Or(Term... components) {
            super(components);
            if (components.length < 2)
                throw new RuntimeException(this + " requires >=2 subterms");
        }

        
//        public Or(Term first, Term second, Term... additional) {
//            super(new Term[additional.length + 2]);
//            this.components[0] = first;
//            this.components[1] = second;
//            System.arraycopy(additional, 0, this.components, 2, this.components.length);
//        }

        @Override
        public String toString() {
            return "OR" + super.toString();
        }
    }

    
    public static class And extends Lst {

        public And(Term... components) {
            super(components);
            if (components.length < 2)
                throw new RuntimeException(this + " requires >=2 subterms");
        }

        @Override
        public String toString() {
            return "AND" + super.toString();
        }
        
//        public And(Term first, Term second, Term... additional) {
//            super(new Term[additional.length + 2]);
//            this.components[0] = first;
//            this.components[1] = second;
//            System.arraycopy(additional, 0, this.components, 2, this.components.length);
//        }
    }

}
