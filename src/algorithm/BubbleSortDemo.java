package algorithm;

import java.util.Random;

/**
 * @author wyy
 * @version 1.0
 * @Classname BubbleSortDemo  冒泡排序
 * @date 2020/8/28 8:55
 * @description
 **/
public class BubbleSortDemo {

    static boolean flag ;


    static int counts ;

    public static void main(String[] args) {
        int[] ints = {1, 3, 39, 21, 2,31, 12, 42, 7, 9, 8, 14, 19, 17, 16};
        do {
            flag = false;
            for (int i = 0; i < ints.length-1; i++) {
                if (ints[i] > ints[i + 1]) {
                    int swap = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = swap;
                    counts ++;
                    flag = true;
                }
            }
        } while (flag);
        for(int i =0;i<ints.length-1;i++){
            System.out.print(ints[i]+"、");
        }
        System.out.println();
        System.out.println("一共执行了"+counts +"次");
    }

}
