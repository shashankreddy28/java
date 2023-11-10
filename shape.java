public abstract class shape {
    public abstract double  getArea();
    public abstract double getPerimeter();
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(2, 3);
        square square1 = new square(1);
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
    }
    
}
class Rectangle extends shape{
    private double length;
    private double breath;
    public Rectangle(double len,double bre){
        this.length = len;
        this.breath = bre;
    }
    public double getPerimeter(){
        return 2*(length+breath);

    }
    public double getArea(){
        return length*breath;

    }

}
class square extends Rectangle{
    public square(double len){
        super(len,len);
    }
}


