class days{
    public static void main(String args[]){
        int i =1;
        for(i=1;i<=7;i++){
            String day = "";
            switch (i) {
                case 1:
                    day = "MONDAY";
                    break;
            
                case 2:
                    day = "TUESDAY";
                    break;
                case 3:
                    day = "WEDNSDAY";
                    break;           
                case 4:
                    day = "THURSDAY";
                    break;
                
                case 5:
                    day = "FRIDAY";
                    break;
                case 6:
                    day = "Saturday";
                    break;
    
                case 7:
                    day = "Sunday";
                    break;
                  
    
                default:
    
                    break;
            }
            for(int j =1;j<=24;j++){
                System.out.println(day + " " + j);
            }
        }

    }

}