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

	public synchronized void mouseReleased(MouseEvent mouseevent_1) {
		int i_2 = this.method12908(mouseevent_1, 1117707265);
		if ((this.anInt7944 & i_2) == 0) {
			i_2 = this.anInt7944;
		}

		if ((i_2 & 0x1) != 0) {
			this.method12909(3, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount(), -1931505233);
		}

		if ((i_2 & 0x4) != 0) {
			this.method12909(5, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount(), -1931505233);
		}

		if ((i_2 & 0x2) != 0) {
			this.method12909(4, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount(), -1931505233);
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

	Class209_Sub1(Component component_1, boolean bool_2) {
		this.method12906(component_1, 1883441347);
		this.aBool7946 = bool_2;
	}

	public synchronized void method3589(byte b_1) {
		this.anInt7938 = this.anInt7942;
		this.anInt7939 = this.anInt7943;
		this.anInt7940 = this.anInt7944;
		NodeCollection nodecollection_2 = this.aClass482_7941;
		this.aClass482_7941 = this.aClass482_7945;
		this.aClass482_7945 = nodecollection_2;
		this.aClass482_7945.method8118(-2108421155);
	}

	void method12905(int i_1, int i_2, int i_3) {
		this.anInt7942 = i_1;
		this.anInt7943 = i_2;
		if (this.aBool7946) {
			this.method12909(-1, i_1, i_2, 0, -1931505233);
		}

	}

	public boolean method3566(int i_1) {
		return (this.anInt7940 & 0x2) != 0;
	}

	public int method3573() {
		return 954893953 * this.anInt7939 * 220182913;
	}

	public boolean method3565(byte b_1) {
		return (this.anInt7940 & 0x1) != 0;
	}

	public synchronized void mouseMoved(MouseEvent mouseevent_1) {
		this.method12905(mouseevent_1.getX(), mouseevent_1.getY(), -2109256124);
	}

	public boolean method3567(byte b_1) {
		return (this.anInt7940 & 0x4) != 0;
	}

	void method12906(Component component_1, int i_2) {
		this.method12907((short) 12335);
		this.aComponent7935 = component_1;
		this.aComponent7935.addMouseListener(this);
		this.aComponent7935.addMouseMotionListener(this);
		this.aComponent7935.addMouseWheelListener(this);
	}

	public int method3569(int i_1) {
		return this.anInt7938;
	}

	public void method3584(int i_1) {
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

	public Class282_Sub53 method3571(byte b_1) {
		return (Class282_Sub53) this.aClass482_7941.method8061((byte) -121);
	}

	int method12908(MouseEvent mouseevent_1, int i_2) {
		return mouseevent_1.getButton() == 1 ? (mouseevent_1.isMetaDown() ? 4 : 1) : (mouseevent_1.getButton() == 2 ? 2 : (mouseevent_1.getButton() == 3 ? 4 : 0));
	}

	public synchronized void mousePressed(MouseEvent mouseevent_1) {
		int i_2 = this.method12908(mouseevent_1, -1413980906);
		if (i_2 == 1) {
			this.method12909(0, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount(), -1931505233);
		} else if (i_2 == 4) {
			this.method12909(2, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount(), -1931505233);
		} else if (i_2 == 2) {
			this.method12909(1, mouseevent_1.getX(), mouseevent_1.getY(), mouseevent_1.getClickCount(), -1931505233);
		}

		this.anInt7944 |= i_2;
		if (mouseevent_1.isPopupTrigger()) {
			mouseevent_1.consume();
		}

	}

	void method12909(int i_1, int i_2, int i_3, int i_4, int i_5) {
		Class282_Sub53_Sub2 class282_sub53_sub2_6 = Class521_Sub1_Sub3_Sub1.method16080(i_1, i_2, i_3, Class169.method2869(1557164427), i_4, 1660805972);
		this.aClass482_7945.append(class282_sub53_sub2_6, 335888371);
	}

	public synchronized void method3578() {
		this.anInt7938 = this.anInt7942 * 1679338381 * 1630671813 * 1002227073;
		this.anInt7939 = this.anInt7943 * 1672782407 * 1370759671 * 954893953;
		this.anInt7940 = this.anInt7944 * 919895911 * -714190199 * -1237626913;
		NodeCollection nodecollection_1 = this.aClass482_7941;
		this.aClass482_7941 = this.aClass482_7945;
		this.aClass482_7945 = nodecollection_1;
		this.aClass482_7945.method8118(237232495);
	}

	public Class282_Sub53 method3590() {
		return (Class282_Sub53) this.aClass482_7941.method8061((byte) -90);
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

		this.method12909(6, i_2, i_3, i_4, -1931505233);
		mousewheelevent_1.consume();
	}

	public synchronized void method3581() {
		this.anInt7938 = this.anInt7942 * 1679338381 * 1630671813 * 1002227073;
		this.anInt7939 = this.anInt7943 * 1672782407 * 1370759671 * 954893953;
		this.anInt7940 = this.anInt7944 * 919895911 * -714190199 * -1237626913;
		NodeCollection nodecollection_1 = this.aClass482_7941;
		this.aClass482_7941 = this.aClass482_7945;
		this.aClass482_7945 = nodecollection_1;
		this.aClass482_7945.method8118(-461780594);
	}

	public Class282_Sub53 method3591() {
		return (Class282_Sub53) this.aClass482_7941.method8061((byte) -123);
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

	public int method3570(int i_1) {
		return this.anInt7939;
	}

	public int method3564() {
		return 954893953 * this.anInt7939 * 220182913;
	}

	public Class282_Sub53 method3592() {
		return (Class282_Sub53) this.aClass482_7941.method8061((byte) -101);
	}

	public synchronized void mouseExited(MouseEvent mouseevent_1) {
		this.method12905(mouseevent_1.getX(), mouseevent_1.getY(), -1606107629);
	}

	public synchronized void mouseDragged(MouseEvent mouseevent_1) {
		this.method12905(mouseevent_1.getX(), mouseevent_1.getY(), -641824056);
	}

	public Class282_Sub53 method3588() {
		return (Class282_Sub53) this.aClass482_7941.method8061((byte) -37);
	}

	public void method3594() {
		this.method12907((short) 11484);
	}

	public void method3595() {
		this.method12907((short) 31873);
	}

	static final void method12915(CS2Executor cs2executor_0, int i_1) {
		NPC npc_2 = (NPC) cs2executor_0.animable;
		String string_3 = npc_2.aString10584;
		NPCDefinitions npcdefinitions_4 = npc_2.aClass409_10580;
		if (npcdefinitions_4.anIntArray4886 != null) {
			npcdefinitions_4 = npcdefinitions_4.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (npcdefinitions_4 == null) {
				string_3 = "";
			} else {
				string_3 = npcdefinitions_4.aString4857;
			}
		}

		if (string_3 == null) {
			string_3 = "";
		}

		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_3;
	}

	public static void method12916(byte b_0) {
		for (int i_1 = 0; i_1 < 100; i_1++) {
			Class81.CHAT_LINES[i_1] = null;
		}

		Class81.NUM_CHAT_LINES = 0;
	}

}
