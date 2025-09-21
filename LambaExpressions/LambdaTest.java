package LambaExpressions;

@FunctionalInterface
interface Cab{
    public void bookCab();
}
//class OlaCab implements Cab{
//    @Override
//    public void bookCab() {
//        System.out.println("Your ride is booked with Ola cabs!");
//    }
//}
public class LambdaTest {
    public static void main(String [] args)
    {
//        Cab cab = new OlaCab();
        Cab cab = ()->System.out.println("Your ride is booked with Ola cabs!");
        cab.bookCab();
    }

}
