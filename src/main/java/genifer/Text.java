/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer;

import java.text.DecimalFormat;
import java.text.Format;

/**
 *
 * @author me
 */
public class Text {
 
    
    final static Format fourDecimal = new DecimalFormat("0.0000");
    public static final String n4(final float x) { return fourDecimal.format(x);     }

    final static Format twoDecimal = new DecimalFormat("0.00");    
    public static final String n2(final float x) { return twoDecimal.format(x);     }
    
}
