public class Q8 {
    public static void main(String[] args) {
        int num [] []= {{1,2,3,4,5},
                {5,4,3,2,1},
                {7,8,9,1,5,7,7}};

        for (int row=0;row<num.length;row++){
            for (int col=0;col<num[row].length;col++){
                System.out.print(num[row][col]+" ");
            }
            System.out.println();
        }
    }
}
