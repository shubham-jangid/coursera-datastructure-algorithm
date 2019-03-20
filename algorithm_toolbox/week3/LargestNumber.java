import java.util.*;


public class LargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        Integer val[] = new Integer[size];

        for (int i=0; i<size; i++)
        {
            val[i] = sc.nextInt();
        }

        Arrays.sort(val, new Comp());

        for (int i : val)
        {
            System.out.print(i);
        }

    }
}

class Comp implements Comparator<Object> {

    public int compare(Object o1, Object o2)
    {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        String s1 = (String.valueOf(i1).concat(String.valueOf(i2)));
        String s2 = (String.valueOf(i2).concat(String.valueOf(i1)));

        if (Integer.parseInt(s1) > Integer.parseInt(s2))
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

}
