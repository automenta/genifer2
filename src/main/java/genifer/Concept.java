/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import java.io.Serializable;

/**
 *
 * @author me
 */
abstract public class Concept implements Serializable {
    
    public final ClassToInstanceMap<Object> prop = MutableClassToInstanceMap.create();
    
    public <X> X the(Class<X> c) {
        return prop.getInstance(c);
    }
    public <T> void set(Class<T> t, T value) {
        prop.putInstance(t, value);
    }
    
}
