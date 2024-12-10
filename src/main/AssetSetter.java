package main;

import entity.NPC_Dino;
import entity.NPC_Human;
import entity.NPC_OldMan;
import entity.NPC_Stalker;
import entity.monster.MON_GreenSlime;
import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new OBJ_Key(gp);
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new OBJ_Key(gp);
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new OBJ_Key(gp);
        gp.obj[2].worldX = 37 * gp.tileSize;
        gp.obj[2].worldY = 7 * gp.tileSize;

        gp.obj[3] = new OBJ_Door(gp);
        gp.obj[3].worldX = 10 * gp.tileSize;
        gp.obj[3].worldY = 11 * gp.tileSize;

        gp.obj[4] = new OBJ_Door(gp);
        gp.obj[4].worldX = 8 * gp.tileSize;
        gp.obj[4].worldY = 28 * gp.tileSize;

        gp.obj[5] = new OBJ_Door(gp);
        gp.obj[5].worldX = 12 * gp.tileSize;
        gp.obj[5].worldY = 22 * gp.tileSize;

        gp.obj[6] = new OBJ_Chest(gp);
        gp.obj[6].worldX = 10 * gp.tileSize;
        gp.obj[6].worldY = 7 * gp.tileSize;

        gp.obj[7] = new OBJ_Boots(gp);
        gp.obj[7].worldX = 23 * gp.tileSize;
        gp.obj[7].worldY = 10 * gp.tileSize;
    }

    public void setNPC(){
        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = 21 * gp.tileSize;
        gp.npc[0].worldY = 21 * gp.tileSize;

        gp.npc[1] = new NPC_Dino(gp);
        gp.npc[1].worldX = 23 * gp.tileSize;
        gp.npc[1].worldY = 23  * gp.tileSize;

        gp.npc[4] = new NPC_Stalker(gp);
        gp.npc[4].worldX = 25  * gp.tileSize;
        gp.npc[4].worldY = 25  * gp.tileSize;

        gp.npc[5] = new NPC_Human(gp);
        gp.npc[5].worldX = 22  * gp.tileSize;
        gp.npc[5].worldY = 22  * gp.tileSize;
    }

    public void setMonster(){
        gp.monster[0] = new MON_GreenSlime(gp);
        gp.monster[0].worldX = 24 * gp.tileSize;
        gp.monster[0].worldY = 21 * gp.tileSize;

        gp.monster[1] = new MON_GreenSlime(gp);
        gp.monster[1].worldX = 20 * gp.tileSize;
        gp.monster[1].worldY = 24 * gp.tileSize;

        gp.monster[2] = new MON_GreenSlime(gp);
        gp.monster[2].worldX = 20 * gp.tileSize;
        gp.monster[2].worldY = 24 * gp.tileSize;
    }
}
