package sort;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2};



        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(-1);
        Collections.sort(list, (o1, o2) -> {return o1 - o2;});
        System.out.println(list);

        test.test();

    }

    static class test{
        public static void test(){};
    }


}
