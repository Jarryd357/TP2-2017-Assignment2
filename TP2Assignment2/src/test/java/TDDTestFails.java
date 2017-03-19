/*
TP Assignment 2 : TDD
Jarryd Pretorius
206155247
 */

//Second set of Tests as instructed (All fails)

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class TDDTestFails 
{
    
    public TDDTestFails() 
    {
        
    }
    
    @Test
    public void floatingPointTest()
    {
        //assertEquals demanding a third argument of delta
        //Delta: range between act. & exp. for result to be considered correct
        Assert.assertEquals(3.0/2.0,1.8,0.0);
    }
    
    @Test
    public void integerTest()
    {
        //assertEquals demanding a third argument of delta 
        //Delta: range between act. & exp. for result to be considered correct
        Assert.assertEquals(10+5,18,0);
    }
    
    @Test
    public void objectEqualityTest()
    {
        Dog brownDog;
        Dog blackDog;
        
        brownDog = new Dog("Brown");
        blackDog = new Dog("Black");
             
        Assert.assertEquals("Must be same object",brownDog,blackDog);
    }
    
    @Test
    public void objectIdentityTest()
    {
        Dog brownDog;
        Dog blackDog;
        
        brownDog = new Dog("Brown");
        blackDog = new Dog("Black");
        
        Assert.assertEquals("Must be same object",brownDog,blackDog);
    }
    
    @Test
    public void truthBooleanTest()
    {
        Assert.assertTrue("Must be True", 2==1);
    }
    
    @Test
    public void falseBooleanTest()
    {
        Assert.assertFalse("Must be False", 2==2);
    }
    
    @Test
    public void isNullTest()
    {      
        String testVal = "testVal";
        
        Assert.assertNull("Must be Null", testVal);
    }
    
    @Test
    public void isNotNullTest()
    {  
        String testVal = null;
        
        Assert.assertNotNull("Must Not be Null", testVal);
    }
    
    @Test
    public void sameObjectTest()
    {        
        String testVal = "testVal";
        String testVal2 = "testVal2";
        
        Assert.assertSame("Must be Same", testVal, testVal2);
    }
    
    @Test
    public void notSameObjectTest()
    {      
        String testVal = "testVal";
        String testVal2 = "testVal";
        
        Assert.assertNotSame("Must NOT be Same", testVal, testVal2);
    }
    
    public void failTest()
    {
        Assert.fail("Forced fail test");
    } 
    
    @Ignore
    @Test
    public void disableTest()
    {
        System.out.print("Test was ignored");
    }
    
    @Test
    public void arrayTest()
    {
        int[] numList1 = new int[]{1,2,3};
        int[] numList2 = new int[]{5,6,7};
        
        Assert.assertArrayEquals(numList1, numList2);
    }
}
