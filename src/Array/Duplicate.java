package Array;

public class Duplicate {
//    class DuplicateArrayElement
//    {
        public static void main(String[] args)
        {
            int arr[]= new int[]{1,2,3,3,5,2,1,10,5,78,8,9};

            System.out.println("Duplicate Elements in the array are ");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {

                    if(arr[i]==arr[j])
                    {
                        System.out.println(arr[j]);
                    }
                }
            }
//        }

    }
}
