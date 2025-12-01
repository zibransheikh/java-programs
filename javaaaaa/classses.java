

class Student{
    String name ;
    int age ;

    Student(String n ,int a){
        name = n ;
        age = a ;
    }
        void display(){
            System.out.println("Name:" + name + " AGE:"+ age);
        }
}

public class classses {
     public static void main(String[] args) {
        Student s1 = new Student("zibran",19);
        s1.display();
        }
}

