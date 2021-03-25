import java.util.*;
import java.util.stream.IntStream;

public class HelloWorld {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Array examples:
        //ArrayList<String> aL1 = new ArrayList<String>(20);
        //aL1.add("Sue");
        //ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        //for(Integer x: aL2) System.out.print(x);
        //System.out.println(aL2.get(1));
        //aL2.set(1, 5);
        //aL2.remove(3);

        //Iterator it = aL2.iterator();
        //while(it.hasNext()) {
        //  System.out.println(it.next());


        //Linked List:
        LinkedList<Integer> iL1 = new LinkedList<Integer>();
        iL1.add(1); iL1.add(2); iL1.add(3);
        iL1.addAll(Arrays.asList(1,2,3,4));
        iL1.addFirst(0);
        System.out.println(iL1.contains(4));
        System.out.println(iL1.indexOf(4));
        iL1.set(0,2);
        System.out.println(iL1.get(0));


    }

}









// Array examples:
    //ArrayList<String> aL1 = new ArrayList<String>(20);
    //aL1.add("Sue");
    //ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));
    //for(Integer x: aL2) System.out.print(x);
    //System.out.println(aL2.get(1));
    //aL2.set(1, 5);
    //aL2.remove(3);

    //Iterator it = aL2.iterator();
    //while(it.hasNext()) {
    //  System.out.println(it.next());


    //Linked List:


       // int[] a1 = new int[10];
       // a1[0] = 1;
       // Arrays.fill(a1,2);
       // System.out.println(a1[0]);
       // System.out.println(a1.length);
        //String[] a2 = {"one", "two"};
        //int[] oneTo10 = IntStream.rangeClosed(1,10).toArray();

       // for(int x: oneTo10) System.out.println(x);

       // System.out.println(Arrays.binarySearch(oneTo10, 9));

       // int a3 [][] = new int[2][2];
       // String[][] a4 = {{"00", "10"}, {"01", "11"}};

       // System.out.println(a4[1][1]);

       // String a5[][][] = {{{"000"}, {"100"}, {"200"}, {"300"}},
       //         {{"010"}, {"110"}, {"210"}, {"310"}},
        //        {{"020"}, {"120"}, {"220"}, {"320"}}};

      //  System.out.println(a5[2][3][0]);

       // int a6[] = {1,2,3};
       // int a7[] = Arrays.copyOf(a6, 3);
       // System.out.println(Arrays.equals(a6, a7));
       // int a8[] = {3,2,1};
       // Arrays.sort(a8);
       // System.out.println(Arrays.toString(a8));
