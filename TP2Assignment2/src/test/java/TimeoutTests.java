/*
TP Assignment 2 : TDD
Jarryd Pretorius
206155247
 */

//Timeout tests (Pass and Fail)

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.Rule;
import java.lang.Thread;


public class TimeoutTests
{
    @Rule
    public Timeout globalTimeout = new Timeout(1000);
    
    public TimeoutTests() 
    {
        
    }
    
     @Test
    public void timeoutPassTest()
    {
        try
        {
            //Sleep for 100 milliseconds
            //Thread.SECONDS was giving an error, so milliseconds it is
            Thread.sleep(100);
        }
        catch (Exception e)
        {
            System.out.println("Took too long, timeout error");
        }        
    }
    
    @Test
    public void timeoutFailTest()
    {
        try
        {
            //Sleep for 5000 milliseconds
            //Thread.SECONDS was giving an error, so milliseconds it is
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println("Took too long, timeout error");
        }        
    }        
    
}
