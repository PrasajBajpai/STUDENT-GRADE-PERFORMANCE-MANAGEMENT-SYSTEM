public class Marks {

    private double mathematics;
    private double java;
    private double dbms;
    private double dsa;

    public Marks(double mathematics, double java, double dbms, double dsa) {

        this.mathematics = mathematics;
        this.java = java;
        this.dbms = dbms;
        this.dsa = dsa;
    }

    public double getMathematics() {
        return mathematics;
    }

    public double getJava() {
        return java;
    }

    public double getDbms() {
        return dbms;
    }

    public double getDsa() {
        return dsa;
    }

    public double getTotal() {

        return mathematics + java + dbms + dsa;
    }

    public double getPercentage() {

        return getTotal() / 4;
    }

    public void displayMarks() {

        System.out.println("Mathematics : " + mathematics);
        System.out.println("Java        : " + java);
        System.out.println("DBMS        : " + dbms);
        System.out.println("DSA         : " + dsa);
        System.out.println("----------------------------------------------");
        System.out.println("Total       : " + getTotal() + " / 400");
        System.out.printf("Percentage  : %.2f%%\n", getPercentage());
    }
}