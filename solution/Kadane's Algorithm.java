class Main{
    public static int maxSubArraySum(int[] arr){
        int maxSum=arr[0];
        int currentSum = arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(arr[i], currentSum + arr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr1={2,3,-8,7,-1,2,3};
        System.out.print(maxSubArraySum(arr1));
    }
}
