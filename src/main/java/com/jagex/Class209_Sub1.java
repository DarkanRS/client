package com.jagex;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

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

    Class209_Sub1(Component component_1) {
        method12906(component_1);
        aBool7946 = true;
    }

    public static void method12916() {
        for (int i_1 = 0; i_1 < 100; i_1++) {
            ChatLine.CHAT_LINES[i_1] = null;
        }
        ChatLine.NUM_CHAT_LINES = 0;
    }

    @Override
    public synchronized void mouseReleased(MouseEvent mouseevent_1) {
        int i_2 = method12908(mouseevent_1);
        if ((anInt7944 & i_2) == 0) {
            i_2 = anInt7944;
        }
        if ((i_2 & 0x1) != 0) {
            method12909(3, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        }
        if ((i_2 & 0x4) != 0) {
            method12909(5, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        }
        if ((i_2 & 0x2) != 0) {
            method12909(4, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        }
        anInt7944 &= ~i_2;
        if (mouseevent_1.isPopupTrigger()) {
            mouseevent_1.consume();
        }
    }

    @Override
    public synchronized void mouseClicked(MouseEvent mouseevent_1) {
        if (mouseevent_1.isPopupTrigger()) {
            mouseevent_1.consume();
        }
    }

    @Override
    public synchronized void method3589() {
        anInt7938 = anInt7942;
        anInt7939 = anInt7943;
        anInt7940 = anInt7944;
        NodeCollection nodecollection_2 = aClass482_7941;
        aClass482_7941 = aClass482_7945;
        aClass482_7945 = nodecollection_2;
        aClass482_7945.removeAll();
    }

    void method12905(int i_1, int i_2) {
        anInt7942 = i_1;
        anInt7943 = i_2;
        if (aBool7946) {
            method12909(-1, i_1, i_2, 0);
        }
    }

    @Override
    public boolean rightButtonDown() {
        return (anInt7940 & 0x2) != 0;
    }

    @Override
    public int method3573() {
        return 954893953 * anInt7939 * 220182913;
    }

    @Override
    public boolean leftButtonDown() {
        return (anInt7940 & 0x1) != 0;
    }

    @Override
    public synchronized void mouseMoved(MouseEvent mouseevent_1) {
        method12905(mouseevent_1.getX(), mouseevent_1.getY());
    }

    @Override
    public boolean middleButtonDown() {
        return (anInt7940 & 0x4) != 0;
    }

    void method12906(Component component_1) {
        method12907();
        aComponent7935 = component_1;
        aComponent7935.addMouseListener(this);
        aComponent7935.addMouseMotionListener(this);
        aComponent7935.addMouseWheelListener(this);
    }

    @Override
    public int getMouseX() {
        return anInt7938;
    }

    @Override
    public void method3584() {
        method12907();
    }

    void method12907() {
        if (aComponent7935 != null) {
            aComponent7935.removeMouseWheelListener(this);
            aComponent7935.removeMouseMotionListener(this);
            aComponent7935.removeMouseListener(this);
            aComponent7935 = null;
            anInt7940 = 0;
            anInt7939 = 0;
            anInt7938 = 0;
            anInt7944 = 0;
            anInt7943 = 0;
            anInt7942 = 0;
            aClass482_7941 = null;
            aClass482_7945 = null;
        }
    }

    @Override
    public synchronized void mouseEntered(MouseEvent mouseevent_1) {
        method12905(mouseevent_1.getX(), mouseevent_1.getY());
    }

    @Override
    public MouseRecord nextSubmission() {
        return (MouseRecord) aClass482_7941.popHead();
    }

    int method12908(MouseEvent mouseevent_1) {
        return mouseevent_1.getButton() == 1 ? (mouseevent_1.isMetaDown() ? 4 : 1) : (mouseevent_1.getButton() == 2 ? 2 : (mouseevent_1.getButton() == 3 ? 4 : 0));
    }

    @Override
    public synchronized void mousePressed(MouseEvent mouseevent_1) {
        int i_2 = method12908(mouseevent_1);
        if (i_2 == 1) {
            method12909(0, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        } else if (i_2 == 4) {
            method12909(2, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        } else if (i_2 == 2) {
            method12909(1, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount());
        }
        anInt7944 |= i_2;
        if (mouseevent_1.isPopupTrigger()) {
            mouseevent_1.consume();
        }
    }

    void method12909(int i_1, int i_2, int i_3, int i_4) {
        MouseRecord_Sub2 class282_sub53_sub2_6 = GraphNode_Sub1_Sub3_Sub1.method16080(i_1, i_2, i_3, Utils.time(), i_4);
        aClass482_7945.append(class282_sub53_sub2_6);
    }

    @Override
    public synchronized void method3578() {
        anInt7938 = anInt7942 * 1679338381 * 1630671813 * 1002227073;
        anInt7939 = anInt7943 * 1672782407 * 1370759671 * 954893953;
        anInt7940 = anInt7944 * 919895911 * -714190199 * -1237626913;
        NodeCollection nodecollection_1 = aClass482_7941;
        aClass482_7941 = aClass482_7945;
        aClass482_7945 = nodecollection_1;
        aClass482_7945.removeAll();
    }

    @Override
    public MouseRecord method3590() {
        return (MouseRecord) aClass482_7941.popHead();
    }

    @Override
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
        method12909(6, i_2, i_3, i_4);
        mousewheelevent_1.consume();
    }

    @Override
    public synchronized void method3581() {
        anInt7938 = anInt7942 * 1679338381 * 1630671813 * 1002227073;
        anInt7939 = anInt7943 * 1672782407 * 1370759671 * 954893953;
        anInt7940 = anInt7944 * 919895911 * -714190199 * -1237626913;
        NodeCollection nodecollection_1 = aClass482_7941;
        aClass482_7941 = aClass482_7945;
        aClass482_7945 = nodecollection_1;
        aClass482_7945.removeAll();
    }

    @Override
    public MouseRecord method3591() {
        return (MouseRecord) aClass482_7941.popHead();
    }

    @Override
    public boolean method3583() {
        return (anInt7940 * -641127393 * -1237626913 & 0x1) != 0;
    }

    @Override
    public boolean method3580() {
        return (anInt7940 * -641127393 * -1237626913 & 0x2) != 0;
    }

    @Override
    public boolean method3593() {
        return (anInt7940 * -641127393 * -1237626913 & 0x2) != 0;
    }

    @Override
    public boolean method3582() {
        return (anInt7940 * -641127393 * -1237626913 & 0x4) != 0;
    }

    @Override
    public boolean method3579() {
        return (anInt7940 * -641127393 * -1237626913 & 0x4) != 0;
    }

    @Override
    public int method3585() {
        return 1002227073 * anInt7938 * -901678463;
    }

    @Override
    public int getMouseY() {
        return anInt7939;
    }

    @Override
    public int method3564() {
        return 954893953 * anInt7939 * 220182913;
    }

    @Override
    public MouseRecord method3592() {
        return (MouseRecord) aClass482_7941.popHead();
    }

    @Override
    public synchronized void mouseExited(MouseEvent mouseevent_1) {
        method12905(mouseevent_1.getX(), mouseevent_1.getY());
    }

    @Override
    public synchronized void mouseDragged(MouseEvent mouseevent_1) {
        method12905(mouseevent_1.getX(), mouseevent_1.getY());
    }

    @Override
    public MouseRecord method3588() {
        return (MouseRecord) aClass482_7941.popHead();
    }

    @Override
    public void method3594() {
        method12907();
    }

    @Override
    public void method3595() {
        method12907();
    }
}
