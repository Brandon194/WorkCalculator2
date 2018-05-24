package bills;

public class BillHandler {

    Bill[] bills;

    public BillHandler(int numOfBills){
        bills = new Bill[numOfBills];
    }



    public void addBill(String name, double total){
        for (int i=0;i<bills.length;i++){
            if (bills[i] == null){
                bills[i] = new Bill(name, total);
                return;
            }
        }

        addIndex();

        bills[bills.length-1] = new Bill(name, total);
    }

    public void addBill(String name, String account, int dayOfMonth, double total){
        for (int i=0;i<bills.length;i++){
            if (bills[i] == null){
                bills[i] = new Bill(name, account, dayOfMonth, total);
                return;
            }
        }

        addIndex();

        bills[bills.length-1] = new Bill(name, account, dayOfMonth, total);
    }

    public void addIndex(){
        Bill[] temp = new Bill[bills.length+1];

        for (int i=0;i<bills.length;i++){
            temp[i] = bills[i];
        }

        bills = temp;
    }

    public Bill getBill(int index){
        return bills[index];
    }

    public int getIndex(String name){
        for (int i=0;i<bills.length;i++){
            if (bills[i].getName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }

        return -1;
    }

    public String getName(int index){
        if (index > -1 && index < bills.length && bills[index] != null)
            return bills[index].getName();
        return "Error In billHandler.getName(index)";
    }

    public String getAccount(int index){
        if (index > -1 && index < bills.length && bills[index] != null)
            return bills[index].getAccount();
        return "Error in BillsHandler.getAccount(index)";
    }

    public int getDayOfMonth(int index){
        if (index > -1 && index < bills.length && bills[index] != null)
            return bills[index].getDayOfMonth();
        return -1;
    }

    public double getTotal(int index){
        if (index > -1 && index < bills.length && bills[index] != null)
            return bills[index].getTotal();
        return -1;
    }

    public Bill[] getBills(){
        return bills;
    }
}
