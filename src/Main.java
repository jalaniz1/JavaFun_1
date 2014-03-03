/**
 * Created by James on 3/2/14.
 */
public class Main {

    public static void main(String []args)
    {
       Symbol_Table sym = Symbol_Table.getST();

        sym.add_Grade("A", 4.0);
        sym.add_Grade("A-", 3.66);
        sym.add_Grade("B-", 3.33);
        sym.print(); // Call our APIs Print function
    }
}
