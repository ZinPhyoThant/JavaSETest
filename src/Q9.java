public class Q9 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int eenum =5;
        int inum =-1;
        for (int i=0;i<num.length;i++){
            if (num[i]==eenum){
                inum=i;
            }
        }
        System.out.println("5 is " +inum+" index");
    }
}
