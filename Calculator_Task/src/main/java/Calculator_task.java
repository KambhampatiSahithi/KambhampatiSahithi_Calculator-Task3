import java.util.Scanner;

public class Calculator_task
{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Enter an Operator ( +, - , *, / ):");
        char opr = sc.next().charAt(0);
        double res;
        //KISS principle - use simple loops and conditions .
        if(opr == '+')
        {
            addition a = new addition();
            res=a.evaluation(num1,num2);
            System.out.print(num1+" + "+num2+" = ");
            a.display(res);
        }
        else if(opr == '-')
        {
            substraction s = new substraction();
            res=s.evaluation(num1,num2);
            System.out.print(num1+" - "+num2+" = ");
            s.display(res);
        }
        else if(opr == '*')
        {
            multiplication m = new multiplication();
            res=m.evaluation(num1,num2);
            System.out.print(num1+" * "+num2+" = ");
            m.display(res);
        }
        else if(opr == '/')
        {
            division d = new  division();
            res=d.evaluation(num1,num2);
            System.out.print(num1+" / "+num2+" = ");
            d.display(res);
        }

    }
}

