package minimal;

import org.fest.swing.applet.AppletViewer;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.launcher.AppletLauncher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * FEST Applet Unit Test
 *
 * @author Hakan Uygun
 */
public class HelloWorldTest {

    private AppletViewer viewer;
    private FrameFixture applet;

    @Before
    public void setUp() {
        viewer = AppletLauncher.applet(HelloWorld.class).start();
        applet = new FrameFixture(viewer);
        applet.show();
    }

    @After
    public void tearDown() {
        viewer.unloadApplet();
        applet.cleanUp();
    }

    @Test
    public void hello() {
        //Nothing
    }
}
