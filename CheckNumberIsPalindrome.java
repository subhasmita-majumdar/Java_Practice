public class CheckNumberIsPalindrome {
    public static void main(String[]args){
        boolean flag = checkPalindrome(121);
        if(flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    public static boolean checkPalindrome(int input_num)
    {
        int reversed_num=0;
        int original_num=input_num;
        int digit=0;
        while(input_num>0)
        {
            digit = input_num%10;
            reversed_num = reversed_num*10+digit;
            input_num = input_num/10;
        }
        System.out.println("Original Number: "+original_num);
        System.out.println("Reversed Number: "+reversed_num);
        return reversed_num==original_num;
    }
}
