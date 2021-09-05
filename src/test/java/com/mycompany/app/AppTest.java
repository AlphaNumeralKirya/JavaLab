package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AppTest 
{
   @Test
   public void checkDecrease(){
      assertTrue(App.decreasingArray(new int[] {5, 2, 8, 0, 2}));
   }

   @Test
   public void checkDecreaseFalse(){
      assertFalse(App.decreasingArray(new int[] {5, 2, 8, 0, 2}));
   }
}
