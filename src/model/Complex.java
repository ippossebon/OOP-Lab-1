package model;

public class Complex {
    private double real;
    private double imaginary;

    public Complex()
    {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real)
    {
        this.real = real;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal()
    {
        return this.real;
    }

    public double getImaginary()
    {
        return this.imaginary;
    }

    public void setReal(double real)
    {
         this.real = real;
    }

    public void setImaginary(double imaginary)
    {
        this.imaginary = imaginary;
    }

    public String toString()
    {
        String temp = this.real + " " + this.imaginary;
        return temp;
    }

    public void addReal(double value)
    {
        this.real += value;
    }

    public void addComplex(Complex temp)
    {
        this.real += temp.real;
        this.imaginary += temp.imaginary;
    }

    public void mulReal(double value)
    {
        this.real *= value;
    }

    public void mulComplex(Complex temp)
    {
        this.real = (this.real * temp.real) - (this.imaginary * temp.imaginary);
        this.imaginary = (this.real * temp.imaginary) + (this.imaginary * temp.real);
    }

    public void squareComplex()
    {
    	this.real = (this.real * this.real) - (this.imaginary * this.imaginary);
    	this.imaginary = (this.real * this.imaginary) + (this.imaginary * this.real);
    }

    public double normComplex()
    {
        return Math.sqrt((this.real * this.real) + (this.imaginary * this.imaginary));
    }

    public static void main(String args[])
    {        
       	Mandelbrot temporary = new Mandelbrot();
        FractalWindow window = new FractalWindow(temporary);
    }
}