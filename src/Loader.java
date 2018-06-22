import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

public class Loader extends Applet implements AppletStub {

	private static final long serialVersionUID = 1L;

	public static final int CLIENT_REVISON = 727;
	public static final int SUB_REVISION = 1;

	public static final String IP_ADDRESS = "127.0.0.1";
	//public static final String IP_ADDRESS = "axios.trentonkress.com";
	
	public static final int LOBBY_PORT = 5555;

	public static final boolean USING_ISAAC = false;
	public static final boolean LOBBY_ENABLED = true;
	public static final boolean DISABLE_XTEA_CRASH = true;
	
	public static int clientRevision = 6;
	public static int newClientRevision = clientRevision+1;
	
	public static final String clientLink = "http://darkan.org/assets/uploads/files/darkanclient.jar";

	public static Properties clientParams = new Properties();

	public JFrame clientFrame = null;

	public static void main(String[] arg0) {
		new Loader().doFrame();
	}
	
	public static Downloader jarDownloader;

	public static void handleNewJarDownload() {
		try {
			jarDownloader = new Downloader(new URL(clientLink), new File("./Darkan v" + newClientRevision + ".jar"));
			Thread t = new Thread(jarDownloader);
			t.setPriority(Thread.MAX_PRIORITY);
			t.setDaemon(true);
			t.start();

			JFrame f = new JFrame("Darkan Client Updater");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container content = f.getContentPane();
			JProgressBar progressBar = new JProgressBar();
			progressBar.setStringPainted(true);
			Border border = BorderFactory.createTitledBorder("Downloading...");
			progressBar.setBorder(border);
			content.add(progressBar, BorderLayout.NORTH);
			f.setSize(300, 100);
			f.setVisible(true);

			while (!jarDownloader.isCompleted()) {
				progressBar.setValue(jarDownloader.getProgressPercent());
			}
			f.dispose();
			JOptionPane.showMessageDialog(f, "Update successful! Run the newly downloaded: Darkan v" + newClientRevision + ".jar");
			System.exit(0);
		} catch (MalformedURLException e) {
			System.out.print("Downloader error.");
			return;
		}
	}

	@Override
	public void init() {
		doApplet();
	}

	private void doApplet() {
		startClient();
	}

	private void doFrame() {
		openFrame();
		startClient();
		clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	static {
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
		clientParams.put("14", "1115");
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
		clientParams.put("16", "177");
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

	private void openFrame() {
		clientFrame = new JFrame("Darkan Client");
		clientFrame.setLayout(new BorderLayout());
		final JPanel client_panel = new JPanel();
		client_panel.setLayout(new BorderLayout());
		client_panel.add(this);
		client_panel.setPreferredSize(new Dimension(765, 553));
		clientFrame.getContentPane().add(client_panel, "Center");
		clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clientFrame.pack();
		clientFrame.setVisible(true);
	}

	private void startClient() {
		try {
			client clnt = new client();
			DiscordRPC.discordInitialize("459588260252090378", null, true);
			client.presence = new DiscordRichPresence.Builder("In Menu").setBigImage("main", "http://darkan.org").build();
			client.presence.details = "http://darkan.org";
			client.presence.startTimestamp = System.currentTimeMillis() / 1000L;
			DiscordRPC.discordUpdatePresence(client.presence);
			clnt.supplyApplet(this);
			clnt.init();
			clnt.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getParameter(String arg0) {
		return (String) clientParams.get(arg0);
	}

	@Override
	public void appletResize(int arg, int arg1) {

	}

	@Override
	public URL getDocumentBase() {
		try {
			return new URL("http://" + IP_ADDRESS);
		} catch (MalformedURLException e) {
			System.out.println("Invalid ip address");
		}
		return null;
	}

	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + IP_ADDRESS);
		} catch (MalformedURLException e) {
			System.out.println("Invalid ip address");
		}
		return null;
	}

}