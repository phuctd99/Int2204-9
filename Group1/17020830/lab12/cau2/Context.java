/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author admin
 */
public class Context {
    
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public void doing(int[] arr){
      strategy.sort(arr);
   }
}
