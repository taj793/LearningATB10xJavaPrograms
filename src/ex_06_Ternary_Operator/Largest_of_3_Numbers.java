package ex_06_Ternary_Operator;

public class Largest_of_3_Numbers {
    public static void main (String [] args)
    {
        int firstNo = 20;
        int secondNo = 100;
        int thirdNo = 60;
        int largestNo = (firstNo >= secondNo) ? ((firstNo >= thirdNo) ? firstNo:thirdNo) :
                        ((secondNo>=thirdNo) ? secondNo:thirdNo);
        System.out.println("Largest number is " + largestNo);

    }

}
        //int n1 = 2, n2 = 9, n3 = -11;

//  100,34,10 ->  100

//int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3) ;
        //System.out.println("Largest Number: " + largest);