package athomepractise.classdeclaration;
/*
class Main {
    // swap() doesn't swap i and j
    public static void swap(Integer i, Integer j)
    {
        //Integer temp = new Integer(i);
        i= 15;
        j = 50;
    }
    public static void main(String[] args)
    {
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }
}
*/

/*
// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

import javax.xml.transform.Source;
import java.sql.Array;
import java.sql.SQLOutput;

// A sample functional interface (An interface with
// single abstract method
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}

class ThisIsTest
{
    public static void main(String args[])
    {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = //(int x)->System.out.println(2*x);
                x-> System.out.println(2*x);
               /* new FuncInterface() {
                    @Override
                    public void abstractFun(int x) {
                        System.out.println(2*x);
                    }
                };

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);

    }
}
*/
//Java program to sort large numbers represented
//as strings.
        import java.util.*;

class main
{
    // Function for sort an array of large numbers
    // represented as strings
    static void sortLargeNumbers(String arr[])
    {
        // Refer below post for understanding below expression:
        // https://www.geeksforgeeks.org/lambda-expressions-java-8/
        Arrays.sort(arr, (left, right) ->
        {
			/* If length of left != right, then return
			the diff of the length else use compareTo
			function to compare values.*/
            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });
    }

    // Driver code
    public static void main(String args[])
    {
        String arr[] = {"5", "1237637463746732323",
                "97987", "12" };
        sortLargeNumbers(arr);
        for (String s : arr)
            System.out.print(s + " ");
    }
}

