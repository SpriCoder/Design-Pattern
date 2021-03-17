package pattern.builder.kfc;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public abstract class MealBuilder {
    protected Meal meal = new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal(){
        return meal;
    }
}
