package algorithm;

/**
 * @author wyy
 * @version 1.0
 * @Classname SelectSortDemo  选择排序
 * @date 2020/8/28 14:20
 * @description
 **/
public class SelectSortDemo {

    public static void main(String[] args) {

        int[] ints = {1, 3, 39, 21, 2,31, 12, 42, 7, 9, 8, 14, 19, 17, 16};
        for(int i =0; i<=ints.length-1;i++){
            int z =i;
            int  min = ints[i];
            for(int y = i+1;y<=ints.length-1;y++){
                if(ints[y] < min){
                    min = ints[y];
                    z = y;
                }
            }
            if(z!=i){
                int swap = ints[i];
                ints[i]= min;
                ints[z] = swap;
            }
        }
        for(int i =0;i<ints.length;i++){
            System.out.print(ints[i]+"、");
        }
    }

}
