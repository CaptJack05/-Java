class if_else{
    public static void main(String args[]){
        int x = 80;
        int y = 55;
        int z = 60;

        int result = y%2==0? 10:20;
        System.out.println(result);

        if(x>y && x>z){
            System.out.println(x);    
        }
        else if(y>z){
            System.out.println(y) ;   
        }
        else
            System.out.println(z) ;   
    
    }
} 

