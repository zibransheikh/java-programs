class Calculator{
    int a ,b;
    Calculator(int x , int y){
        a = x ;
        b = y;
    }
    int add(){
        return a + b;
    }
    int sub(){
        return a - b;
    }
    int mul(){
        return a * b;
    }
    int div(){
        return a / b;
    }
}
public class calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator(20,10);
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.sub());
        System.out.println("Multiplication: " + calc.mul());
        System.out.println("Division: " + calc.div());
    }
}
