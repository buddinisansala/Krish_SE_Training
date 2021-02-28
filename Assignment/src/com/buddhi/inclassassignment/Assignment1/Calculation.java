package com.buddhi.inclassassignment.Assignment1;

import com.buddhi.inclassassignment.Exception.NullStringException;

public class Calculation {
        int sum;

    public void calculateTotal(String word) throws NullStringException{
        int length=word.length();
            if(word==null){
                throw new NullStringException("String cannot be null");
            }

        String wordLowerCase = word.toLowerCase();

        char [] charArry = wordLowerCase.toCharArray();

        int sumOfValues =0;

        for(int i =0 ; i<charArry.length;i++) {
            if(charArry[i]==32)
                break;

            if((charArry[i]>=97) && (charArry[i]<=122))
                sumOfValues += (charArry[i]-96);
        }
        if (sumOfValues!=0) {
            System.out.println("Value of entered letters : "+sumOfValues);

        } else {
            System.out.println("Enter word not contain letters");

        }

    }

}
