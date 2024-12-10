public class Account {
    public double getMoney() {
        return money;
    }

    public void setMoney(double m) {
        if (m<0){
            System.out.print("too much");
        return;
        }
        money=m;
    }

    private double money;

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    boolean isBlocked = false;
    Account(double m){
        money=m;
    }
    public void print(){
        System.out.println("money: "+money+" isBlocked: "+isBlocked);
    }
}
