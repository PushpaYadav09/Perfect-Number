import java.util.*;
class perfectnumber{
    public static boolean isPerfect(int num){
        if(num<=1){
            return false;
        }
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(isPerfect(num)){
            System.out.println(num+" is perfect number");
        }
        else{
            System.out.println(num+" is not Perfect number");
        }
    }
}