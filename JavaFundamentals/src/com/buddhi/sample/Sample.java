package com.buddhi.sample;

public class Sample {
    int classLevel = 8 ;

    public static void main(String args[]){
        String name = "Buddhi";
        System.out.println("Hello "+ name);
    }
    public void demo(){
        int methodLevel;

        for(int x = 0; x < 10; x++){
            int blockLevel;
            //all variable can access here
            classLevel = 0;
            methodLevel = 0;
            blockLevel = 0;
        }
        //block level not visible
    }
    //method, block level not visible


}
