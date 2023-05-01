package com.company;

public class resources {
    int blanketAmount;
    int medicineAmount;
    int boatAmount;
    int swordAmount;
    int swordsThatCanForceTrade;

    resources(int blanketAmount, int medicineAmount, int boatAmount, int swordAmount, int swordsThatCanForceTrade){
        this.blanketAmount=blanketAmount;
        this.medicineAmount=medicineAmount;
        this.boatAmount=boatAmount;
        this.swordAmount=swordAmount;
        this.swordsThatCanForceTrade=swordsThatCanForceTrade;
    }

    void recieveBlanket(){
        blanketAmount++;
    }
    void recieveMedicine(){
        medicineAmount++;
    }
    void recieveBoat(){
        boatAmount++;
    }
    void recieveSword(){
        swordAmount++;
        swordsThatCanForceTrade++;
    }

    boolean forceTrade(){
        if(swordsThatCanForceTrade>=1 ){
            swordsThatCanForceTrade--;
        }
        return swordsThatCanForceTrade>=1;
    }

    boolean useMedicine(){
        if(medicineAmount>=1){
            medicineAmount--;
        }
        return medicineAmount>=1;
    }
}
