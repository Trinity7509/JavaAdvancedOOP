package hell.enteties.heroes;

import hell.entities.miscellaneous.ItemCollection;
import hell.interfaces.Hero;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

public abstract class BaseHero implements Hero {

    private String name;
    private int strength;
    private int agility;
    private int intelligence;
    private int hit_Points;
    private int damage;
    private Inventory inventory;

    protected BaseHero(String name, int strength,
                    int agility, int intelligence,
                    int hit_Points, int damage, Inventory inventory) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.hit_Points = hit_Points;
        this.damage = damage;
        this.inventory=inventory;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getStrength() {
        return this.strength;
    }

    @Override
    public long getAgility() {
        return this.agility;
    }

    @Override
    public long getIntelligence() {
        return this.intelligence;
    }

    @Override
    public long getHitPoints() {
        return this.hit_Points;
    }

    @Override
    public long getDamage() {
        return this.damage;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Collection<Item> getItems()  {
        Collection<Item> items=null;
        Field[] inventoryFields=this.inventory.getClass().getDeclaredFields();

        for (Field inventoryField : inventoryFields) {
            if(inventoryField.isAnnotationPresent(ItemCollection.class)) {
                inventoryField.setAccessible(true);
                Map<String, Item> itemMap = null;
                try {
                    itemMap = (Map<String, Item>) inventoryField.get(this.inventory);


                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                items = itemMap.values();
            }
                }
                return items;
    }

    @Override
    public void addItem(Item item) {
        this.inventory.addCommonItem(item);

    }

    @Override
    public void addRecipe(Recipe recipe) {
        this.inventory.addRecipeItem(recipe);

    }
}
