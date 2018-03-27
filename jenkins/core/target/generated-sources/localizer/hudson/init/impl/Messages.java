// CHECKSTYLE:OFF

package hudson.init.impl;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code GroovyInitScript.init}: {@code Executing user-defined init
     * script}.
     * 
     * @return
     *     {@code Executing user-defined init script}
     */
    public static String GroovyInitScript_init() {
        return holder.format("GroovyInitScript.init");
    }

    /**
     * Key {@code GroovyInitScript.init}: {@code Executing user-defined init
     * script}.
     * 
     * @return
     *     {@code Executing user-defined init script}
     */
    public static Localizable _GroovyInitScript_init() {
        return new Localizable(holder, "GroovyInitScript.init");
    }

    /**
     * Key {@code InitialUserContent.init}: {@code Preparing initial user
     * content}.
     * 
     * @return
     *     {@code Preparing initial user content}
     */
    public static String InitialUserContent_init() {
        return holder.format("InitialUserContent.init");
    }

    /**
     * Key {@code InitialUserContent.init}: {@code Preparing initial user
     * content}.
     * 
     * @return
     *     {@code Preparing initial user content}
     */
    public static Localizable _InitialUserContent_init() {
        return new Localizable(holder, "InitialUserContent.init");
    }

}
