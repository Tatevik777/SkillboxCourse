public class Loader {
    public static void main(String[] args) {
        int milkAmount = 200; // ml
        int powderAmount = 5; // g
        int eggsCount = 3; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

       boolean canCookOmelete= false;
       boolean canCookPancakes= false;
       boolean canCookApplePie= false;
       boolean canCookFriedEggs=true;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (milkAmount >= 1000 && powderAmount >= 400  && sugarAmount >= 10 && oilAmount>=30) {
            System.out.println("Can cook Pancakes");
        } else {
            System.out.println("Need to buy some products for Pancakes");
            System.out.println(canCookPancakes ? "Master chef is ready to cook Pancakes" : "Let's go to the  grocery shop");
        }


        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("can cook Omelete");
        }else{
            System.out.println("Need to buy some products for Omelete");

            System.out.println(canCookOmelete ? "Master chef is ready to cook Omelete" : "Let's go to the  grocery shop");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4

        if (milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 && appleCount >=3) {

            System.out.println("Can cook Apple pie");
        } else {
            System.out.println("Need to buy some products for Apple pie");
            System.out.println(canCookApplePie ? "Master chef is ready to cook Apple pie" : "Let's go to the  grocery shop");
        }
        if (oilAmount >= 10  && eggsCount >= 2 ) {

            System.out.println("Can cook Fried Eggs");
        } else {
            System.out.println("Need to buy some products for Fried Eggs");
            if (milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 && appleCount >=3) {

                System.out.println("Can cook Apple pie");
            } else {
                System.out.println("Need to buy some products for Apple pie");
                System.out.println(canCookFriedEggs ? "Master chef is ready to cook Apple pie" : "Let's go to the  grocery shop");
            }
        }
    }}



