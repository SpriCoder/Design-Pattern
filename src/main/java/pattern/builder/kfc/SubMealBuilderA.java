package pattern.builder.kfc;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class SubMealBuilderA extends MealBuilder{
    @Override
    public void buildFood() {
        meal.setFood("Build Food A!");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Build Drink A!");
    }
}
