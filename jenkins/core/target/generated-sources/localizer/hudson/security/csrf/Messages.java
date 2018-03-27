// CHECKSTYLE:OFF

package hudson.security.csrf;

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
     * Key {@code DefaultCrumbIssuer.DisplayName}: {@code Default Crumb
     * Issuer}.
     * 
     * @return
     *     {@code Default Crumb Issuer}
     */
    public static String DefaultCrumbIssuer_DisplayName() {
        return holder.format("DefaultCrumbIssuer.DisplayName");
    }

    /**
     * Key {@code DefaultCrumbIssuer.DisplayName}: {@code Default Crumb
     * Issuer}.
     * 
     * @return
     *     {@code Default Crumb Issuer}
     */
    public static Localizable _DefaultCrumbIssuer_DisplayName() {
        return new Localizable(holder, "DefaultCrumbIssuer.DisplayName");
    }

}
