package Irretors.Irretors.ComparingObjects.Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> nums;

    public Lake(Integer...nums) {
        this.nums = Arrays.asList(nums);
    }








    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        private int counter=0;



        @Override
        public boolean hasNext() {
            return this.counter<nums.size();
        }

        @Override
        public Integer next() {

            counter+=2;
            int detail=nums.get(counter-2);
            if(counter%2==0&&counter>=nums.size())
            {
                counter=1;
            }
            return detail;
        }
    }
}
