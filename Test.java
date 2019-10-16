package test;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Auther danni
 * @Date 2019/10/15 20:36]
 * @Version 1.0
 **/

public class Test {
    /* *
        * @Author danni
        * @Description 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
        * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
        * @Date 16:50 2019/10/16
        * @Param [matrix]
        * @return java.util.ArrayList<java.lang.Integer>
     **/
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        double x=matrix.length;
        double y=matrix[0].length;
        int wide=(int)y;
        int high=(int)x;
        int count=0;
        int i=0;
        int j=-1;
        while(count<(int)x*y){
            while(j<wide){
                j++;
                if(j==wide){
                    j--;
                    wide--;
                    break;
                }
                list.add(matrix[i][j]);
                count++;
            }

            while(i<high){
                i++;
                if(i==high){
                    i--;
                    high--;
                    break;
                }
                list.add(matrix[i][j]);
                count++;
            }
            if(count==(int)x*y){
                break;
            }

            if(j==wide){
                while(j>=(y-1-wide)){
                    j--;
                    if(j==((y-1-wide)-1)){
                        j++;
                        break;
                    }
                    list.add(matrix[i][j]);
                    count++;
                }
            }

            if(i==high&&wide>0){
                while(i>=(x-high)){
                    i--;
                    if(i==(x-high)-1){
                        i++;
                        break;
                    }
                    list.add(matrix[i][j]);
                    count++;

                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] array={{1},{5},{9},{13}};
        //System.out.println(array.length);
        Test test=new Test();
        System.out.println(test.printMatrix(array));

    }
}
