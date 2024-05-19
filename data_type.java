// conversion - implicit conversion of data type by compilor
// casting - explicitly conversion of data type using operator 
class data{
    public static void main(String args[]){
        byte e = 6; // 1 byte 
        int var = 5; // 4 byte
        long b = 5;  // 8 byte
        short c = 127; // 2 byte

        double f = 23.5;  // 8 byte
        float d = 34.5f;  // 4 byte
        boolean val = true; // 1 bit
        char myChar = 'a'; // 2 byte


        int a = 256*2;
        byte ba ;

        ba = (byte) a;


        int num1 = 5;
        int num2 = 7;

        int result= num1++;  // post increment - fetch the value first then increase it
//        int result2 = ++num1;// pre increment -increase the value first and then fetch it

    //    System.out.println(num1);
        System.out.println(result);



    }
}