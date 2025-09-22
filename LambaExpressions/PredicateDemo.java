package LambaExpressions;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String [] args){
        Predicate<Integer>p_int = i->(i>10);
        Predicate<String>p_str = input_str -> (input_str.length()>=4);
        System.out.println("Check number is greater than 10: "+p_int.test(10));
        System.out.println("Check number is greater than 10: "+p_int.test(20));
        System.out.println("Check number is greater than 10: "+p_int.test(30));
        System.out.println("----------------------------------------------------");
        System.out.println("Check Name is greater than 10: "+p_str.test("Sam"));
        System.out.println("Check Name is greater than 10: "+p_str.test("Ramu"));
        System.out.println("Check Name is greater than 10: "+p_str.test("David"));
    }

}

