package duck.choice;

public class ShopApp {

    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        System.out.println("Welcome to Duke choice Shop");
        customer c1 = new customer();
        c1.setName("Pinky");
        c1.setSize("S");

        System.out.println("customer is:" + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing[] items = {item1, item2,new Clothing(),new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");
        
        items[2].setDescription("Green scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");
        
        items[3].setDescription("Blue T-shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

      //System.out.println("Item1"+","+ item1.description +","+ item1.price +","+ item1.size);
        //System.out.println("Item2"+","+ item2.description +","+ item2.price +","+ item2.size);
      //total = (item1.price+item2.price*2)*(1 + tax);
        int measurement = 3; //Extructura de caso 

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                c1.setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }
        for (Clothing item : items) {
            if (c1.getSize().equals(item.getSize())) {
                total = total + item.getPrice();
                System.out.println("Item" + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
                if(total>15){break;}
            }  
        }
         System.out.println("Total es :" + total);
    }
}