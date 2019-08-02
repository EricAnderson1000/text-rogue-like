package com.textRogueLike.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;


import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws IOException
    {
				//DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();

				Terminal terminal = new DefaultTerminalFactory().createTerminal();
				Screen screen = new TerminalScreen(terminal);

				String s = "Hello World!";
				TextGraphics tGraphics = screen.newTextGraphics();

				screen.startScreen();
				screen.clear();

				tGraphics.putString(10, 10, s);
				screen.refresh();

				screen.readInput();
				screen.stopScreen();

        assertTrue( true );
    }
}
