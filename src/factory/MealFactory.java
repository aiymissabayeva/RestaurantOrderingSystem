package factory;
import model.Meal;

public class MealFactory {
    public Meal createMeal(String type){
        if (type.equalsIgnoreCase("pizza")) {
            return new Pizza();
        }
        if (type.equalsIgnoreCase("burger")){
            return new Burger();
        }
        throw new IllegalArgumentException("Unavailable meal: " + type);
    }
}