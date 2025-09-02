//Remove Special characters from the string
public class RemoveSpecialChars {
    public static void main(String args[]){
        String clean_str = removeSpecialChars("J()/%a-_=+v{}|a");
        System.out.println(clean_str);
    }

    public static String removeSpecialChars(String input_str){
        if(input_str.length()>0)
        {
            input_str = input_str.replaceAll("[^a-zA-Z0-9]","");
        }
        else
            System.out.println("Empty String, Please enter valid string");
        return input_str;
    }
}
