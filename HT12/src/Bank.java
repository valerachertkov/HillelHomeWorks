import java.util.ArrayList;
public class Bank {
    ArrayList<Account> accounts= new ArrayList<Account>();
    public void addaccount(Account a){
        accounts.add(a);
    }
    public void remove(Account a) {
        accounts.remove(a);
    }
    public void block(Account a){
        a.setBlocked(true);
    }
    public void unblock(Account a){
        a.setBlocked(false);
    }
    public void transtrfer(Account a,Account b,double m){
        if (a.getMoney()-m>0){
            a.setMoney(a.getMoney()-m);
            a.print();
            b.setMoney(b.getMoney()+m);
            b.print();
            System.out.println("ok");
        }
        else System.out.println("no");
    }
}
