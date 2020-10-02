package com.jagex;

import com.jagex.clans.ClanChannel;
import com.jagex.clans.settings.ChangeClanSetting;

public class Node_Sub11_Sub1 extends ClanSetting {

    String aString10001;
    byte aByte9999;
    byte aByte10000;

    public Node_Sub11_Sub1() {
    }

    static int method15433(NPCEntity npc_0) {
        NPCDefinitions npcdefinitions_2 = npc_0.definitions;
        if (npcdefinitions_2.transformTo != null) {
            npcdefinitions_2 = npcdefinitions_2.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
            if (npcdefinitions_2 == null) {
                return -1;
            }
        }

        int i_3 = npcdefinitions_2.rotate90RightAnimation;
        BASDefinitions renderanimdefs_4 = npc_0.getRenderAnimDefs();
        int i_5 = npc_0.aAnimation_Sub3_10337.method7597();
        if (i_5 != -1 && !npc_0.aAnimation_Sub3_10337.aBool7891) {
            if (i_5 != renderanimdefs_4.runningAnimation && i_5 != renderanimdefs_4.runDir3 && i_5 != renderanimdefs_4.runDir1 && i_5 != renderanimdefs_4.runDir2) {
                if (i_5 == renderanimdefs_4.teleportingAnimation || i_5 == renderanimdefs_4.teleDir3 || i_5 == renderanimdefs_4.teleDir1 || i_5 == renderanimdefs_4.teleDir2) {
                    i_3 = npcdefinitions_2.rotate180Animation;
                }
            } else {
                i_3 = npcdefinitions_2.rotate90LeftAnimation;
            }
        } else {
            i_3 = npcdefinitions_2.walkingAnimation;
        }

        return i_3;
    }

    public static ParticleProducerDefinition getParticleProducerDefs(int i_0) {
        ParticleProducerDefinition defs = (ParticleProducerDefinition) ParticleProducerDefinition.aClass229_533.get(i_0);
        if (defs == null) {
            byte[] bytes_3 = CoordGrid.PARTICLE_INDEX.getFile(0, i_0);
            defs = new ParticleProducerDefinition();
            if (bytes_3 != null) {
                defs.decode(new ByteBuf(bytes_3));
            }

            defs.init();
            ParticleProducerDefinition.aClass229_533.put(defs, i_0);
        }
        return defs;
    }

    @Override
    public void apply(ClanChannel channel) {
        channel.clanName = aString10001;
        if (aString10001 != null) {
            channel.guestsTalk = aByte9999;
            channel.minRankToKick = aByte10000;
        }

    }

    @Override
    public void readSettings(ByteBuf buffer) {
        aString10001 = buffer.readNullString();
        if (aString10001 != null) {
            buffer.readUnsignedByte();
            aByte9999 = buffer.readByte();
            aByte10000 = buffer.readByte();
        }

    }

}
