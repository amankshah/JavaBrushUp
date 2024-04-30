package Oops.FinalKeyWord;

public abstract class Vehicle {

        private int ID;
        private final String brand ="Benz";

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
        public final void drive(){

        };


    public String getBrand() {  return brand;}


}
