interface Animal
{
    void eat();
}

class Cow implements Animal
{
    public void eat()
    {
        System.out.println("Eating");
    }
}

class AnimalDecorator implements Animal
{
    protected Animal decoratedAnimal;

    public AnimalDecorator(Animal decoratedAnimal)
    {
        this.decoratedAnimal=decoratedAnimal;
    }

    public void eat()
    {
        decoratedAnimal.eat();
    }
}

class SpecialBehaviorDecorated extends AnimalDecorator
{
    public SpecialBehaviorDecorated(Animal decoratedAnimal)
    {
        super(decoratedAnimal);
    }

    public void eat()
    {
        super.eat();
        addSpecialBehavior();
    }

    private void addSpecialBehavior()
    {
        System.out.println("Performing special behavoior");
    }
}

public class All 
{
    public static void main(String[] args) 
    {
        Animal decoratedCow = new SpecialBehaviorDecorated(new Cow());
        decoratedCow.eat();
    }
}
