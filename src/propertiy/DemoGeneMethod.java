package propertiy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Created on 2020/11/20
*/
public class DemoGeneMethod {
    public static void main(String[] args) {
        Integer[] i = {1,4,23,88,5};
        ArrayTools.sort(i);
        System.out.println(Arrays.toString(i));
        String[] str = {"a","re","t"};
        ArrayTools.sort(str);
        System.out.println(Arrays.toString(str));
        List<? extends Number> list = new ArrayList<Integer>();
    }
}
