import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={10, 1, 2, 8, 4, 5};
        int x=sc.nextInt();
        int count=0;
        for(int num : arr){
            if(num<=x){
                count ++;
            }
        }
        System.out.print(count);
    }
}
