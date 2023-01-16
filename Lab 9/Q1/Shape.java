
package Lab9.Q1;

public class Shape 
{

protected String name;
protected double perimeter;
protected double area;

    public Shape (String name)
    {
       this.name = name;
    }

    public void setPerimeter(double perimeter) 
    {
        this.perimeter = perimeter;
    }
 
    public double getPerimeter() 
    {
        return perimeter;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area) 
    {
        this.area = area;
    }

    public void display()
    {
    System.out.printf("Name of the shape: %s\nPerimeter: %.2f\nArea: %.2f ",this.name,this.perimeter,this.area);
    }
}
class Circle extends Shape
{
    private double diameter;
    
    public Circle(double diameter)
    {
        this.diameter = diameter;
    }
    
    public Circle(String name,double diameter)
    {
        super(name);
        this.diameter = diameter;
    }
    
    public void acceptInput(double diameter)
    {
        this.diameter=diameter;    
    }
    
    public void computePerimeter()
    {
        this.perimeter = 2*Math.PI*diameter/2;
    }
    
    public void computeArea()
    {
        this.area = Math.PI*Math.pow((diameter/2),2);
    }
}
class Rectangle extends Shape 
{

    private double side1, side2;
    
     public Rectangle( double side1, double side2) 
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle(String name, double side1, double side2)
    {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    public void acceptInput(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void computePerimeter()
    {
        this.perimeter = 2 * (side1 + side2);
    }

    public void computeArea() 
    {
        this.area = side1 * side2;
    }

}
class Square extends Shape 
{

    private double side;
    
    public Square(double side)
    {
        this.side = side;
    }

    public Square(String name, double side) 
    {
        super(name);
        this.side = side;
    }

    public void acceptInput(double side)
    {
        this.side = side;
    }

    public void computePerimeter() 
    {
        this.perimeter = 4 * side;
    }

    public void computeArea() 
    {
        this.area = side * side;
    }

}


