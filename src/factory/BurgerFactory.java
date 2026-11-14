package factory;
import model.Meal;

public class BurgerFactory extends MealFactory{
    @Override
    public Meal createMeal(){
        return new Burger();
    }
}
