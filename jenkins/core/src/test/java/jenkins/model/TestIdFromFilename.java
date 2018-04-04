/* Test File */

package jenkins.model;

import hudson.Util;
import hudson.util.StreamTaskListener;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import org.apache.commons.io.FileUtils;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIdFromFilename{
	String Filename = "[a-z0-9_. -]+";
	
	@Test
	public void testIdEqual(){
		jenkins.model.IdStrategy.CaseSensitive cs;
		cs = new jenkins.model.IdStrategy.CaseSensitive();
		String result = cs.idFromFilename(Filename);
		assertEquals(result, "a-z0-9_. -");
	}
	
	@Test
	public void testIdNull(){
		jenkins.model.IdStrategy.CaseSensitive cs;
		cs = new jenkins.model.IdStrategy.CaseSensitive();
		String result = cs.idFromFilename("$abcd");
		assertEquals(result, "ꯍ");

	}
}