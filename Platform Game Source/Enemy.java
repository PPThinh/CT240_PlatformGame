/***********************************************************************
 * Module:  Enemy.java
 * Author:  phuoc
 * Purpose: Defines the Class Enemy
 ***********************************************************************/

import java.util.*;

/** @pdOid 61d3a9e9-75f3-47ec-9762-eaa13b6aebd1 */
public class Enemy extends Character {
   /** @pdOid b629890e-e402-4f7d-8728-0d56d86caa7d */
   private String enemyType;
   /** @pdOid f88ce34d-d5bf-4cb2-af0e-ef65acdd69f8 */
   private String enemyName;
   /** @pdOid 6c44a683-6e93-4eab-a45c-e1712c9deefa */
   private Position enemyPosition;
   /** @pdOid 37564359-bb4b-4f58-8528-a05f0e26e0eb */
   private Rigidbody enemyBody;
   /** @pdOid db68277b-5944-448b-a7f6-1bbac9e4ddfb */
   private float enemyDamage;
   /** @pdOid 1d0824f9-5b89-4f49-bf89-be9a49432191 */
   private float enemyJumpForce;
   /** @pdOid a460bfe0-b4ce-4b1c-a0ed-677f3333647a */
   private float enemySpeed;
   
   /** @pdRoleInfo migr=no name=Map assc=Association_9 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Map map;
   
   /** @pdOid 2b4f5221-bb22-49a9-8ea2-b6b82c988e1e */
   public Boolean detectPlayer() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 7db95d1a-b08c-481f-947a-4b2535bb7086 */
   public Collider patrolArea() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 85cf241e-7355-4584-bfff-8db8103a2e4b */
   public void setEnemyHealth() {
      // TODO: implement
   }

}