/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit.mit.ist.lection2;

import fit.mit.ist.lection2.lab2.EquationSample;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author 38068
 */
@SpringBootTest
public class Lab2Tests {

    @Autowired
    EquationSample equationSample;

    @Test
    void test1() {
        assertEquals(5, equationSample.solve(2));
        assertEquals(-5, equationSample.solve(-2));
        assertEquals(2, equationSample.solve(5));

        assertEquals(Integer.MAX_VALUE, equationSample.solve(0));
    }
    
    @Test
    void test2() {
        assertEquals(5, equationSample.solve(2));
        assertEquals(-5, equationSample.solve(-2));
        assertEquals(2, equationSample.solve(5));

        assertEquals(Integer.MAX_VALUE, equationSample.solve(0));
    }

}
