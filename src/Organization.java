public class Organization {

    private final Fund fund;

    public Organization(String name) {
        fund = new Fund(name);
    }

    public Fund getFund() {
        return new Fund(fund); // make a defensive copy
    }

    public void donate(int amount) {
        fund.getDonations().add(amount);
    }

    public int total() {
        int total = 0;
        for (int d : fund.getDonations()) {
            total += d;
        }
        return total;
    }

    public String getFundName() {
        return fund.name;
    }
}