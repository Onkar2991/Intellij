package Array;

public class Duplicate2 {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        int [] array1={4,5,6,7,8};
        System.out.println("Common elements in the array are : ");
        for (int i =0 ; i< array.length;i++)
        {
            for (int j=0;j< array1.length;j++)
            {
                if (array[i]==array1[j])
                {
                    System.out.println(array1[j]);
                }

            }

        }

    }
}
