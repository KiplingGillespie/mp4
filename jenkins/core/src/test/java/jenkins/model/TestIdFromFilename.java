/* Test File */

package jenkins.model;

import hudson.DescriptorExtensionList;
import hudson.Extension;
import hudson.ExtensionPoint;
import hudson.model.AbstractDescribableImpl;
import hudson.util.CaseInsensitiveComparator;
import org.apache.commons.lang.StringUtils;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.util.Comparator;
import java.util.Locale;

public class TestIdFromFilename{
	String Filename = "Thisisafilename";
	
	
	public void testIdEqual(){
		AbstractDescribableImpl.IdStrategy bob = new AbstractDescribableImpl.IdStrategy();
		String result = bob.idFromFilename(Filename);
		assertEquals(result, Filename);
	}
	
	
	public void testIdNull(){
		AbstractDescribableImpl.IdStrategy bob = new AbstractDescribableImpl.IdStrategy();
		String result = bob.idFromFilename(null);
		asserNull(result);
	}
}

