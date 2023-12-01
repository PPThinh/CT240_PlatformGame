/***********************************************************************
 * Module:  Asset.java
 * Author:  phuoc
 * Purpose: Defines the Class Asset
 ***********************************************************************/

import java.util.*;

/** @pdOid d9f28bad-742b-4235-a1bc-9219ec6d933f */
public class Asset {
   /** @pdOid 2b493938-84a2-4c5b-a536-bc033ce31a95 */
   private int assetID;
   /** @pdOid f7f67a6c-8a15-431e-b1dd-ead8715539f7 */
   private String assetName;
   /** @pdOid 8a2e2462-da68-4990-94c0-ac28d327c8b1 */
   private String assetPath;
   
   /** @pdRoleInfo migr=no name=GameObject assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection gameObject;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getGameObject() {
      if (gameObject == null)
         gameObject = new java.util.HashSet();
      return gameObject;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGameObject() {
      if (gameObject == null)
         gameObject = new java.util.HashSet();
      return gameObject.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGameObject */
   public void setGameObject(java.util.Collection newGameObject) {
      removeAllGameObject();
      for (java.util.Iterator iter = newGameObject.iterator(); iter.hasNext();)
         addGameObject((GameObject)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGameObject */
   public void addGameObject(GameObject newGameObject) {
      if (newGameObject == null)
         return;
      if (this.gameObject == null)
         this.gameObject = new java.util.HashSet();
      if (!this.gameObject.contains(newGameObject))
         this.gameObject.add(newGameObject);
   }
   
   /** @pdGenerated default remove
     * @param oldGameObject */
   public void removeGameObject(GameObject oldGameObject) {
      if (oldGameObject == null)
         return;
      if (this.gameObject != null)
         if (this.gameObject.contains(oldGameObject))
            this.gameObject.remove(oldGameObject);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGameObject() {
      if (gameObject != null)
         gameObject.clear();
   }

}