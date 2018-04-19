package jobs;

public class JobHandler {

    private Job[] jobs;

    public JobHandler(int numOfJobs){
        jobs = new Job[numOfJobs];
    }

    public void addJob(String name, double rateOfPay){
        for (int i=0;i<jobs.length;i++){
            if (jobs[i] == null){
                jobs[i] = new Job(name, rateOfPay);
                return;
            }
        }

        addIndex();

        jobs[jobs.length-1] = new Job(name, rateOfPay);
    }

    public void addJob(String name, double rateOfPay, double hoursWorked, int taxRateInPercent){
        for (int i=0;i<jobs.length;i++){
            if (jobs[i] == null){
                jobs[i] = new Job(name, rateOfPay, hoursWorked, taxRateInPercent);
                return;
            }
        }

        addIndex();

        jobs[jobs.length-1] = new Job(name, rateOfPay, hoursWorked, taxRateInPercent);
    }

    public void addIndex(){
        Job[] temp = new Job[jobs.length+1];

        for (int i=0;i<jobs.length;i++){
            temp[i] = jobs[i];
        }

        jobs = temp;
    }



    public int getIndex(String name){
        for (int i=0;i<jobs.length;i++){
            if (jobs[i].getName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }

        return -1;
    }

    public Job getJob(int index){
        if (index > -1 && index < jobs.length)
            return jobs[index];
        return null;
    }
    public String getJobName(int index){
        if (index > -1 && index < jobs.length)
            return jobs[index].getName();
        return "Error in JobHandler.getJobName(index)";
    }
    public double getRateOfPay(int index){
        if (index > -1 && index < jobs.length)
            return jobs[index].getRateOfPay();
        return -1;
    }
    public double getHoursWorked(int index){
        if (index > -1 && index < jobs.length)
            return jobs[index].getHoursWorked();
        return -1;
    }
    public double getTaxRateInPercent(int index){
        if (index > -1 && index < jobs.length && jobs[index] != null)
            return jobs[index].getTaxRateInPercent();
        return -1;
    }
    public Job[] getJobs(){
        return jobs;
    }
}
