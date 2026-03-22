class shape {
    String shape;
    int side;
}
class circle extends shape {

    public circle(String shape, int side) {
        this.shape = shape;
        this.side = side;
    }
    
}

public class single {
    public static void main(String[] args) {
        circle c1 = new circle("Square", 4);
        System.out.println(c1.side + " --> " + c1.shape);
    }
}
