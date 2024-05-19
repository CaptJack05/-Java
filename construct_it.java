public class construct_it {
    public class employe extends construct_it {
        private int id;
        private String name;
        private int age;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id += id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        employe(){
            id = 202401;
            name = "user";
            age = 0;
        }

        employe(String name ,int id){
            this.id = id;
            this.name = name;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int age){
            this.age = age;

        }
    }

    public static void main(String[] args) {
        construct_it outerInstance = new construct_it();
        employe emp1 = outerInstance.new employe();
        System.out.println(emp1.getId() + " : " + emp1.getName() + " + " + emp1.getAge());
    
        employe emp3 =  outerInstance.new employe("you",67);
        System.out.println(emp3.getId() + " : " + emp3.getName() + " + " + emp3.getAge());


        
        employe emp2 = outerInstance.new employe();
        emp2.setAge(50);
        emp2.setName("Hemchandra Jha");
        emp2.setId(44);
        System.out.println(emp2.getId() + " : " + emp2.getName() + " + " + emp2.getAge());
    }
    
    
}
