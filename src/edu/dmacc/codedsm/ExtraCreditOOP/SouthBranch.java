package edu.dmacc.codedsm.ExtraCreditOOP;

public abstract class SouthBranch extends SherylsSheShed {

    @Override
    public void StoreOpener(String employeeName, String employeePosition) {
        String StoreOpener = employeeName;
        String position = employeePosition;

        if (employeeName != null && employeePosition != null) {
            System.out.println(employeeName + ", " + employeePosition + "has made this store #2");

        } else {
            System.out.println("This place is a dump.");

        }
    }
}









