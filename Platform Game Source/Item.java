/***********************************************************************
 * Module:  Item.java
 * Author:  phuoc
 * Purpose: Defines the Class Item
 ***********************************************************************/

import java.util.*;

/** @pdOid 0509ba7e-bad8-45ab-8097-093e5249543e */
public class Item {
   /** @pdOid 4affd4cc-5e23-4eaa-b421-00cdd45ef36d */
   private int itemID;
   /** @pdOid eb3eeb79-0f24-49dc-a2dd-d485506fe1bb */
   private String itemType;
   /** @pdOid 6ca135cb-66f8-413c-8d2e-cb94a12fc643 */
   private String itemName;
   /** @pdOid d7855443-53a3-41aa-ae7e-6ea4bb9a54e4 */
   private String itemInformation;
   
   /** @pdRoleInfo migr=no name=Trigger assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection trigger;
   
   /** @pdOid 10c16c75-0b47-48b0-aed7-9408d6f92b2d */
   public void addItem() {
      // TODO: implement
   }
   
   /** @pdOid fba9e8ee-9aa6-4f0e-b953-5300f9056bd4 */
   public void getItem() {
      // TODO: implement
   }
   
   /** @pdOid aadf9028-5a38-4c80-8c17-df2fa5f09f36 */
   public void setItem() {
      // TODO: implement
   }
   
   /** @pdOid 7c9a07e1-08b5-4ebe-9ff0-8c9a2ad12936 */
   public void removeItem() {
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