import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class JavaApplication1
{
    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	HashMap<Integer, Character> tap = new HashMap<Integer, Character>();
    	System.out.println("What would you like me to make into integers?");
        String str = input.nextLine();
      

        map = new HashMap<>();  
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
        map.put(' ', 27);
     
        tap = new HashMap<>();  
        tap.put(1,'a');
        tap.put(2,'b');
        tap.put(3,'c');
        tap.put(4,'d');
        tap.put(5,'e');
        tap.put(6,'f');
        tap.put(7,'g');
        tap.put(8,'h');
        tap.put(9,'i');
        tap.put(10,'j');
        tap.put(11,'k');
        tap.put(12,'l');
        tap.put(13,'m');
        tap.put(14,'n');
        tap.put(15,'o');
        tap.put(16,'p');
        tap.put(17,'q');
        tap.put(18,'r');
        tap.put(19,'s'); 
        tap.put(20,'t');
        tap.put(21,'u');
        tap.put(22,'v');
        tap.put(23,'w');
        tap.put(24,'x');
        tap.put(25,'y');
        tap.put(26,'z');
        tap.put(27,' ');
 
        for(final char c : str.toCharArray())
        {
            final Integer val;

            val = map.get(c);

            if(val == null)
            {   
                // some sort of error
            }
            else
            {
                System.out.print(val + " ");
            }
        }

        System.out.println();
    }
}