package bla;

public class Question9 {


    public enum House {

        VILLA(1234567.89f), CASTLE(789.7f), PALACE(9087.98f);

        float price;

        House(float price) {
            this.price = price;
            System.out.println("House Type : " + this.toString() + " price : Rs." + this.price);
        }

        public float getPrice() {
            return price;
        }
    }


    public static void main(String[] args) {
        House house = House.VILLA;
        System.out.println(" The Cost of : " + house + " is Rs." + house.getPrice());
    }
}
