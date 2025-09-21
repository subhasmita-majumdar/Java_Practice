package LambaExpressions;

@FunctionalInterface
interface CabSourceDestination{
    public void bookCabToFrom(String source, String destination);
}
//class OlaCabBooking implements CabSourceDestination{
//    @Override
//    public void bookCabToFrom(String source, String destination) {
//        System.out.println("Your Ola ride is booked from "+source+" to "+destination);
//    }
//}
public class LambdaExpWithArgs {
    public static void main(String [] args)
    {
        CabSourceDestination cab = (source,destination)->System.out.println("Your Ola ride is booked from "+source+" to "+destination);
        cab.bookCabToFrom("Indore","Omkareshwar");
    }
}
