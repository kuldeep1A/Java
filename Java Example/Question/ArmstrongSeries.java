import java.util.Scanner;
public class ArmstrongSeries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Armstrong series between 100 to 50000: ");

        for(int i=100;i<=50000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int number){
        int temp,remainder,digits=0;

        temp=number;
        while(temp!=0){
            digits++;
            temp=temp/10;
        }

        temp=number;
        int sum=0;
        while(temp!=0){
            remainder=(temp%10);
            sum=sum+power(remainder,digits);
            temp=temp/10;
        }
        return number==sum;
    }

    public static int power(int n,int m){
        int dummy=1;
        for(int i=0;i<m;i++){
            dummy=dummy*n;
        }
        return dummy;
    }
}
