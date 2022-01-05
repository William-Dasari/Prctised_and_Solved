//question: Write a code to differentiate Adult and Child based on their age

package com.lead;
public class AdultChild
{
    public static void main(String[] args)
    {
        //defining and initializing
        int count=0,i=0,seq=0;
        int[] age={12,15,50,8,25,49,56,81,15,18,19,85};

        //logic to count child
        for(i=0;i<age.length;i++)
        {
            if(age[i]<=18)
            {
                count++;
            }
        }
        System.out.println("Child count : "+count);

        //logic to count adult
        for(i=0;i<age.length;i++)
        {
            if (age[i] > 18 && age[i]<=100)
                seq++;
        }
        System.out.println("Adult count : "+seq);
    }
}
