package com.wipro.bank.assessment;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.entity.Account;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	@Before
	public void setUp() throws Exception {
		
	}
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
