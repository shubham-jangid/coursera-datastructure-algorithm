package algorithm_toolbox;

public class temp {
    public static void main(String[] args) {
        String [] str = { "003", "20"};
        int answer = str[0].compareTo(str[1]);
        System.out.println(answer);

        if(Integer.parseInt(str[0])>Integer.parseInt(str[1])){
            System.out.println("greater");
        }else if(Integer.parseInt(str[0])<Integer.parseInt(str[1]))
        {
            System.out.println("smaller");
        }else{

            System.out.println("equal");
        }
    }
}
