// CHECKSTYLE:OFF

package hudson.markup;

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
     * Key {@code EscapedMarkupFormatter.DisplayName}: {@code Escaped HTML}.
     * 
     * @return
     *     {@code Escaped HTML}
     */
    public static String EscapedMarkupFormatter_DisplayName() {
        return holder.format("EscapedMarkupFormatter.DisplayName");
    }

    /**
     * Key {@code EscapedMarkupFormatter.DisplayName}: {@code Escaped HTML}.
     * 
     * @return
     *     {@code Escaped HTML}
     */
    public static Localizable _EscapedMarkupFormatter_DisplayName() {
        return new Localizable(holder, "EscapedMarkupFormatter.DisplayName");
    }

}
