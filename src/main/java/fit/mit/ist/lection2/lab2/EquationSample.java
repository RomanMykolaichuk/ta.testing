/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit.mit.ist.lection2.lab2;

import org.springframework.stereotype.Component;

/**
 *
 * @author 38068
 */

@Component
public class EquationSample {
    
    public int solve(int x){  
        
        if(x==0){return Integer.MAX_VALUE;}
        return 10/x; 
        
    }
    
    
    
}
