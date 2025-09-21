package LambaExpressions;

@FunctionalInterface
interface CabToFromPrice {
    public String returnCabPrice(String source,String destination);
}
class LambdaExpWithReturn{
    public static void main(String [] args)
    {
        CabToFromPrice cbPrice = (source, destination) ->
        {
            System.out.println("Your ride is booked with us from "+source+" to "+destination);
            return ("Booking Price: Rs. 1000");
        };
        System.out.println(cbPrice.returnCabPrice("Indore","Omkareshwar"));
    }
}
