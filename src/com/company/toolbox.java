package com.company;

import java.util.ArrayList;
import java.util.Random;

public class toolbox {
    public static tribe starterAmount(String name){
        resources temp=new resources(0,0,0,0,0);
        randomResource(temp);
        ArrayList<generator> generators=new ArrayList();
        generators.add(randomGenerator());
        tribe output=new tribe(name, 1, 1,true,temp, generators);
        return output;
    }

    public static generator randomGenerator(){
        Random rand=new Random();
        int cardNum=rand.nextInt(8);
        generator temp= null;
        if(cardNum==1 ||cardNum==2){
             temp=new generator("Coconut Tree", 1, 1);
        }
        else if(cardNum==3){
             temp=new generator("Super Coconut Tree", 2, 1);
        }
        else if(cardNum==4 ||cardNum==5){
             temp=new generator("Spear", 2, 2);
        }
        else if(cardNum==6||cardNum==7){
             temp=new generator("Net", 2, 2);
        }
        return temp;
    }

    public static void randomResource(resources input){
        Random rand=new Random();
        int cardNum=rand.nextInt(5);
        if(cardNum==1){
            input.recieveBlanket();
        }
        else if(cardNum==2){
            input.recieveMedicine();
        }
        else if(cardNum==3){
            input.recieveBoat();
        }
        else if(cardNum==4){
            input.recieveSword();
        }

    }
    public static void randomCard(tribe input){
        Random rand=new Random();
        int random=rand.nextInt(2);
        if(random==1){
            tribe.class
        }

    }

}
