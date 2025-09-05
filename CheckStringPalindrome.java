public class CheckStringPalindrome {
    public static void main(String[]args)
    {
        boolean flag = checkPalindrome("Madam");
        if(flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    public static boolean checkPalindrome(String input_str)
    {
        String new_str="";
        input_str = input_str.toLowerCase();
        for(int i=input_str.length()-1;i>=0;i--)
        {
            new_str=new_str+input_str.charAt(i);
        }
        System.out.println("Original String: "+input_str);
        System.out.println("Reversed String: "+new_str);
        return input_str.equals(new_str);
    }
}
