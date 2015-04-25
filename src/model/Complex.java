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
        this.imaginary *= value;
    }

    public void mulComplex(Complex temp)
    {
        double r = (this.real * temp.getReal()) - (this.imaginary * temp.getImaginary());
        double i = (this.real * temp.getImaginary()) + (this.imaginary * temp.getReal());
        this.real = r;
        this.imaginary = i;
    }

    public void squareComplex()
    {
    	double r = (this.real * this.real) - (this.imaginary * this.imaginary);
    	double i = (this.real * this.imaginary) + (this.imaginary * this.real);
    	
    	this.real = r;
    	this.imaginary = i;
    }

    public double normComplex()
    {
        return Math.sqrt((this.real * this.real) + (this.imaginary * this.imaginary));
    }
}