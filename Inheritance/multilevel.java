class Car {
    String type;
}
class Mahindra extends Car {
    String name;
}

class Scorpio extends Mahindra{
    int price;
}

public class multilevel {
    public static void main(String []args){
        Scorpio s1 = new Scorpio();
        s1.type = "Four_whiler";
        s1.name = "S11";
        s1.price = 10000;

        System.out.println(s1.type + " " + s1.name + " " + s1.price);
    }
}
