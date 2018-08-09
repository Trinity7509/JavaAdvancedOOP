package hell.entities.miscellaneous;

import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class HeroInventoryTest {

    private static final int VALUE=Integer.MAX_VALUE;
    private static final String STRENGTH_MESSAGE="Strength is not correct ";
    private static final String AGILITY_MESSAGE="Agility is not correct ";
    private static final String INTELLIGENCE_MESSAGE="Intelligence is not correct ";
    private static final String HIT_POINTS_MESSAGE="Hit points are not correct ";
    private static final String DAMAGE_MESSAGE="Damage is not correct ";

    private Inventory inventory;

    @Before
    public void setUp() throws Exception {
        this.inventory=new HeroInventory();
    }

    private Item createCommonItemMock()
    {
        Item commonItem=Mockito.mock(Item.class);


        Mockito.when(commonItem.getStrengthBonus()).thenReturn(VALUE);
        Mockito.when(commonItem.getAgilityBonus()).thenReturn(VALUE);
        Mockito.when(commonItem.getIntelligenceBonus()).thenReturn(VALUE);
        Mockito.when(commonItem.getHitPointsBonus()).thenReturn(VALUE);
        Mockito.when(commonItem.getDamageBonus()).thenReturn(VALUE);

        return commonItem;
    }
     private void seedCommonItems()
    {
        Item commonItemMock1=this.createCommonItemMock();
        Mockito.when(commonItemMock1.getName()).thenReturn("commonItemMock1");
        Item commonItemMock2=this.createCommonItemMock();
        Mockito.when(commonItemMock2.getName()).thenReturn("commonItemMock2");
        Item commonItemMock3=this.createCommonItemMock();
        Mockito.when(commonItemMock3.getName()).thenReturn("commonItemMock3");
        this.inventory.addCommonItem(commonItemMock1);
        this.inventory.addCommonItem(commonItemMock2);
        this.inventory.addCommonItem(commonItemMock3);

    }

    private void seedRecipeItems()
    {
        Recipe recipeMock=Mockito.mock(Recipe.class);
        List<String> requiredItems=new ArrayList<>();
       requiredItems.add("commonItemMock1");
       requiredItems.add("commonItemMock2");
       requiredItems.add("commonItemMock3");
       Mockito.when(recipeMock.getRequiredItems()).thenReturn(requiredItems);
       this.inventory.addRecipeItem(recipeMock);


    }

    @Test
    public void getTotalStrengthBonus() {
        this.seedCommonItems();

        long actualTotalStrBonus=this.inventory.getTotalStrengthBonus();
        long expectedTotalBonus=3L*VALUE;

        Assert.assertEquals(STRENGTH_MESSAGE,expectedTotalBonus,actualTotalStrBonus);
    }

    @Test
    public void getTotalAgilityBonus() {
        this.seedCommonItems();

        long actualTotalAglBonus=this.inventory.getTotalAgilityBonus();
        long expectedAglBonus=3L*VALUE;

        Assert.assertEquals(AGILITY_MESSAGE,expectedAglBonus,actualTotalAglBonus);
    }

    @Test
    public void getTotalIntelligenceBonus() {
        this.seedCommonItems();

        long actualIntelligenceBonus=this.inventory.getTotalIntelligenceBonus();
        long expectedIntelligenceBonus=3L*VALUE;

        Assert.assertEquals(INTELLIGENCE_MESSAGE,expectedIntelligenceBonus,actualIntelligenceBonus);
    }

    @Test
    public void getTotalHitPointsBonus() {
        this.seedCommonItems();

        long actualHitPoints=this.inventory.getTotalHitPointsBonus();
        long expectedHitPoints=3L*VALUE;

        Assert.assertEquals(HIT_POINTS_MESSAGE,expectedHitPoints,actualHitPoints);
    }

    @Test
    public void getTotalDamageBonus() {

        this.seedCommonItems();

        long actualDamagePoints=this.inventory.getTotalDamageBonus();
        long expectedDamagePoints=3L*VALUE;

        Assert.assertEquals(DAMAGE_MESSAGE,expectedDamagePoints,actualDamagePoints);
    }

    @Test
    public void addCommonItem()  {
        this.seedCommonItems();
        this.seedRecipeItems();
        Item commonItemMock4=this.createCommonItemMock();
        Mockito.when(commonItemMock4.getName()).thenReturn("commonItemMock4");

        this.inventory.addCommonItem(commonItemMock4);
        int actualCountCommonItems=0;
try {
    Field commonItemField = this.inventory.getClass()
            .getDeclaredField("commonItems");
    commonItemField.setAccessible(true);
    Map<String,Item> commonItemMap = (Map<String,Item>)commonItemField.get(this.inventory);
    actualCountCommonItems=commonItemMap.size();
} catch (NoSuchFieldException | IllegalAccessException  e) {
    e.printStackTrace();
}
int expectedCountCommonItems=2;

Assert.assertEquals(expectedCountCommonItems,actualCountCommonItems);

    }

    @Test
    public void addRecipeItem() {

        Recipe recipeMock=Mockito.mock(Recipe.class);

        this.inventory.addRecipeItem(recipeMock);
        int actualCountRecipeItems=0;

        try{
            Field recipeMockField=this.inventory.getClass()
                    .getDeclaredField("recipeItems");
            recipeMockField.setAccessible(true);
            Map<String,Recipe> recipeMap=(Map<String,Recipe>)recipeMockField.get(this.inventory);
            actualCountRecipeItems=recipeMap.size();
        } catch (NoSuchFieldException|IllegalAccessException e) {
            e.printStackTrace();
        }

        int expectedCountRecipeItems=1;

        Assert.assertEquals(expectedCountRecipeItems,actualCountRecipeItems);

    }




}