/* D3DPRESENT_PARAMETERS - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import java.awt.Component;

public class D3DPRESENT_PARAMETERS {
	public static int a = -2147483648;
	public int BackBufferWidth = 0;
	public int BackBufferHeight = 0;
	public int BackBufferFormat = 0;
	public int BackBufferCount = 0;
	public int MultiSampleType = 0;
	public int MultiSampleQuality = 0;
	public int SwapEffect = 1;
	public Component DeviceWindow;
	public boolean Windowed;
	public boolean EnableAutoDepthStencil;
	public int AutoDepthStencilFormat = 0;
	public int Flags;
	public int FullScreen_RefreshRateInHz;
	public int PresentationInterval = -2147483648;

	public D3DPRESENT_PARAMETERS(Component component) {
		DeviceWindow = component;
	}
}
