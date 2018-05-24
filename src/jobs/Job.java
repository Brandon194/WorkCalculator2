package jobs;

public class Job {

    private String name;
    private double rateOfPay = 11.25;
    private double hoursWorked = 0;
    private int taxRateInPercent = 20;

    public Job(String name, double rateOfPay){
        this.name = name;
        this.rateOfPay = rateOfPay;
    }

    public Job(String name, double rateOfPay, double hoursWorked, int taxRateInPercent){
        this.name = name;
        this.rateOfPay = rateOfPay;
        this.hoursWorked = hoursWorked;
        this.taxRateInPercent = taxRateInPercent;
    }

    public String getName(){
        return name;
    }

    public double getRateOfPay(){
        return rateOfPay;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    public int getTaxRateInPercent(){
        return taxRateInPercent;
    }

    public String toString(){
        return name + "," + rateOfPay + "," + hoursWorked + "," + taxRateInPercent;
    }
}
