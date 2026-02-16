public class Sandwich {
    private String bread;
    private String meat;
    private String cheese;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
        System.out.println("Bread added successfully");
    }

    public String getMeat() {
        return meat;
    }


    public String getCheese() {
        return cheese;
    }

    public void addCheese(String cheese) {
        if (this.bread != null) {
            this.cheese = cheese;
            System.out.println("Cheese added successfully");
        }else {
            System.out.println("Please add bread first");
        }
    }
    public void addMeat(String meat) {
        if (this.bread != null) {
            this.meat = meat;
            System.out.println("Meat added successfully");
        }else {
            System.out.println("Please add bread first");
        }

    }
}