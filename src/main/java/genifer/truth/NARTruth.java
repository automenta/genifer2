/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifer.truth;

import java.io.Serializable;

/**
 *
 * @author me
 */
public class NARTruth implements Serializable {
    
    private double frequency;
    private double confidence;

    public NARTruth(double frequency, double confidence) {
        this.frequency = frequency;
        this.confidence = confidence;
    }
    
    
}
