
package jenkins;

import java.util.Map;
import groovy.lang.Closure;
import org.kohsuke.stapler.jelly.groovy.TagLibraryUri;
import org.kohsuke.stapler.jelly.groovy.TypedTagLibrary;

@TagLibraryUri("/hudson/tools")
public interface ToolsTagLib
    extends TypedTagLibrary
{


    /**
     * 
     *         Puts the input field for allowing an user to limit this installer to a certain label.
     *         Meant to be used from config.jelly of ToolInstaller subypes. 
     *     
     * 
     */
    void label(Map args, Closure body);

    /**
     * 
     *         Puts the input field for allowing an user to limit this installer to a certain label.
     *         Meant to be used from config.jelly of ToolInstaller subypes. 
     *     
     * 
     */
    void label(Closure body);

    /**
     * 
     *         Puts the input field for allowing an user to limit this installer to a certain label.
     *         Meant to be used from config.jelly of ToolInstaller subypes. 
     *     
     * 
     */
    void label(Map args);

    /**
     * 
     *         Puts the input field for allowing an user to limit this installer to a certain label.
     *         Meant to be used from config.jelly of ToolInstaller subypes. 
     *     
     * 
     */
    void label();

}
