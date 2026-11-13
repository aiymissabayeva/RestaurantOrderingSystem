package decorator;
import model.Meal;

public class ExtraCheese extends MealDecorator{
    public ExtraCheese(Meal meal){
        super(meal);
    }

    @Override
    public String getName(){
        return meal.getName() + " + Cheese";
    }
    @Override
    public double getPrice(){
        return meal.getPrice() + 300;
    }
}