/**
 * Created by James on 3/2/14.
 */
public class Main {

    public static void main(String []args)
    {
       Symbol_Table sym = Symbol_Table.getST();
        sym.add_Grade("A", 4.0);
        sym.print();
    }
}
