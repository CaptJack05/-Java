public class darray {

    public static void main(String args[])
    {
        int arr[][] = new int[4][3];


        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i =0;i<4;i++)
        {
            for(int j = 0;j<3;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        for(int m[]:arr)
        {
            for(int n:m)
            {
                n = (int)(Math.random()*100);
                System.out.println(n);
            }
        }

        for(int n[]:arr)
        {
            for(int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
