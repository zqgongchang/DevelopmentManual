import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        //强制使用集合的toArray(T[] array)
//        String[] array = new String[list.size()];
//        array = list.toArray(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        //强制使用
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String temp = iterator.next();
//            if (temp.equals("1")) {
//                iterator.remove();
//            }
//        }

        //禁止使用
//        for (String s : list) {
//            if ("1".equals(s)) {
//                list.remove(s);
//            }
//        }

        for (String s : list) {
            System.out.println(s);
        }

        //asList 的返回对象是一个Arrays 内部类，并没有实现集合的修改方法。
        // Arrays.asList体现的是适配器模式，只是转换接口，后台的数据仍是数组。
        String[] a = new String[]{"you", "wu"};
        List list1 = Arrays.asList(a);
        for (Object o : list1) {
            System.out.println(o);
        }
        a[0] = "zhang";
        for (Object o : list1) {
            System.out.println(o);
        }
    }
}
