
package lib;

import java.util.Map;
import groovy.lang.Closure;
import org.kohsuke.stapler.jelly.groovy.TagLibraryUri;
import org.kohsuke.stapler.jelly.groovy.TypedTagLibrary;

@TagLibraryUri("/lib/test")
public interface TestTagLib
    extends TypedTagLibrary
{


    /**
     * 
     */
    void bar(Map args, Closure body);

    /**
     * 
     */
    void bar(Closure body);

    /**
     * 
     */
    void bar(Map args);

    /**
     * 
     */
    void bar();

}
