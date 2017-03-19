/*
TP Assignment 2 : TDD
Jarryd Pretorius
206155247
 */

//First set of tests (All passes)

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class TDDTestExamples 
{
    
    public TDDTestExamples() 
    {
        
    }
    
    @Test
    public void floatingPointTest()
    {
        //assertEquals demanding a third argument of delta
         //Delta: range between act. & exp. for result to be considered correct
        Assert.assertEquals(3.0/2.0,1.5,0.0);
    }
    
    @Ignore
    @Test
    public void integerTest()
    {
        //assertEquals demanding a third argument of delta
        //Delta: range between act. & exp. for result to be considered correct 
        Assert.assertEquals(10+5,15,0);
    }
    
    @Test
    public void objectEqualityTest()
    {
        Dog brownDog;
        
        brownDog = new Dog("Brown");
        
        Assert.assertEquals("Must be same object",brownDog,brownDog);
    }
    
    @Test
    public void objectIdentityTest()
    {
        Dog brownDog;
        
        brownDog = new Dog("Brown");
        
        Assert.assertEquals("Must be same object",brownDog,brownDog);
    }
    
    @Test
    public void truthBooleanTest()
    {
        Assert.assertTrue("Must be True", 2==2);
    }
    
    @Test
    public void falseBooleanTest()
    {
        Assert.assertFalse("Must be False", 1==2);
    }
    
    @Test
    public void isNullTest()
    {      
        String testVal = null;
        
        Assert.assertNull("Must be Null", testVal);
    }
    
    @Test
    public void isNotNullTest()
    {  
        String testVal = "testVal";
        
        Assert.assertNotNull("Must Not be Null", testVal);
    }
    
    @Test
    public void sameObjectTest()
    {        
        String testVal = "testVal";
        String testVal2 = "testVal";
        
        Assert.assertSame("Must be Same", testVal, testVal2);
    }
    
    @Test
    public void notSameObjectTest()
    {      
        String testVal = "testVal";
        String testVal2 = "testVal2";
        
        Assert.assertNotSame("Must NOT be Same", testVal, testVal2);
    }
    
    @Test
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
        int[] numList2 = new int[]{1,2,3};
        
        Assert.assertArrayEquals(numList1, numList2);
    }
    
}
