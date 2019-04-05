public class Class29 {

    Class30 aClass30_354;

    Index aClass317_352;

    Index aClass317_353;

    public Interface2 method781(Interface3 interface3_1) {
        if (interface3_1 == null) {
            return null;
        } else {
            Class60 class60_3 = interface3_1.method24();
            return (Interface2) (class60_3 == Class60.aClass60_609 ? new Class46((Class366) interface3_1) : (class60_3 == Class60.aClass60_605 ? new Class28(this.method782(), (Class365) interface3_1) : (class60_3 == Class60.aClass60_606 ? new Class42(this.aClass317_352, (Class357) interface3_1) : (class60_3 == Class60.aClass60_607 ? new Class42_Sub1(this.aClass317_352, (Class357_Sub1) interface3_1) : (class60_3 == Class60.aClass60_602 ? new Class52_Sub3(this.aClass317_352, this.aClass317_353, (Class350_Sub2) interface3_1) : (class60_3 == Class60.aClass60_603 ? new Class52_Sub1(this.aClass317_352, this.aClass317_353, (Class350_Sub1) interface3_1) : (class60_3 == Class60.aClass60_608 ? new Class52_Sub2(this.aClass317_352, this.aClass317_353, (Class350_Sub3) interface3_1) : (class60_3 == Class60.aClass60_604 ? new Class51(this.aClass317_352, this.aClass317_353, (Class62) interface3_1) : (class60_3 == Class60.aClass60_601 ? new Class43(this.aClass317_352, (Class351) interface3_1) : (class60_3 == Class60.aClass60_610 ? new Class52_Sub2_Sub1(this.aClass317_352, this.aClass317_353, (Class350_Sub3_Sub1) interface3_1) : null))))))))));
        }
    }

    Class30 method782() {
        if (this.aClass30_354 == null) {
            this.aClass30_354 = new Class30();
        }
        return this.aClass30_354;
    }

    public Class29(Index index_1, Index index_2) {
        this.aClass317_352 = index_1;
        this.aClass317_353 = index_2;
    }

    static void deleteItemContainer(int key, boolean negativeKey) {
        ItemContainer container = CS2Runner.getItemContainer(key, negativeKey);
        if (container != null) {
            container.remove();
        }
    }
}
