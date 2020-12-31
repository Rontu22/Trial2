import java.util.Scanner;

public class Square2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();

        if(n%a==0 && m%a==0)
        {
            calAreaDiv(n, m, a);
        }
        else if(n%a == 0 && m%a !=0)
        {
            calAreaNotDiv_m(n, m, a);
        }
        else if(n%a !=0 && m%a == 0)
        {
            calAreaNotDiv_n(n, m, a);
        }
        else if(n%a !=0 && m%a != 0)
        {
            calAreaNotDivBoth(n, m, a);
        }

    }
    public static void calAreaDiv(long n,long m,long a)
    {
        long side_n = (n-(n%a))/a;
        long side_m = (m-(m%a))/a;

        long noOfSquare = (side_n)*(side_m);
        System.out.println(noOfSquare);

        // System.out.println("nside = "+side_n);
        // System.out.println("side m= "+side_m);
    }
    public static void calAreaNotDivBoth(long n,long m,long a)
    {
        long side_n = (n-(n%a))/a;
        long side_m = (m-(m%a))/a;

        long noOfSquare = (side_n+1)*(side_m+1);
        System.out.println(noOfSquare);

        // System.out.println("nside = "+side_n);
        // System.out.println("side m= "+side_m);
    }
    public static void calAreaNotDiv_m(long n,long m,long a)
    {
        long side_n = (n-(n%a))/a;
        long side_m = (m-(m%a))/a;

        long noOfSquare = (side_n)*(side_m+1);
        System.out.println(noOfSquare);

        // System.out.println("nside = "+side_n);
        // System.out.println("side m= "+side_m);
    }
    public static void calAreaNotDiv_n(long n,long m,long a)
    {
        long side_n = (n-(n%a))/a;
        long side_m = (m-(m%a))/a;

        long noOfSquare = (side_n+1)*(side_m);
        System.out.println(noOfSquare);

        // System.out.println("nside = "+side_n);
        // System.out.println("side m= "+side_m);
    }
}
