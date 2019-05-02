package edu.dmacc.codedsm.ExtraCreditOOP;

public class StoreOpener extends SherylsSheShed {

    private String OpenerName;
    private String Postition;

    public StoreOpener(String Jeremy) {
        super();
    }

    public String getOpenerName() {
        return OpenerName;
    }

    public void setOpenerName(String openerName) {
        OpenerName = openerName;
    }

    public String getPostition() {
        return Postition;
    }

    public void setPostition(String postition) {
        Postition = postition;
    }

    public StoreOpener(String OpenerName, String Position) {

    }

    @Override
    public String toString() {
        return "StoreOpener{" +
                "OpenerName='" + OpenerName + '\'' +
                ", Postition='" + Postition + '\'' +
                '}';
    }


    @Override
    public void StoreOpener(String employeeName, String employeePosition) {

    }
}
