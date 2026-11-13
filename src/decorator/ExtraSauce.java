package decorator;
import model.Meal;

public class ExtraSauce extends MealDecorator{
    public ExtraSauce(Meal meal){
        super(meal);
    }

    @Override
    public String getName(){
        return meal.getName() + " + Sauce";
    }
    @Override
    public double getPrice(){
        return meal.getPrice() + 200;
    }
}