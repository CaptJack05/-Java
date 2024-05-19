public class PrivateThis {

    public static class Student {
        private String name;
        private int Roll;
        private String school;

        public String getName() {
            return name;
        }

        public void setName(String name , Student obj) {
            Student obj_l = obj;  //creating object 
            obj_l.name = name;
        }

        public int getRoll() {
            return Roll;
        }

        public void setRoll(int roll) {
            Roll = roll;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;    //this keyword specifiy the variable to be instance variable
        }
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Hemchandra Jha",obj);
        String a = obj.getName();
        System.out.println(a);

        obj.setRoll(33);
        obj.setSchool("Arwachin");

        System.out.println(obj.getRoll());
        System.out.println(obj.getSchool());

        
    }
}
