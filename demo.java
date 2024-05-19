class calculator{
    public int add(int n1,int n2){
        return (n1+n2);
    }
}

public class demo{
    public static void main(String args[]){
        int a = 5;
        int b = 7;

        calculator obj = new calculator();
        int r = obj.add(a,b);
        System.out.println(r);

    
    }
}