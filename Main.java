import java.util.Scanner;

class Distance
{
    int feet , inch ;
  public void get(int a ,int b)
   {
     feet = a;
     inch = b;
   }
  public void set()
   {
    if(inch>11)
    {
        feet+=inch/12;
        inch%=12;
    }
}
  public void Add(Distance d1 ,Distance d2)
    {
        feet = d1.feet + d2.feet;
        inch = d1.inch + d2.inch;
        
    }
  public void show()
    {
     System.out.println("feet = "+feet);
     System.out.println("inch = "+inch);
    }
   }


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the feet : ");
        int ft = scanner.nextInt();
        System.out.println("Enter the inch : ");
        int in = scanner.nextInt();

        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance d3 = new Distance();
       
       d1.get(ft,in);
       d2.get(ft,in);
       
       d3.Add(d1,d2);
       d3.show();

    }
}