package case1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Account {

    private List<Transaction> transactionList;

    public Account() {
		this.transactionList = new ArrayList<>();
    }

    public double getBalance() {
        return transactionList.stream().mapToDouble(Transaction::amount).sum();
    }

    public Date getLastTransactionDate() {
        return transactionList.size() == 0 ? null : getLastTransaction().date();
    }

    private Transaction getLastTransaction() {
        return transactionList.get(transactionList.size()-1);
    }

    public void credit(double amount) {
        createTransaction(-amount);
    }

    private void createTransaction(double amount) {
        transactionList.add(new Transaction(now(), amount));
    }

    private Date now() {
        return Calendar.getInstance().getTime();
    }

    public void debit(double amount) {
        createTransaction(amount);
    }

}
