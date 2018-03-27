// CHECKSTYLE:OFF

package hudson.search;

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
     * Key {@code UserSearchProperty.DisplayName}: {@code Setting for
     * search}.
     * 
     * @return
     *     {@code Setting for search}
     */
    public static String UserSearchProperty_DisplayName() {
        return holder.format("UserSearchProperty.DisplayName");
    }

    /**
     * Key {@code UserSearchProperty.DisplayName}: {@code Setting for
     * search}.
     * 
     * @return
     *     {@code Setting for search}
     */
    public static Localizable _UserSearchProperty_DisplayName() {
        return new Localizable(holder, "UserSearchProperty.DisplayName");
    }

}
