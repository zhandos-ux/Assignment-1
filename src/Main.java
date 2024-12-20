class Don {
    private double amt;
    private Donor dnr;
    private Char chr;

    public Don(double amt, Donor dnr, Char chr) {
        this.amt = amt;
        this.dnr = dnr;
        this.chr = chr;
    }
    public double getAmt() {
        return amt;
    }
    public void setAmt(double amt) {
        this.amt = amt;
    }
    public Donor getDnr() {
        return dnr;
    }
    public void setDnr(Donor dnr) {
        this.dnr = dnr;
    }
    public Char getChr() {
        return chr;
    }
    public void setChr(Char chr) {
        this.chr = chr;
    }
    @Override
    public String toString() {
        return "Don: " + amt + ", Donor: " + dnr.getNm() + ", Char: " + chr.getNm();
    }
}

class Donor {
    private String nm;

    public Donor(String nm) {
        this.nm = nm;
    }
    public String getNm() {
        return nm;
    }
    public void setNm(String nm) {
        this.nm = nm;
    }
    @Override
    public String toString() {
        return nm;
    }
}

class Char {
    private String nm;
    public Char(String nm) {
        this.nm = nm;
    }
    public String getNm() {
        return nm;
    }
    public void setNm(String nm) {
        this.nm = nm;
    }
    @Override
    public String toString() {
        return nm;
    }
}

public class Main {
    public static void main(String[] args) {
        Donor dnr1 = new Donor("Yusuf Serik");
        Donor dnr2 = new Donor("Arman Osmanov");
        Char chr1 = new Char("For training");
        Char chr2 = new Char("For accommodation");
        Don don1 = new Don(150.0, dnr1, chr1);
        Don don2 = new Don(180.0, dnr2, chr2);
        System.out.println(don1);
        System.out.println(don2);

        if (don1.getAmt() > don2.getAmt()) {
            System.out.println(dnr1.getNm() + " donated more than " + dnr2.getNm());
        } else if (don1.getAmt() < don2.getAmt()) {
            System.out.println(dnr2.getNm() + " donated more than " + dnr1.getNm());
        } else {
            System.out.println("Both donations are of the same amount.");
        }

        dnr1.setNm("Yusuf Serikbayev");
        dnr2.setNm("Arman Osmanuly");
        System.out.println("Updated donors:");
        System.out.println(dnr1);
        System.out.println(dnr2);
    }
}
