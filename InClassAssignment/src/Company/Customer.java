package Company;

public class Customer {
    String name;
    double fees;
    double marketcap;
    String industry;
    String[] contacts;

    public Customer(String name, double fees, double marketcap, String industry, String[] contacts) {
        this.name = name;
        this.fees = fees;
        this.marketcap = marketcap;
        this.industry = industry;
        this.contacts = contacts;
    }

}
