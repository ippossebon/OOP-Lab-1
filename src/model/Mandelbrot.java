package model;

import java.awt.Color;
import static java.lang.Math.*;

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
    	double repetitions = repetitions(aux,50);
    	repetitions = repetitions % 255;
    	double q = repetitions / 50;
    	double r = 255 * (Math.max(Math.min((3 * q)- 1,3 - (3 * q )),0));
    	double g = 255 * (Math.max(Math.min((3 * q),2 - (3 * q )),0));
    	double b = 255 * (Math.max(1 - (3 * q),0));
    	
    	//Color finalcolor = new Color(repetitions, repetitions, repetitions);
    	Color finalcolor = new Color((int)r,(int)g,(int)b);
    	
    	return finalcolor;
    }
}