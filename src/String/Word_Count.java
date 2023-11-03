package String;

import java.util.Scanner;

public class Word_Count {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = s.nextLine();

        String words[] = str.split(" ");
        int wordsLen = words.length;

        System.out.println("\n----Occurrences of Each Word----");
        for(int i=0; i<wordsLen; i++)
        {
            String word = words[i];
            int count = 1;
            for(int j=(i+1); j<(wordsLen-1); j++)
            {
                if(word.equals(words[j]))
                {
                    count++;
                    for(int k=j; k<(wordsLen-1); k++)
                    {
                        words[k] = words[k+1];
                    }
                    wordsLen--;
                    j--;
                }
            }
            System.out.println(word+ " occurs " +count);
            count = 0;
        }
    }
}
