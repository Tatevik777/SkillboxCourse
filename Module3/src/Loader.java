public class Loader {
    public static void main(String[] args)
    {

       Cat tom= new Cat();
       tom.setName("Том");

       Cat vasya = new Cat();
       vasya.setName(tom.getName());

        System.out.println(tom.getName());
        System.out.println(vasya.getName());

    }
       public static Cat getCat(){
        return new Cat(1000);
}



    }


