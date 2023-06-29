public class Oops {
    public static void main(String[] args) {

        Pen p1 = new Pen(); // creation of an object pen
        p1.setColor("pink");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.setTip(5);
        // System.out.println(p1.tip);
        System.out.println(p1.getTip());

        // BankAccount myacc = new BankAccount();
        // myacc.username = "Vaibhav Singh";
        // // myacc.password = "abcd"; // we cannot access private methods
        // myacc.setPassword("vai07");
        // System.out.println(myacc.username);

    }
}

class Pen {
    private int tip;
    private String color;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    public void setColor(String newcolor) {
        color = newcolor;
    }

    public void setTip(int newtip) {
        tip = newtip;
    }
}

// class BankAccount {
// public String username;
// private String password;

// public void setPassword(String pwd) {
// password = pwd;
// }
// }