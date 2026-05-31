java1
class IfElseExample {
    public static void main(String[] args) {
        double radius, area, PI;
        PI = 3.14f;
        radius = -1;
        if(radius>=0) {
            area = radius*radius*PI;
            System.out.println("Area of circle is "+area);
        }
        else {
            System.out.println("..Negative Input..");
        } 
    } 
} 