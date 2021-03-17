package pattern.builder.kfc;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class SubMealBuilderB extends MealBuilder{
    @Override
    public void buildFood() {
        meal.setFood("Build Food B!");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Build Drink B!");
    }
}
