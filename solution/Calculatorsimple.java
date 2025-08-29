class Solution {
    public void calculate(int a, int b, int operator) {
        // code here
        int answer=0;
        boolean valid=true;
        
        if(operator==1){
        answer =   a + b;
        }else if(operator==2){
            answer = a - b;
        }else if(operator==3){
            answer = a * b;
        }else{
            valid=false;
            System.out.println("Invalid Input");
        }
        if(valid){
            System.out.println(answer);
        }
       
    }
}
