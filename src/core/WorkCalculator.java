package core;

import bills.BillHandler;
import jobs.JobHandler;

public class WorkCalculator {

    public WorkCalculator(){
        BillHandler bills = new BillHandler(20);
        JobHandler jobs = new JobHandler(1);

        jobs.addJob("UPS", 14.1,20,20);

        bills.addBill("Rent", "Bills", 1, (875/4));
        bills.addBill("Power", "Bills", 1, (90/4));
        bills.addBill("Rent", "Bills", 1, (875/4));

        bills.addBill("Service Charge", "Bills", 7, 13.95);
        bills.addBill("Service Charge", "Chequings", 17, 13.92);
        bills.addBill("Cellphone", "Visa", 5, 220.31);
        bills.addBill("Rent Insurance", "Bills", 1, 10.65);
        bills.addBill("Cell Insurance", "Chequings", 1, 13.79);
        bills.addBill("Savings", "Chequings", 2, 25);
        bills.addBill("Savings", "Chequings", 20, 25);
        bills.addBill("Taxi", "Chequings", 1, 100);

        bills.addBill("Google", "Visa", 5, 10.98);
        bills.addBill("Humble Bundle", "Chequings", 2, 15.43);
        bills.addBill("Bisect", "Visa", 10, 10);

        int total = 0;
        for (int i=0;i<bills.getBills().length;i++){
            System.out.println(i);
            total += bills.getTotal(i);
        }
        System.out.println("Total: " + total);
    }


    public static void main(String[] args){
        new WorkCalculator();
    }
}
