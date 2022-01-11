/* D3DPRESENT_PARAMETERS - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import java.awt.Component;

public class D3DPRESENT_PARAMETERS {
    public static final int anInt529 = -2147483648;
    public int BackBufferWidth;
    public int BackBufferHeight;
    public int BackBufferFormat;
    public int BackBufferCount;
    public int MultiSampleType;
    public int MultiSampleQuality;
    public int SwapEffect = 1;
    public Component DeviceWindow;
    public boolean Windowed;
    public boolean EnableAutoDepthStencil;
    public int AutoDepthStencilFormat;
    public int Flags;
    public int FullScreen_RefreshRateInHz;
    public int PresentationInterval = -2147483648;

    public D3DPRESENT_PARAMETERS(Component component) {
        DeviceWindow = component;
    }
}
