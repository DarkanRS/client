package com.jagex;

public class EntityList {

    EntityNode aEntityNode_5468 = new EntityNode();
    EntityNode aEntityNode_5469;

    public EntityList() {
        this.aEntityNode_5468.aEntityNode_3339 = this.aEntityNode_5468;
        this.aEntityNode_5468.aEntityNode_3340 = this.aEntityNode_5468;
    }

    public void method7647(EntityNode class275_1, int i_2) {
        if (class275_1.aEntityNode_3340 != null) {
            class275_1.method4887();
        }
        class275_1.aEntityNode_3340 = this.aEntityNode_5468;
        class275_1.aEntityNode_3339 = this.aEntityNode_5468.aEntityNode_3339;
        class275_1.aEntityNode_3340.aEntityNode_3339 = class275_1;
        class275_1.aEntityNode_3339.aEntityNode_3340 = class275_1;
    }

    public EntityNode method7648(int i_1) {
        EntityNode class275_2 = this.aEntityNode_5468.aEntityNode_3339;
        if (class275_2 == this.aEntityNode_5468) {
            return null;
        } else {
            class275_2.method4887();
            return class275_2;
        }
    }

    public void offer(EntityNode class275_1, int i_2) {
        if (class275_1.aEntityNode_3340 != null) {
            class275_1.method4887();
        }
        class275_1.aEntityNode_3340 = this.aEntityNode_5468.aEntityNode_3340;
        class275_1.aEntityNode_3339 = this.aEntityNode_5468;
        class275_1.aEntityNode_3340.aEntityNode_3339 = class275_1;
        class275_1.aEntityNode_3339.aEntityNode_3340 = class275_1;
    }

    public EntityNode method7650(byte b_1) {
        EntityNode class275_2 = this.aEntityNode_5469;
        if (class275_2 == this.aEntityNode_5468) {
            this.aEntityNode_5469 = null;
            return null;
        } else {
            this.aEntityNode_5469 = class275_2.aEntityNode_3339;
            return class275_2;
        }
    }

    public void method7651() {
        while (true) {
            EntityNode class275_2 = this.aEntityNode_5468.aEntityNode_3339;
            if (class275_2 == this.aEntityNode_5468) {
                this.aEntityNode_5469 = null;
                return;
            }
            class275_2.method4887();
        }
    }

    public EntityNode method7659() {
        EntityNode class275_2 = this.aEntityNode_5468.aEntityNode_3339;
        if (class275_2 == this.aEntityNode_5468) {
            this.aEntityNode_5469 = null;
            return null;
        } else {
            this.aEntityNode_5469 = class275_2.aEntityNode_3339;
            return class275_2;
        }
    }

    public boolean method7666(int i_1) {
        return this.aEntityNode_5468.aEntityNode_3339 == this.aEntityNode_5468;
    }
}
