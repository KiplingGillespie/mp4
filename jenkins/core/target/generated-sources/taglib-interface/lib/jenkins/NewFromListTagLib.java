
package lib.jenkins;

import java.util.Map;
import groovy.lang.Closure;
import org.kohsuke.stapler.jelly.groovy.TagLibraryUri;
import org.kohsuke.stapler.jelly.groovy.TypedTagLibrary;

@TagLibraryUri("/lib/hudson/newFromList")
public interface NewFromListTagLib
    extends TypedTagLibrary
{


    /**
     * 
     *     Generates a form for creating something out of descriptors by (1) selecting a descriptor and specifying a name.
     *     This also presents a copy option. This should be placed inside &lt;l:main-panel>.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void form(Map args, Closure body);

    /**
     * 
     *     Generates a form for creating something out of descriptors by (1) selecting a descriptor and specifying a name.
     *     This also presents a copy option. This should be placed inside &lt;l:main-panel>.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void form(Closure body);

    /**
     * 
     *     Generates a form for creating something out of descriptors by (1) selecting a descriptor and specifying a name.
     *     This also presents a copy option. This should be placed inside &lt;l:main-panel>.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void form(Map args);

    /**
     * 
     *     Generates a form for creating something out of descriptors by (1) selecting a descriptor and specifying a name.
     *     This also presents a copy option. This should be placed inside &lt;l:main-panel>.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void form();

}
