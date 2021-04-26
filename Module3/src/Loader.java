public class Loader {
    public static void main(String[] args) {

        Cat tom = new Cat();
        tom.setName("Том");
        tom.catCount();
        System.out.println(tom.getName());
        Cat vasya = new Cat();
        vasya.catCount();
        vasya.setName("Вася");

        System.out.println(vasya.getName());
        System.out.println (getCat());
        getCat().catCount();
        System.out.println("Вася " + vasya.getStatus());
        System.out.println("Том " + tom.getStatus());
        System.out.println("Вася весит  " + vasya.getWeight());
        System.out.println("Том весит " + tom.getWeight());

        System.out.println("Вася " + vasya.eatFood(0.3));
        System.out.println("Том " + tom.eatFood(0.2));
        vasya.setColour(CatColour.GREY + " Серый");
        tom.setColour(CatColour.WHITE + " Белый");
        System.out.println(vasya.getColour());
        System.out.println(tom.getColour());
        System.out.println("двoйняшка Васи" + Cat.makeTwin(vasya));

    }


    private static Cat getCat(){
        return new Cat(1500.0 + 3000.0 * Math.random());//Метод генерации новой кошки
    }
}


