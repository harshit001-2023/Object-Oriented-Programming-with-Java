package Basics.blc;


// BLC - Rectangle class
public class Rectangle {
    private double width;
    private double height;

    // Fixed: Parameters in correct order (width, height)
    public Rectangle(double width, double height) {
        // Fixed: Use OR (||) instead of AND (&&)
        if (width <= 0 || height <= 0) {
            // Don't use System.exit() - just print error
            IO.println("Error: Width and height must be non-negative.");
            // Initialize with default values or throw exception
            this.width = 0;
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    // Setters and Getters
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    // Fixed: Correct area calculation (no change needed here)
    public double getArea() {
        return width * height;
    }

    // Fixed: Correct perimeter formula
    public double getPerimeter() {
        return 2 * (width + height);  // 2 * (w + h), not 2 * (w * h)
    }
}

