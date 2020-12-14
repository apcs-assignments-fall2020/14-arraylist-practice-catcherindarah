import java.util.ArrayList;
import java.util.Scanner;
public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int x = 0;
        int y = list.size();
        for (int i = 0; i < y; i++)
        {
            int t = list.get(i);
            if(t % 2 != 0)
            {
                x++;
            }
            else
            {
                x = x;
            }
        }
        return x;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        int x = 0;
        int y = list1.size();
        for(int i = 0; i < y; i++)
        {
            int item = list1.get(i);
            if (list2.contains(item))
            {
                x++;
            }
            else
            {
                x = x;
            }
        }
        if (x!= 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> newint = new ArrayList<Integer>(arr.length);
        for (int i = 0; i < arr.length; i++)
        {
            newint.add(arr[i]);
        }
        return newint;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?");
        int n = scan.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the " + n + " numbers");
        for(int i = 0; i < array.length; i++) 
        {
            array[i] = scan.nextInt();
            convertToArrayList(array);
        }
    }
}
