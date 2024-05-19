class mobile{
    String brand;
    String model;
    static String type = "Smart Phone";

    public mobile(){
        brand = "one Plus";
        model = "nord";
    }

    void out(){
        System.out.println(brand +" : "+model+" : "+" : "+type);

    }

    public static void show(mobile obj){
        System.out.println(obj.brand +" : "+obj.model+" : "+" : "+type);
        //instance variables cannot be used inside static function
    }

}
public class static_variable {
    public static void main(String args[]){
        mobile obj1 = new mobile();
        obj1.brand= "Apple";
        obj1.model = "XV";
        obj1.out();

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.model = "Galaxy";
        mobile.type = "Flagship";
        obj2.out();
        obj1.out();

        mobile obj3 = new mobile();
        obj3.out();
        mobile obj4 = new mobile();
        obj4.out();
        System.out.println(mobile.type);
         //Static variable can directly be accesed using class name

        mobile.show(obj4);

        
    }
    
}
