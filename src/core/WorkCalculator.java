package core;

import bills.BillHandler;
import jobs.JobHandler;

public class WorkCalculator {

    JobHandler jobHandler;
    BillHandler billHandler;

    public WorkCalculator(){
        startup();
    }

    public void startup(){
        jobHandler = new JobHandler();
    }


    public static void main(String[] args){
        new WorkCalculator();
    }
}
