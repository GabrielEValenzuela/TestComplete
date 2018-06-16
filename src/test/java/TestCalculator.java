/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Valenzuela
 */
public class TestCalculator {

    private Calculator cal;

    public TestCalculator() {
        cal = new Calculator();
        cal.setNum1(2.2);
        cal.setNum2(3.3);
    }
 @Test
    public void TestProd(){
        Assert.assertEquals(7.26,cal.Product());
    }
    
    @Test
    public void TestSum(){
        Assert.assertEquals(5.5,cal.Suma());
    }
    
}
