public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsAdded=150;

    private int backPack=20;



    public Pizza(Boolean veg) {//constructor
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price=400;
        }
    }
    public void addExtraCheese(){
        System.out.println("Extra cheese added");
        this.price+=extraCheesePrice;

    }
    public void addExtraToppings(){
        System.out.println("Extra toppings added ");
        this.price+=extraToppingsAdded;

    }
    public void TakeAway(){

    }

    public void getBill(){

    }
}
