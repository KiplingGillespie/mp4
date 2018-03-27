// CHECKSTYLE:OFF

package hudson.scm;

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
     * Key {@code NullSCM.DisplayName}: {@code None}.
     * 
     * @return
     *     {@code None}
     */
    public static String NullSCM_DisplayName() {
        return holder.format("NullSCM.DisplayName");
    }

    /**
     * Key {@code NullSCM.DisplayName}: {@code None}.
     * 
     * @return
     *     {@code None}
     */
    public static Localizable _NullSCM_DisplayName() {
        return new Localizable(holder, "NullSCM.DisplayName");
    }

    /**
     * Key {@code SCM.Permissions.Title}: {@code SCM}.
     * 
     * @return
     *     {@code SCM}
     */
    public static String SCM_Permissions_Title() {
        return holder.format("SCM.Permissions.Title");
    }

    /**
     * Key {@code SCM.Permissions.Title}: {@code SCM}.
     * 
     * @return
     *     {@code SCM}
     */
    public static Localizable _SCM_Permissions_Title() {
        return new Localizable(holder, "SCM.Permissions.Title");
    }

    /**
     * Key {@code SCM.TagPermission.Description}: {@code This permission
     * allows users to create a new tag in the source code repository for a
     * given build.}.
     * 
     * @return
     *     {@code This permission allows users to create a new tag in the source
     *     code repository for a given build.}
     */
    public static String SCM_TagPermission_Description() {
        return holder.format("SCM.TagPermission.Description");
    }

    /**
     * Key {@code SCM.TagPermission.Description}: {@code This permission
     * allows users to create a new tag in the source code repository for a
     * given build.}.
     * 
     * @return
     *     {@code This permission allows users to create a new tag in the source
     *     code repository for a given build.}
     */
    public static Localizable _SCM_TagPermission_Description() {
        return new Localizable(holder, "SCM.TagPermission.Description");
    }

}
