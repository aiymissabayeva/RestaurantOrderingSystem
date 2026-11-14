package factory;
import model.Meal;

public class PizzaFactory extends MealFactory{
    @Override
    public Meal createMeal(){
        return new Pizza();
    }
}