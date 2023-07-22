public class Smaller {

    public static void main(String args[]){

        Smaller smaller = new Smaller();
        System.out.println("Before calling the findSmallest..");
        int smallestNumber = smaller.findSmallest(0, 8, 7);
        System.out.println("After calling the findSmallest ..");
        System.out.println( "The smallest number is :" + smallestNumber ); 

    }

    public int findSmallest(int a, int b, int c)
    {
        System.out.println("This is inside the findSmallest - begin");

        // your actual logic to dertermine the smallest Number 
        if (a<b)
        {
            if (a<c)
            return a;
            else
            return c;
        }
        else
        {
            if (b<c)
            return b;
            else
            return c;
        }

         //System.out.println("This is inside the findSmallest - end");
        //return 0;
    }
}