package core;

import bills.BillHandler;
import fileIO.FileReadWrite;
import jobs.JobHandler;
import misc.Parse;

public class Save {



    BillHandler billHandler;
    JobHandler jobHandler;

    public Save(BillHandler billHandler, JobHandler jobHandler){
        this.billHandler = billHandler;
        this.jobHandler = jobHandler;
    }

    public void saveBills() {
        String[] s = new String[billHandler.getBills().length];
        for (int i=0; i < billHandler.getBills().length ;i++){
            if (billHandler.getBills()[i] != null)
            s[i] = billHandler.getBills()[i].toString();
        }

        FileReadWrite frw = new FileReadWrite("WorkCalculator2", "Bills", "csv");
        frw.write(s);
    }

    public void saveJobs(){
        String[] s = new String[jobHandler.getJobs().length];
        for (int i=0; i < jobHandler.getJobs().length ;i++){
            if (jobHandler.getJobs()[i] != null)
                s[i] = jobHandler.getJobs()[i].toString();
        }

        FileReadWrite frw = new FileReadWrite("WorkCalculator2", "Jobs", "csv");
    }

    public void loadBills() {
        FileReadWrite frw = new FileReadWrite("WorkCalculator2", "Bills", "csv");
        String[] s = frw.read();
        for (int i = 0; i < s.length; i++) {
            try {
                String[] ss = s[i].split(",");
                billHandler.addBill(s[0], s[1], Parse.parseInt(s[2]), Parse.parseDouble(s[3]));
            } catch (Exception e) {
                System.out.println("Load Error, Bills");
            }
        }
    }

    public void loadJobs(){
        FileReadWrite frw = new FileReadWrite("WorkCalculator2", "Jobs", "csv");
        String[] s = frw.read();
        String[][] sArray = new String[s.length][4];

        for (int i=0;i<s.length;i++){
            sArray[i] = s[i].split(",");
            jobHandler.addJob(sArray[i][0], Parse.parseDouble(sArray[i][1]), Parse.parseDouble(sArray[i][2]), Parse.parseInt(sArray[i][3]));
        }

        System.out.println("Load Complete");
    }
}
