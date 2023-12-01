/***********************************************************************
 * Module:  Map.java
 * Author:  phuoc
 * Purpose: Defines the Class Map
 ***********************************************************************/

import java.util.*;

/** @pdOid 1263e586-090c-4a4d-b8d8-85e1b14225e3 */
public class Map {
   /** @pdOid 6784393e-ca09-4244-a252-0767b3536e8a */
   private int mapID;
   /** @pdOid c73fcde1-48a3-43d9-a5eb-9c287103be8a */
   private String mapName;
   /** @pdOid 140b6be5-2301-483f-8405-14b3dae26ef5 */
   private String mapDescription;
   
   /** @pdRoleInfo migr=no name=NPC assc=Association_8 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public NPC nPC;
   
   /** @pdOid 485dc50a-0812-4036-8f4d-98ea7af22dc4 */
   public Position getStartPosition() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 2fb8f703-8e80-4c8b-9e36-324b9c3281c0 */
   public Position getEndPosition() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 54deb5f1-9016-46a6-93e4-a31d9525f2df */
   public Boolean enableMap() {
      // TODO: implement
      return null;
   }

}