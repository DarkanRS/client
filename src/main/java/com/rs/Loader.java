package com.rs;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.MenuContainer;
import java.awt.Panel;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.accessibility.Accessible;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.rs.jagex.WorldDescriptor;
import com.rs.jagex.client;

public class Loader extends Panel implements ImageObserver, MenuContainer, Serializable, Accessible {
	public static final String HOME_DIR = ".darkanrs";
	public static final String CACHE_DIR = HOME_DIR + File.separatorChar + "caches";
	private static final long serialVersionUID = 1L;

	public static final int MAJOR_BUILD = 727;
	public static final int MINOR_BUILD = 1;
	public static final int CLIENT_BUILD = 6;
	public static final int WORLD_PORT = 43595;
	public static int LOBBY_PORT = 43594;
	public static final int LOBBY_WORLD = 1115;
	public static final int JS5_SOURCE_WORLD = 420;
	public static final int DEFAULT_WORLD = 1;
	public static final BigInteger RSA_PUBLIC_MODULUS = new BigInteger("117525752735533423040644219776209926525585489242340044375332234679786347045466594509203355398209678968096551043842518449703703964361320462967286756268851663407950384008240524570966471744081769815157355561961607944067477858512067883877129283799853947605780903005188603658779539811385137666347647991072028080201");
	public static final BigInteger RSA_PUBLIC_EXPONENT = new BigInteger("65537");
	public static final boolean DEBUG = false;
	public static String IP_ADDRESS;
	public static Properties clientParams = new Properties();

	public static Loader INSTANCE;

	public static int getPort(int worldId) {
		WorldDescriptor world = WorldDescriptor.getWorld(worldId);
		if (world != null && world.port != -1)
			return world.port;
		return switch (worldId) {
		case LOBBY_WORLD, JS5_SOURCE_WORLD -> LOBBY_PORT;
		default -> WORLD_PORT;
		};
	}

	public static void loadParams() {
		clientParams.clear();
		clientParams.put("boxborder", "false");
		clientParams.put("boxbgcolor", "black");
		clientParams.put("separate_jvm", "true");
		clientParams.put("centerimage", "true");
		clientParams.put("java_arguments", "-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		clientParams.put("image", "http://www.runescape.com/img/game/splash2.gif");
		clientParams.put("-1", "-Vt*kwflxoHi*o7XkGw79w");
		clientParams.put("11", "false");
		clientParams.put("1", "");
		clientParams.put("21", IP_ADDRESS);
		clientParams.put("9", "true");
		clientParams.put("14", ""+LOBBY_WORLD);
		clientParams.put("22", "false");
		clientParams.put("7", "");
		clientParams.put("12", "");
		clientParams.put("31", "0");
		clientParams.put("6", "0");
		clientParams.put("33", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
		clientParams.put("28", "false");
		clientParams.put("10", "false");
		clientParams.put("27", "1451434218");
		clientParams.put("26", "637809750146160229");
		clientParams.put("20", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
		clientParams.put("0", "-bQCRYmC-hBwK2NKrdF7iQ");
		clientParams.put("30", "38888");
		clientParams.put("25", "true");
		clientParams.put("16", ""+JS5_SOURCE_WORLD);
		clientParams.put("32", "");
		clientParams.put("24", "0");
		clientParams.put("5", IP_ADDRESS);
		clientParams.put("15", "0");
		clientParams.put("18", "false");
		clientParams.put("23", "0");
		clientParams.put("35", "0");
		clientParams.put("4", "");
		clientParams.put("13", "29EDD9FDC775629058FBBF106C5B0E0A3A8028FE0037D1737B8EC3EA2F4E8B8FD6F54EF2F4E65862");
		clientParams.put("17", "ev9+VAp5/tMKeNR/7MOuH6lKWS+rGkHK");
		clientParams.put("8", "0");
		clientParams.put("29", "false");
	}

	public static void main(String[] args) {
		System.setProperty("sun.java2d.uiScale", "1.0");
		System.setProperty("sun.java2d.win.uiScaleX", "1.0");
		System.setProperty("sun.java2d.win.uiScaleY", "1.0");
		System.setProperty("sun.java2d.uiScale.enabled", "false");
		if (args.length > 0 && args[0] != null)
			IP_ADDRESS = args[0];
		else
			IP_ADDRESS = "axios.trentonkress.com";
		if (args.length > 1 && args[1] != null)
			LOBBY_PORT = Integer.valueOf(args[1]);
		new Loader().doFrame();
	}

	public JFrame clientFrame;

	public void doFrame() {
		INSTANCE = this;
		openFrame();
		startClient();
		clientFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public URL getCodeBase() {
		try {
			return new URL("http://" + IP_ADDRESS);
		} catch (MalformedURLException e) {
			System.out.println("Invalid ip address");
		}
		return null;
	}

	public URL getDocumentBase() {
		try {
			return new URL("http://" + IP_ADDRESS);
		} catch (MalformedURLException e) {
			System.out.println("Invalid ip address");
		}
		return null;
	}

	public String getParameter(String arg0) {
		return (String) clientParams.get(arg0);
	}

	public void openFrame() {
		clientFrame = new JFrame("Darkan Client");
		clientFrame.setLayout(new BorderLayout());
		JPanel client_panel = new JPanel();
		client_panel.setLayout(new BorderLayout());
		client_panel.add(this);
		client_panel.setPreferredSize(new Dimension(774, 588));
		clientFrame.getContentPane().add(client_panel, "Center");
		clientFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		clientFrame.pack();
		clientFrame.setVisible(true);
	}

	public void showError(String string) {
		JOptionPane.showMessageDialog(this, string);
	}

	public void startClient() {
		System.setProperty("sun.java2d.uiScale", "1.0");
		System.setProperty("sun.java2d.win.uiScaleX", "1.0");
		System.setProperty("sun.java2d.win.uiScaleY", "1.0");
		System.setProperty("sun.java2d.uiScale.enabled", "false");
		loadParams();
		client clnt = new client();
		clnt.supplyApplet(this);
		clnt.init();
		clnt.start();
	}

}