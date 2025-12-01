public class salary {
    public static void main(String[] args) {
      
        
        int age = 25;
        double salary = 50000.50;
        String name = "Java Developer";
        boolean isActive = true;
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Active: " + isActive);
        
        greetUser(name);
        
        int result = addNumbers(10, 20);
        System.out.println("10 + 20 = " + result);
    }
    
    public static void greetUser(String username) {
        System.out.println("Welcome, " + username + "!");
    }
    
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

