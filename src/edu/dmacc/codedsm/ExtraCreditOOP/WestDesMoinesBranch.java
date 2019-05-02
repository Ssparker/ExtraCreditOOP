package edu.dmacc.codedsm.ExtraCreditOOP;

public class WestDesMoinesBranch extends SherylsSheShed {
    @Override
    public void StoreOpener(String employeeName, String employeePosition) {
        String StoreOpener = employeeName;
        String position = employeePosition;

        if (employeeName != null && employeePosition != null) {
            System.out.println(employeeName + ", " + employeePosition + "has made this store #1!");

        } else {
            System.out.println(employeeName + employeePosition + "is a slacker.");

        }
    }

}









