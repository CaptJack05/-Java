public class string {
    public static void main(String args[]){

        //Constructor method
        String a = new String("Hello World");
        System.out.println(a + " Hellow world");

        String name = "Hemchandra Jha";
        for (int i=0 ; i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        StringBuffer obj = new StringBuffer("Hello world");
        System.out.println(obj.charAt(5));
        System.out.println(obj.insert(5, "orange"));

    }

    //String Buffer and //String Builder
    
}
