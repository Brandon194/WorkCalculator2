package bills;

public class Bill {

    private String name;
    private String account;
    private int dayOfMonth = 1;
    private double total = 0.00;

    public Bill(String name, double total){
        this.name = name;
        this.total = total;
    }

    public Bill(String name, String account, int dayOfMonth, double total){
        this.name = name;
        this.account = account;
        this.dayOfMonth = dayOfMonth;
        this.total = total;
    }

    public String getName(){
        return name;
    }

    public String getAccount(){
        return account;
    }

    public int getDayOfMonth(){
        return dayOfMonth;
    }

    public double getTotal(){
        return total;
    }

    public String toString(){
        return name + "," + account + "," + dayOfMonth + "," + total;
    }
}
