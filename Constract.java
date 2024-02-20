public class Constract {
   public String company;
    public String name;
    public int id;
    public long ph;
    public static void main(String[] args) {
        Constract co = new Constract("Infosys", "sai", 1, 1234567811);
        Constract co2 = new Constract("Infosys", "priya", 2, 1876543219);
        Constract co3 = new Constract("Infosys", "krishna", 3, 1876543456);

        co.method1();
        co2.method1();
        co3.method1();
    }
public Constract( String com, String na, int i, long p) {

    company = com;
    name = na;
    id = i;
    ph = p;

}
    public void method1(){
        System.out.println(" welcome to " +company);
        System.out.println(" Hi " +name);
        System.out.println(" id number " +id);
        System.out.println(" phone number " +ph);
        System.out.println();
    }

}
