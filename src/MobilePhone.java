

public class MobilePhone {
    private String model;
    private int ram;
    private double price;


    //MODEL
    public String getModel(){
        return model;
    }

    public void setModel_(String model) throws IllegalAccessException {
        if (model.isEmpty()){
            throw new IllegalAccessException("MODEL HAS TO BE SOMETHING");
        }else {
            this.model =model;
        }
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int ram) throws IllegalAccessException {
        if(ram>512){
            throw new IllegalAccessException(" RAM CANNOT BE LESS THAN 32");
        } else {
            this.ram = ram;
        }
    }

    //PRICE
    public double getPrice(){
        return price;
    }

    public void setPrice(double price) throws IllegalAccessException {
        if(price>1400){
            throw new IllegalAccessException("PRICE CANNOT BE MORE THAN 1400");
        } else {
            this.price = price;
        }
    }

    public String toString() {
        return "The Phone model is " + this.model + " with   " + this.ram+ "GB" + " Price is " + this.price + " ";
    }



}

