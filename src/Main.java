import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import ecs100.*;
//.* imports all
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("How many prime numbers do you want");
        input = scanner.nextLine();

        int i;

        try //try to cast user input into integer
        {
            i = Integer.parseInt(input);
        }
        catch (Exception e)
        {
            System.out.println("Number entered (integer) is not valid, try again");
            String[] Args = args;
            main(Args);
            return;
        }

        ArrayList<Integer> ValidPrimes = new ArrayList<Integer>();


        for (int x = 3; x < i; x++)
        {
          if(  IsPrimeNumber(x,ValidPrimes))
              ValidPrimes.add(x);
        }

        System.out.println("done, printing all valid primes now");

        for (i=0; i < ValidPrimes.size();i++)
        {
            System.out.println(ValidPrimes.get(i));
        }
        UI.println("TEST ECS100");
    }


    public static boolean IsPrimeNumber(int in,ArrayList<Integer> primes)
    {
        //first check if input can be devided by 2
        if(isDevisable(in,2))
        {
            return false;
        }


        //now check against other primes that exist, if not check against every number below "in"
        if(true)  //(OtherPrimes.length == 0)
        {
            for (int i = in; i > 1; i--)
            {
                if(i == in || i == 1 || i == 0)
                    continue;


                System.out.println("testing num " + in + " against " + i );
                if(isDevisable(in,i))
                {
                    System.out.println("num is not prime (" + in + ") it is devisable by " + i);
                    return  false;
                }
            }
            System.out.println("num is not devisible by anything other than 1 and itself (" + in + ")");
            return true;
        }
        else
        {
            return true; //placeholder ======================================================================
        }
    }
    public static  boolean isDevisable(int in,int dev)
    {
        float inF = in;
        float devF = dev;
        float num =  inF / devF;

        System.out.println("testing results are " + num);
        String numStr = String.valueOf(num);
        if(numStr.endsWith("0"))
            return true;
        else
            return false;
    }
}