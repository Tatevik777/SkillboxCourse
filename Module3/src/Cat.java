public class Cat<eyesCount> {


    private double originWeight;
    private double weight;
    private double maxWeight;
    private double minWeight;
    private double relieve;
    private static int count;
    private static final int eyesCount = 2;
    private static final int minimumWeight = 500;
    private static final int maximumWeight = 10000;
   public String colour;
    private String name;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        relieve= 500* Math.random();

    }
    public Cat(double weight){
        this();
        this.weight=weight;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }
    public void setColour(String colour){
        this.colour=colour;

    }
    public void setName (String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public String  getColour (){
        return colour;
    }
    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public Double eatFood(Double amount){
        System.out.println(" Кот обжора съел " + amount + " грамм");

        return  amount ;


    }
    public void goTo_Toilet(){
       weight= weight-relieve;
        System.out.println(" Кот облегчился на " + relieve + " и весит " + weight);
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }

    }

    public void catCount(){
        Cat.count++;
        System.out.println("Живых кошек наблюдается " + count);}

    public Cat makeTwin(){
        Cat catTwin = new Cat(this.weight);
        catTwin.originWeight = this.originWeight;
        catTwin.minWeight = this.minWeight;
        catTwin.maxWeight = this.maxWeight;
        return catTwin;
    }

    public static Cat makeTwin(Cat ownerCat) {
        return ownerCat.makeTwin();
    }
    }




