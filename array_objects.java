public class array_objects {


    public static void main(String args[])
    {
        Students obj_1 = new Students();
        obj_1.name = "hem";
        obj_1.marks= 99;
        obj_1.roll= 44;

        Students obj_2 = new Students();
        obj_2.name = "YOU";
        obj_2.marks= 97;
        obj_2.roll= 44;

        Students obj_3 = new Students();
        obj_3.name = "Me";
        obj_3.marks= 98;
        obj_3.roll= 44;

        Students obj[] = new Students[3];
        obj[0]= obj_1;
        obj[1] = obj_2;
        obj[2] = obj_3;
        

        for(int i = 0; i < obj.length ; i++){
            System.out.println(obj[i].name + " : "+obj[i].marks);
        }
        for(Students stud : obj){
            System.out.println(stud.name + " :  "+stud.marks);
        }
    }
        
    }
class Students{
    String name;
    int roll;
    int marks;
}
