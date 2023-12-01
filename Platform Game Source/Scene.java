/***********************************************************************
 * Module:  Scene.java
 * Author:  phuoc
 * Purpose: Defines the Class Scene
 ***********************************************************************/

import java.util.*;

/** @pdOid 4611c62b-8c04-441e-be2d-11a749f69ea0 */
public class Scene {
   /** @pdOid ebb4fd21-3cf3-4c13-8230-a91d9ac95968 */
   private int sceneID;
   /** @pdOid 406f59fa-e47a-4c45-b376-74140b86208b */
   private int sceneLevel;
   /** @pdOid 00b88726-12fd-4f22-906d-46e42650e605 */
   private String sceneName;
   /** @pdOid 13c0854a-64d1-45a1-8846-4bbdb86f9395 */
   private String sceneDescription;
   
   /** @pdRoleInfo migr=no name=Map assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection map;
   
   /** @param sceneID
    * @pdOid e76e8695-f9bb-40a9-a41a-c1a9291ed921 */
   public void addScene(int sceneID) {
      // TODO: implement
   }
   
   /** @param sceneID
    * @pdOid 64a455ef-02e3-40cd-b111-ff164fe66434 */
   public void loadScene(int sceneID) {
      // TODO: implement
   }
   
   /** @pdOid 1916cd32-24d9-4a34-9268-78e46e9a8321 */
   public void getScene() {
      // TODO: implement
   }
   
   /** @param sceneID
    * @pdOid 4b82fbd7-2f41-45fd-9734-963a8f98435d */
   public void setScene(int sceneID) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection getMap() {
      if (map == null)
         map = new java.util.HashSet();
      return map;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMap() {
      if (map == null)
         map = new java.util.HashSet();
      return map.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMap */
   public void setMap(java.util.Collection newMap) {
      removeAllMap();
      for (java.util.Iterator iter = newMap.iterator(); iter.hasNext();)
         addMap((Map)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMap */
   public void addMap(Map newMap) {
      if (newMap == null)
         return;
      if (this.map == null)
         this.map = new java.util.HashSet();
      if (!this.map.contains(newMap))
         this.map.add(newMap);
   }
   
   /** @pdGenerated default remove
     * @param oldMap */
   public void removeMap(Map oldMap) {
      if (oldMap == null)
         return;
      if (this.map != null)
         if (this.map.contains(oldMap))
            this.map.remove(oldMap);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMap() {
      if (map != null)
         map.clear();
   }

}