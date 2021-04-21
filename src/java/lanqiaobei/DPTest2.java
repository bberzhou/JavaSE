package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/17/21 09:20
 * Create By IntelliJ IDEA
 */
public class DPTest2 {
    public static void main(String[] args){
        //  测试 maxValueArray()
        int[] arr = new int[]{3,1,4,1,5,9,2,6,5};
        int i = maxValueArray (arr);
        System.out.println (i);
    }

    public static int maxValueArray(int[] arr){
        //  max变量表示子序列最大值
        int max= 1;
        int len = arr.length;
        //  定义一个存储子序列长度的一维数组
        int[] temp = new int[len];
        //  初始化temp数组为1，因为至少的子序列都是1
        for (int i = 0 ; i < len ; i++) {
            temp[i] = 1;
        }
        //  循环遍历数组元素,外层元素直接从第二个元素开始，因为第一个元素子序列必然是1
        for (int i = 1 ; i < arr.length ; i++) {
            //  内层循环遍历0...j  where 0<j<i
            for (int j = 0 ; j < i ; j++) {
                //  判断，即状态转换方程:arr[i] > arr[j],temp[j] +1 > temp[i]
                if (arr[i] > arr[j] && temp[j] +1 > temp[i]){
                    //  如果满足，则说明需要将子序列长度+1
                    temp[i] = temp[j]+1;    //  这里temp[j]是满足条件的那个并不是最后一个j
                }

            }

        }
        //  增强for循环
        for (int a:temp){
            if (a > max){
                max = a;
            }
        }

        return max;
    }


}
