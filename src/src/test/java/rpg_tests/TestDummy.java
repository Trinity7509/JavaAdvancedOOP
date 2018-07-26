package rpg_tests;

import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class TestDummy {



    @Test
    public void dummyLosesHealthIfAttack()
    {

        //arrange
        Axe axe =new Axe(10,10);
        Dummy dummy=new Dummy(10,10);
        //act
        dummy.takeAttack(2);
        //assert
        Assert.assertEquals(8,dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void deadDummyThrowsExceptionIfAttacked()
    {
        Axe axe =new Axe(10,10);
        Dummy dummy=new Dummy(0,10);

        dummy.takeAttack(1);
    }

    @Test
    public void deadDummyCanGiveExperience()
    {
        Axe axe =new Axe(10,10);
        Dummy dummy=new Dummy(1,10);

        dummy.takeAttack(1);


        Assert.assertTrue(dummy.giveExperience()==10);
    }



    @Test(expected = IllegalStateException.class)
    public void aliveDummyCantGiveExperience()
    {

        Axe axe =new Axe(10,10);
        Dummy dummy=new Dummy(10,10);

        dummy.takeAttack(2);
        dummy.giveExperience();

    }
}
