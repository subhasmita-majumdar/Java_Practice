import java.util.*;

/*WinWire Question: WAP that demonstrates the use of Collections, HashMap, HashSet
to store the employees - name, salary and other details and return/print who are
eligible for insurance based on salary>200000
*/

public class CollectionsDemo {
    public static void main(String[] args) {
        Employees e1=new Employees("abc",100000.00f);
        Employees e2=new Employees("xyz",200000.00f);
        Employees e3=new Employees("pnq",300000.00f);
        Employees e4=new Employees("mnc",250000.00f);
        Map<String,Float>hm = new HashMap<>();
        Set<String>s=new HashSet<>();
        hm.put(e1.ename,e1.esal);
        hm.put(e2.ename,e2.esal);
        hm.put(e3.ename,e3.esal);
        hm.put(e4.ename,e4.esal);
        for(Map.Entry<String,Float>e:hm.entrySet())
        {
            if(e.getValue()>200000.00)
            {
                s.add(e.getKey());
                System.out.println(e.getKey()+ " Is Eligible for Insurance");
            }
        }
    }
}

class Employees
{
    String ename;
    float esal;
    Employees(String name,float sal)
    {
        this.ename = name;
        this.esal= sal;
    }
}