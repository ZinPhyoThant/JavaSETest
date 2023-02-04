import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int num=0;
        int sort [] ={5,4,1,8,6,9};

        for (int i = 0; i < sort.length; i++) {
            for (int j=i+1;j<sort.length;j++){
                if (sort[i]>sort[j]){
                    num = sort[i];
                    sort[i] = sort[j];
                    sort[j] = num;
                }
            }
        }
        for (int i=sort.length;i<=0;i--){
            System.out.println(sort[i]);
        }
    }
    }
