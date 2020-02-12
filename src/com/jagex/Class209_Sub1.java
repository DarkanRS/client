package com.jagex;

import java.awt.*;
import java.awt.event.*;

public class Class209_Sub1 extends Class209 implements MouseListener, MouseMotionListener, MouseWheelListener {

    int anInt7944;

    NodeCollection aClass482_7941 = new NodeCollection();

    NodeCollection aClass482_7945 = new NodeCollection();

    boolean aBool7946;

    int anInt7938;

    int anInt7939;

    int anInt7940;

    int anInt7942;

    int anInt7943;

    Component aComponent7935;

    public synchronized void mouseReleased(MouseEvent mouseevent_1) {
        int i_2 = this.method12908(mouseevent_1, 1117707265);
        if ((this.anInt7944 & i_2) == 0) {
            i_2 = this.anInt7944;
        }
        if ((i_2 & 0x1) != 0) {
            this.method12909(3, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        }
        if ((i_2 & 0x4) != 0) {
            this.method12909(5, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        }
        if ((i_2 & 0x2) != 0) {
            this.method12909(4, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        }
        this.anInt7944 &= ~i_2;
        if (mouseevent_1.isPopupTrigger()) {
            mouseevent_1.consume();
        }
    }

    public synchronized void mouseClicked(MouseEvent mouseevent_1) {
        if (mouseevent_1.isPopupTrigger()) {
            mouseevent_1.consume();
        }
    }

    Class209_Sub1(Component component_1) {
        this.method12906(component_1);
        this.aBool7946 = true;
    }

    public synchronized void method3589() {
        this.anInt7938 = this.anInt7942;
        this.anInt7939 = this.anInt7943;
        this.anInt7940 = this.anInt7944;
        NodeCollection nodecollection_2 = this.aClass482_7941;
        this.aClass482_7941 = this.aClass482_7945;
        this.aClass482_7945 = nodecollection_2;
        this.aClass482_7945.removeAll();
    }

    void method12905(int i_1, int i_2, int i_3) {
        this.anInt7942 = i_1;
        this.anInt7943 = i_2;
        if (this.aBool7946) {
            this.method12909(-1, i_1, i_2, 0);
        }
    }

    public boolean rightButtonDown() {
        return (this.anInt7940 & 0x2) != 0;
    }

    public int method3573() {
        return 954893953 * this.anInt7939 * 220182913;
    }

    public boolean leftButtonDown() {
        return (this.anInt7940 & 0x1) != 0;
    }

    public synchronized void mouseMoved(MouseEvent mouseevent_1) {
        this.method12905(mouseevent_1.getX(), mouseevent_1.getY(), -2109256124);
    }

    public boolean middleButtonDown() {
        return (this.anInt7940 & 0x4) != 0;
    }

    void method12906(Component component_1) {
        this.method12907((short) 12335);
        this.aComponent7935 = component_1;
        this.aComponent7935.addMouseListener(this);
        this.aComponent7935.addMouseMotionListener(this);
        this.aComponent7935.addMouseWheelListener(this);
    }

    public int getMouseX() {
        return this.anInt7938;
    }

    public void method3584() {
        this.method12907((short) 14669);
    }

    void method12907(short s_1) {
        if (this.aComponent7935 != null) {
            this.aComponent7935.removeMouseWheelListener(this);
            this.aComponent7935.removeMouseMotionListener(this);
            this.aComponent7935.removeMouseListener(this);
            this.aComponent7935 = null;
            this.anInt7940 = 0;
            this.anInt7939 = 0;
            this.anInt7938 = 0;
            this.anInt7944 = 0;
            this.anInt7943 = 0;
            this.anInt7942 = 0;
            this.aClass482_7941 = null;
            this.aClass482_7945 = null;
        }
    }

    public synchronized void mouseEntered(MouseEvent mouseevent_1) {
        this.method12905(mouseevent_1.getX(), mouseevent_1.getY(), -119743031);
    }

    public MouseRecord nextSubmission(byte b_1) {
        return (MouseRecord) this.aClass482_7941.popHead();
    }

    int method12908(MouseEvent mouseevent_1, int i_2) {
        return mouseevent_1.getButton() == 1 ? (mouseevent_1.isMetaDown() ? 4 : 1) : (mouseevent_1.getButton() == 2 ? 2 : (mouseevent_1.getButton() == 3 ? 4 : 0));
    }

    public synchronized void mousePressed(MouseEvent mouseevent_1) {
        int i_2 = this.method12908(mouseevent_1, -1413980906);
        if (i_2 == 1) {
            this.method12909(0, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        } else if (i_2 == 4) {
            this.method12909(2, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        } else if (i_2 == 2) {
            this.method12909(1, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        }
        this.anInt7944 |= i_2;
        if (mouseevent_1.isPopupTrigger()) {
            mouseevent_1.consume();
        }
    }

    void method12909(int i_1, int i_2, int i_3, int i_4) {
        MouseRecord_Sub2 class282_sub53_sub2_6 = Transform_Sub1_Sub3_Sub1.method16080(i_1, i_2, i_3, Utils.time(), i_4);
        this.aClass482_7945.append(class282_sub53_sub2_6);
    }

    public synchronized void method3578() {
        this.anInt7938 = this.anInt7942 * 1679338381 * 1630671813 * 1002227073;
        this.anInt7939 = this.anInt7943 * 1672782407 * 1370759671 * 954893953;
        this.anInt7940 = this.anInt7944 * 919895911 * -714190199 * -1237626913;
        NodeCollection nodecollection_1 = this.aClass482_7941;
        this.aClass482_7941 = this.aClass482_7945;
        this.aClass482_7945 = nodecollection_1;
        this.aClass482_7945.removeAll();
    }

    public MouseRecord method3590() {
        return (MouseRecord) this.aClass482_7941.popHead();
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent_1) {
        int i_2 = mousewheelevent_1.getX();
        int i_3 = mousewheelevent_1.getY();
        int i_4 = mousewheelevent_1.getWheelRotation();
        if (mousewheelevent_1.isControlDown()) {
            if (mousewheelevent_1.getWheelRotation() == -1 && HitbarDefinitions.CAMERA_ZOOM >= -50) {
                HitbarDefinitions.CAMERA_ZOOM -= 30;
            }
            if (mousewheelevent_1.getWheelRotation() == 1 && HitbarDefinitions.CAMERA_ZOOM < 1700) {
                HitbarDefinitions.CAMERA_ZOOM += 30;
            }
        }
        this.method12909(6, i_2, i_3, i_4);
        mousewheelevent_1.consume();
    }

    public synchronized void method3581() {
        this.anInt7938 = this.anInt7942 * 1679338381 * 1630671813 * 1002227073;
        this.anInt7939 = this.anInt7943 * 1672782407 * 1370759671 * 954893953;
        this.anInt7940 = this.anInt7944 * 919895911 * -714190199 * -1237626913;
        NodeCollection nodecollection_1 = this.aClass482_7941;
        this.aClass482_7941 = this.aClass482_7945;
        this.aClass482_7945 = nodecollection_1;
        this.aClass482_7945.removeAll();
    }

    public MouseRecord method3591() {
        return (MouseRecord) this.aClass482_7941.popHead();
    }

    public boolean method3583() {
        return (this.anInt7940 * -641127393 * -1237626913 & 0x1) != 0;
    }

    public boolean method3580() {
        return (this.anInt7940 * -641127393 * -1237626913 & 0x2) != 0;
    }

    public boolean method3593() {
        return (this.anInt7940 * -641127393 * -1237626913 & 0x2) != 0;
    }

    public boolean method3582() {
        return (this.anInt7940 * -641127393 * -1237626913 & 0x4) != 0;
    }

    public boolean method3579() {
        return (this.anInt7940 * -641127393 * -1237626913 & 0x4) != 0;
    }

    public int method3585() {
        return 1002227073 * this.anInt7938 * -901678463;
    }

    public int getMouseY() {
        return this.anInt7939;
    }

    public int method3564() {
        return 954893953 * this.anInt7939 * 220182913;
    }

    public MouseRecord method3592() {
        return (MouseRecord) this.aClass482_7941.popHead();
    }

    public synchronized void mouseExited(MouseEvent mouseevent_1) {
        this.method12905(mouseevent_1.getX(), mouseevent_1.getY(), -1606107629);
    }

    public synchronized void mouseDragged(MouseEvent mouseevent_1) {
        this.method12905(mouseevent_1.getX(), mouseevent_1.getY(), -641824056);
    }

    public MouseRecord method3588() {
        return (MouseRecord) this.aClass482_7941.popHead();
    }

    public void method3594() {
        this.method12907((short) 11484);
    }

    public void method3595() {
        this.method12907((short) 31873);
    }

    public static void method12916() {
        for (int i_1 = 0; i_1 < 100; i_1++) {
            ChatLine.CHAT_LINES[i_1] = null;
        }
        ChatLine.NUM_CHAT_LINES = 0;
    }
}
