    /**

     ** Java Program to Implement Quick Sort

     **/

     

    import java.util.Scanner;
import javax.swing.table.DefaultTableModel;


    /** Class QuickSort **/

    public class Sort extends PullUpsChallenge

    {
        PullUpsChallenge c = new PullUpsChallenge();
        /** Quick Sort function **/
        public static void sort(int[] arr)

        {

            quickSort(arr, 0, arr.length - 1);

        }

        /** Quick sort function **/

        public static void quickSort(int arr[], int low, int high) 

        {

            int i = low, j = high;

            int temp;

            int pivot = arr[(low + high) / 2];

     

            /** partition **/

            while (i <= j) 

            {

                while (arr[i] < pivot)

                    i++;

                while (arr[j] > pivot)

                    j--;

                if (i <= j) 

                {

                    /** swap **/

                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

     

                    i++;

                    j--;

                }

            }

     

            /** recursively sort lower half **/

            if (low < j)

                quickSort(arr, low, j);

            /** recursively sort upper half **/

            if (i < high)

                quickSort(arr, i, high);

        }

        /** Main method **/

        public static void main(String[] args) 

        {

            Scanner scan = new Scanner( System.in );        

          

            int n = 0, i;
            String pNames = null;
            int pReps = 0;
            DefaultTableModel modTable = null;
            String names = null;
            int participants = 0;
            /** Accept number of elements **/
            

            System.out.println("Enter number of integer elements");
           // ask(pNames,  pReps, modTable,  names,participants, n);
            
            /** Create array of n elements **/

            int arr[] = new int[ n ];

            /** Accept elements **/

            System.out.println("\nEnter "+ n +" integer elements");

            for (i = 0; i < n; i++)

                arr[i] = scan.nextInt();

            /** Call method sort **/

            sort(arr);

            /** Print sorted Array **/

            System.out.println("\nElements after sorting ");        

            for (i = 0; i < n; i++)

                System.out.print(arr[i]+" ");            

            System.out.println();            

        }    

    }