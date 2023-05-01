package com.company;

import java.util.ArrayList;

class tribe{
    String name;
    int peopleAmount;
    int coconutAmount;
    boolean alive;
    resources Resources;
    ArrayList<generator> generators;

    tribe(String name, int peopleAmount, int coconutAmount, boolean alive , resources Resources, ArrayList<generator> generators){
        this.name=name;
        this.peopleAmount=peopleAmount;
        this.coconutAmount=coconutAmount;
        this.alive=alive;
        this.Resources=Resources;
        this.generators=generators;
    }

    void feed(){
        this.peopleAmount-=coconutAmount-peopleAmount;
        if(peopleAmount>=0){
            alive=false;
        }

    }

    void recieveCoconut(){
        for (generator generator:generators) {
            coconutAmount+=generator.turnYield();
        }
    }

    void buyPerson(){
        if(coconutAmount>0){
            peopleAmount++;
            coconutAmount--;
        }
    }
}
