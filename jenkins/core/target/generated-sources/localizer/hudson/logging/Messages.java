// CHECKSTYLE:OFF

package hudson.logging;

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
     * Key {@code LogRecorderManager.init}: {@code Initialing log recorders}.
     * 
     * @return
     *     {@code Initialing log recorders}
     */
    public static String LogRecorderManager_init() {
        return holder.format("LogRecorderManager.init");
    }

    /**
     * Key {@code LogRecorderManager.init}: {@code Initialing log recorders}.
     * 
     * @return
     *     {@code Initialing log recorders}
     */
    public static Localizable _LogRecorderManager_init() {
        return new Localizable(holder, "LogRecorderManager.init");
    }

    /**
     * Key {@code LogRecorderManager.DisplayName}: {@code log}.
     * 
     * @return
     *     {@code log}
     */
    public static String LogRecorderManager_DisplayName() {
        return holder.format("LogRecorderManager.DisplayName");
    }

    /**
     * Key {@code LogRecorderManager.DisplayName}: {@code log}.
     * 
     * @return
     *     {@code log}
     */
    public static Localizable _LogRecorderManager_DisplayName() {
        return new Localizable(holder, "LogRecorderManager.DisplayName");
    }

}
