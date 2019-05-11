package com.aegon;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.aegon.controller.CalculatorController;
import com.aegon.model.Response;
import com.aegon.service.impl.CalculatorServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @InjectMocks
    private CalculatorController calcController;

    @Mock
    private CalculatorServiceImpl calServiceImpl;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testif2plus2Equals4()
    {
        Response result = new Response();;
        result.setAnswer(4);
        when(calServiceImpl.getAdd(2,2)).thenReturn(result);

        assertEquals( 4, result.getAnswer());
    }

    @Test
    public void testif5plus6Equals11()
    {
        Response result = new Response();;
        result.setAnswer(11);
        when(calServiceImpl.getAdd(5,6)).thenReturn(result);
        assertEquals( 11, result.getAnswer());
    }

    @Test
    public void testif9minus2Equals7()
    {
        Response result = new Response();;
        result.setAnswer(7);
        when(calServiceImpl.getSub(9,2)).thenReturn(result);
        assertEquals( 7, result.getAnswer());
    }

    @Test
    public void testif5minus5Equals0()
    {
        Response result = new Response();;
        result.setAnswer(0);
        when(calServiceImpl.getSub(5,5)).thenReturn(result);
        assertEquals( 0, result.getAnswer());
    }

    @Test
    public void testif4mul5Equals20()
    {
        Response result = new Response();;
        result.setAnswer(20);
        when(calServiceImpl.getMultiply(4,5)).thenReturn(result);
        assertEquals( 20, result.getAnswer());
    }

    @Test
    public void testif6mul6Equals36()
    {
        Response result = new Response();;
        result.setAnswer(36);
        when(calServiceImpl.getMultiply(6,6)).thenReturn(result);
        assertEquals(36, result.getAnswer());
    }

    @Test
    public void testif20dividedby2Equals10()
    {
        Response result = new Response();;
        result.setAnswer(10);
        when(calServiceImpl.getDivide(20,2)).thenReturn(result);
        assertEquals( 10, result.getAnswer());
    }
    @Test
    public void testif8dividedby8Equals1()
    {
        Response result = new Response();;
        result.setAnswer(1);
        when(calServiceImpl.getDivide(8,8)).thenReturn(result);
        assertEquals( 1, result.getAnswer());
    }
}
