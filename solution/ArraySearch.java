import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       
        int arr[] = new int[n];

        int x = sc.nextInt();      
        boolean found = false;      

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}
