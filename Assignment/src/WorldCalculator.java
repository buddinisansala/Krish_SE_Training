import java.util.Scanner;

public class WorldCalculator {
    public static void main(String args[]){
        Scanner word = new Scanner(System.in);
        System.out.println("Enter the word :");
        String wordName = word.nextLine();

        wordCalculator(wordName);
    }

    public static int wordCalculator(String wordName){

        wordName = wordName.toLowerCase();
        int temp = 0;

        for(int i=0; i < wordName.length() ; i++){
            char c = wordName.charAt(i);
            if(c=='a'){
                temp += 1;
            }


        }
        return temp;
    }

}
