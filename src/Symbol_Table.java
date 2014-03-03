    /**
     * Created by James on 3/2/14.
     */
    import com.sun.xml.internal.ws.api.model.ExceptionType;

    import java.io.IOException;
    import java.util.*; // Map framework


    public class Symbol_Table {

    // Dictionary class is obsolete, apparently per Tutorialspoint.com/java/java_map_interface.htm



        // Private member variables
        private Map m_grades = new HashMap(); // Our Map/Dictionary shared variable
        private static volatile Symbol_Table singletonInst; // Shared across all accesses of Symbol_Table
        private Symbol_Table() {} // Prevents any class from instantiating

        // The following function for Singleton type is also synchronized for threading
        // Additionally, it contains double check locking to prevent concurrency 'collisions'
        public static  Symbol_Table getST(){
           if (singletonInst == null) // Check if it's been instantiated
           {
               synchronized (Symbol_Table.class) // Concurrency lock
               {
                   if (singletonInst == null) // Stop all other threads from instantiating
                   {
                       singletonInst = new Symbol_Table(); // Only we can instantiate this class here
                   }
               }
           }
            return singletonInst;
        }


        public void add_Grade(String letter, double grade) {
            if (!m_grades.containsKey(letter)) // If it is not already in our Symbol_Table
            {
                m_grades.put(letter,grade); // Add it to our hash table
            }
            else
                System.out.printf("Error '%s' letter already in the table\n", letter);
        }

        public void print()
        {

            if(!m_grades.isEmpty()) // If not empty!
            {
                Map<String, String> treeMap = new TreeMap<String, String>(m_grades); // Sorted map
               for (Map.Entry entry : treeMap.entrySet())
               {
                   System.out.println(entry.getKey() + " = " + entry.getValue());
               }
               // Iterator it = m_grades.entrySet().iterator();
                //while(it.hasNext()){
                  //  Map.Entry pairs = (Map.Entry)it.next();
                    //System.out.println(pairs.getKey() + " = " + pairs.getValue());
                    //it.remove(); // Avoid concurrent modification exception
                }
            }
         }






