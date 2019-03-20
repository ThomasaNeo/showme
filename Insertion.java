package insertion_sort;

public class Insertion {
    public static void main(String[] args) {
        //定义要排序的牌堆
        int Arraysort[] = {5,2,4,6,1,3};
        for(int j = 1;j<Arraysort.length;j++){
            //定义要排序的右手中的牌
            int key = Arraysort[j];
            //定义要比较的左手中的牌的序号
            int i = j - 1;
            //判断条件：如果左手有牌且比右手的牌大
            while(i>=0 && Arraysort[i]>key){
                int tmp = Arraysort[i];
                Arraysort[i] = Arraysort[i + 1];
                Arraysort[i + 1] = tmp;
                i = i - 1;
            }
            Arraysort[i + 1] = key;
        }
        System.out.println("插入排序后的Arraysort数组：");
        for (int num:Arraysort) {
            System.out.print(num+" ");
        }
    }
}
