package sort;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2};
        String[] strArr = new String[]{"a", "c", "b"};

        Arrays.sort(strArr, (o1, o2) -> o2.compareTo(o1));
        System.out.println("숫자 " + "106".compareTo("610"));
        System.out.println(Arrays.toString(strArr));
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));

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
