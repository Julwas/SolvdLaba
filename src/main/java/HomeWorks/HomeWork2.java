package HomeWorks;

public class HomeWork2 {
    static void selectionSort(int[] inputArray)
    {

        for (int i = 0; i < inputArray.length - 1; i++)
        {
           int min_index = i;

            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[j] < inputArray[min_index] )
                {
                    min_index = j;
                }
            }

            int first = inputArray[i];

            inputArray[i] = inputArray[min_index];

            inputArray[min_index] = first;
        }

        for (int i = 0; i < inputArray.length; i++)
        {
            System.out.print(inputArray[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        selectionSort(new int[] {100, 8, 62, 12, 101, 62});


    }
}
