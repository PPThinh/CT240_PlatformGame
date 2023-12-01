/***********************************************************************
 * Module:  Player.java
 * Author:  phuoc
 * Purpose: Defines the Class Player
 ***********************************************************************/

import java.util.*;

/** @pdOid d68fc95d-305f-4cd1-bc90-70613a9c42c9 */
public class Player extends Character {
   /** @pdOid 22e5e07a-8897-4222-98b5-1eb1d356197c */
   private Position playerPosition;
   /** @pdOid 7d102ddd-1bee-4b4f-8c8d-f1e4dfc5c9ef */
   private float playerVelocity;
   /** @pdOid fde5b286-b4fd-477d-a8ad-9298ad1f2fa8 */
   private float playerDamage;
   /** @pdOid 3c1407ea-f4cf-4475-aebb-63ef9c6d1da3 */
   private float playerSpeed;
   /** @pdOid 7483ce56-24af-41f4-9a4f-81e9c6926c71 */
   private int playerHealth;
   /** @pdOid cd79a720-1f37-48b2-ab5e-54ba91145630 */
   private int playerDiamond;
   /** @pdOid ba9e3671-3afd-4b10-9260-ebb4c8b1bcfe */
   private Rigidbody playerBody;
   
   /** @pdRoleInfo migr=no name=Trigger assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection trigger;
   
   /** @pdOid ba230f11-12a8-4976-9e93-c5a1c93a7e98 */
   public void setCurrentHealth() {
      // TODO: implement
   }
   
   /** @pdOid 3490cc96-26a1-41c1-a55d-e2807bcc4672 */
   public void setAnimation() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getTrigger() {
      if (trigger == null)
         trigger = new java.util.HashSet();
      return trigger;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTrigger() {
      if (trigger == null)
         trigger = new java.util.HashSet();
      return trigger.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTrigger */
   public void setTrigger(java.util.Collection newTrigger) {
      removeAllTrigger();
      for (java.util.Iterator iter = newTrigger.iterator(); iter.hasNext();)
         addTrigger((Trigger)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTrigger */
   public void addTrigger(Trigger newTrigger) {
      if (newTrigger == null)
         return;
      if (this.trigger == null)
         this.trigger = new java.util.HashSet();
      if (!this.trigger.contains(newTrigger))
         this.trigger.add(newTrigger);
   }
   
   /** @pdGenerated default remove
     * @param oldTrigger */
   public void removeTrigger(Trigger oldTrigger) {
      if (oldTrigger == null)
         return;
      if (this.trigger != null)
         if (this.trigger.contains(oldTrigger))
            this.trigger.remove(oldTrigger);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTrigger() {
      if (trigger != null)
         trigger.clear();
   }

}