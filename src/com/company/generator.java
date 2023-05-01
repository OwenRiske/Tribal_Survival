package com.company;
class generator{
    String name;
    int coconutYield;
    int turnCoolDown;
    int coolDown;

    generator(String name, int coconutYield, int turnCoolDown){
        this.name=name;
        this.coconutYield=coconutYield;
        this.turnCoolDown=turnCoolDown;
        this.coolDown=turnCoolDown;
    }

    int turnYield(){
    coolDown-=1;
    if(turnCoolDown==0){
        coolDown=turnCoolDown;
        return coconutYield;
    }
    return 0;
}
  }
