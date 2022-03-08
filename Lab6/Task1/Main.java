package Lab6.Task1;

public class Main {

    public static void main(String[] args) {

        // I. declare an array of 20 cake objects
        Cake[] cakeList = new Cake[20];

        Cake cake1 = new OrderCake("cake1", 1000.0, 2.0);
        Cake cake2 = new ReadyMadeCake("cake2", 12.0, 2);
        Cake cake3 = new OrderCake("cake3", 9.0, 2.0);
        Cake cake4 = new ReadyMadeCake("cake4", 12.0, 9);
        Cake cake5 = new OrderCake("cake5", 8.0, 2.0);
        Cake cake6 = new ReadyMadeCake("cake6", 12.0, 6);
        Cake cake7 = new OrderCake("cake7", 7.0, 2.0);
        Cake cake8 = new ReadyMadeCake("cake8", 6.0, 2);
        Cake cake9 = new OrderCake("cake9", 16.0, 2.5);
        Cake cake10 = new ReadyMadeCake("cake10", 13.0, 3);
        Cake cake11 = new OrderCake("cake11", 15.0, 2.0);
        Cake cake12 = new ReadyMadeCake("cake12", 12.0, 10);
        Cake cake13 = new OrderCake("cake13", 17.0, 7.0);
        Cake cake14 = new ReadyMadeCake("cake14", 18.0, 1);
        Cake cake15 = new OrderCake("cake15", 19.0, 4.0);
        Cake cake16 = new ReadyMadeCake("cake16", 12.0, 8);
        Cake cake17 = new OrderCake("cake17", 20.0, 7.0);
        Cake cake18 = new ReadyMadeCake("cake18", 12.0, 12);
        Cake cake19 = new OrderCake("cake19", 1.0, 2.0);
        Cake cake20 = new ReadyMadeCake("cake20", 11.0, 13);

        // II. input data from cake objects and store them into the array
        cakeList[0] = cake1;
        cakeList[1] = cake2;
        cakeList[2] = cake3;
        cakeList[3] = cake4;
        cakeList[4] = cake5;
        cakeList[5] = cake6;
        cakeList[6] = cake7;
        cakeList[7] = cake8;
        cakeList[8] = cake9;
        cakeList[9] = cake10;
        cakeList[10] = cake11;
        cakeList[11] = cake12;
        cakeList[12] = cake13;
        cakeList[13] = cake14;
        cakeList[14] = cake15;
        cakeList[15] = cake16;
        cakeList[16] = cake17;
        cakeList[17] = cake18;
        cakeList[18] = cake19;
        cakeList[19] = cake20;

        // III. display the total price for all types of cakes
        double priceForAllTypeOfCake = 0.0;
        for (Cake i : cakeList) {
            priceForAllTypeOfCake = priceForAllTypeOfCake + i.calcPrice();
        }
        System.out.println("Total Price For All Types Of Cakes = " + priceForAllTypeOfCake);


        // IV. display the total price and the quantity sold for ready-made cakes
        double totalPriceForAllReadyMadeCakes = 0.0;
        int totalQuantityForAllReadyMadeCakes = 0;
        for (Cake i : cakeList) {
            if(i.getClass().equals(new ReadyMadeCake("test", 0.0, 0).getClass())){
                totalPriceForAllReadyMadeCakes = totalPriceForAllReadyMadeCakes + i.calcPrice();
                totalQuantityForAllReadyMadeCakes = totalQuantityForAllReadyMadeCakes + ((ReadyMadeCake) i).getQuantity();
            }
        }
        System.out.println("Total Price For All Ready Made Cakes = " + totalPriceForAllReadyMadeCakes);
        System.out.println("Total Quantity For All Ready Made Cakes = " + totalQuantityForAllReadyMadeCakes);

        // display the information for the cake that has been sold for highest price
        double highestPrice = 0.0;
        String infoHighestPriceCake="";
        for (Cake i : cakeList) {
            if(i.calcPrice()>highestPrice){
                highestPrice=i.calcPrice();
                infoHighestPriceCake = i.toString();
            }
        }
        System.out.println("\n----Information for the cake that has been sold for highest price----");
        System.out.println("Name\tRate\tTotal");
        System.out.print(infoHighestPriceCake);
        System.out.println("\t"+highestPrice);
    }
}
