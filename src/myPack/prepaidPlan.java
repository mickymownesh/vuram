/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPack;


public class prepaidPlan {
    
    private float vc = 0.30f;
    private float vidc = 1.00f;

    public float voiceCall(int sec){
        
        return sec * vc;
    }
    
    public float videoCall(int sec){
        
        return sec * vidc;
    }
    
    
}
