package edu.dmacc.codedsm.ExtraCreditOOP;

public class Runner {
    public static void main(String[] args) {

        StoreOpener StoreOpener = new StoreOpener("Jeremy");
        WestDesMoinesBranch westDesMoinesBranch = new WestDesMoinesBranch();


        if (westDesMoinesBranch.StoreOpener(StoreOpener.getOpenerName())) {
            System.out.println("West Store is Open!"+ StoreOpener + "will be right with you.");
            } else {
            System.out.println("West Store is Closed!");
        }
//        if (EastVillageBranch.StoreOpener(StoreOpener.getOpenerName())) {   // East Village Branch
//                System.out.println("East Store is Open!"+ StoreOpener + "will be right with you.");
//        } else {
//            System.out.println("East Store is Closed!");
        }
//        if (SouthBranch.StoreOpener(StoreOpener.getOpenerName())) {    // South Branch
//            System.out.println("South Store is Open!"+ StoreOpener + "will be right with you.");
//        } else {
//            System.out.println("South Store is Closed!");
//        }


    }










