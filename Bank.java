import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        fixed  x = new fixed();
        x.fixedAccount();
        int num1 = x.f;
        current y = new current();
        y.currentAccount();
        int num2 = y.c;
    }

    public static void totalcash(int num1,int num2) {
        int sum= num1+num2;
        System.out.println("total cash in the bank is:"+sum);
    }
}
    class fixed{
    int f;
    Scanner input = new Scanner(System.in);
    int fixedAccount(){
        System.out.println("total fixed amount in the bank:");
        f = input.nextInt();
        return f;
    }
    }
    class current{
    int c;
    Scanner input = new Scanner(System.in);
    int currentAccount(){
        System.out.println("total current amount in the bank:");
        c= input.nextInt();
        return c;
    }
    }
