package rpg_tests;

import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTests {



    @Test
    public void weaponAttacksLosesDurability()
   {

       //Arrange

       Axe axe =new Axe(10,10);
       Dummy dummy=new Dummy(10,10);
       //Act

       axe.attack(dummy);
       //assert
       Assert.assertEquals(9,axe.getDurabilityPoints());

   }

   @Test(expected=IllegalStateException.class)
   public void brokenWeaponCanAttack()
   {
       //Arrange
       Axe axe=new Axe(10,1);
       Dummy dummy=new Dummy(10,10);
       //Act

       axe.attack(dummy);
       axe.attack(dummy);
       //Assert
   }
}
