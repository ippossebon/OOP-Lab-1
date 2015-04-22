package model;

import java.awt.Color;

/**
 * Created by Fernando on 4/22/15.
 */
public class Mandelbrot {
    public Mandelbrot()
    {

    }

    public int repetitions(Complex c, int max)
    {
        Complex d = new Complex(0,0);
        int iterations=0;

        while(iterations < max && d.normComplex() <= 2)
        {
        	d.squareComplex();
        	d.addComplex(c);
        	iterations++;
        }
        
        
        return iterations;
    }
    
    public Color colorAt(double x, double y)
    {
    	Complex aux = new Complex(x,y);
    	int repetitions = repetitions(aux,50);
    	repetitions = repetitions % 255;
    	Color finalcolor = new Color(repetitions, repetitions, repetitions);
    	
    	return finalcolor;
    }
}