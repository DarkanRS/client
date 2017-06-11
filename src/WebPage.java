import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class WebPage {

	private URL url;
	private ArrayList<String> lines;

	public WebPage(String url) throws MalformedURLException {
		if (!url.startsWith("http://"))
			url = "http://" + url;
		this.url = new URL(url);
	}

	public void load() {
		lines = new ArrayList<String>();
		try {
			BufferedReader stream = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = stream.readLine()) != null) {
				lines.add(line);
			}
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}

	public ArrayList<String> getLines() {
		return lines;
	}
}