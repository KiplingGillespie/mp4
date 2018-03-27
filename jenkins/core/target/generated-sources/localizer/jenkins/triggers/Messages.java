// CHECKSTYLE:OFF

package jenkins.triggers;

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
     * Key {@code ReverseBuildTrigger.build_after_other_projects_are_built}:
     * {@code Build after other projects are built}.
     * 
     * @return
     *     {@code Build after other projects are built}
     */
    public static String ReverseBuildTrigger_build_after_other_projects_are_built() {
        return holder.format("ReverseBuildTrigger.build_after_other_projects_are_built");
    }

    /**
     * Key {@code ReverseBuildTrigger.build_after_other_projects_are_built}:
     * {@code Build after other projects are built}.
     * 
     * @return
     *     {@code Build after other projects are built}
     */
    public static Localizable _ReverseBuildTrigger_build_after_other_projects_are_built() {
        return new Localizable(holder, "ReverseBuildTrigger.build_after_other_projects_are_built");
    }

    /**
     * Key {@code
     * ReverseBuildTrigger.running_as_cannot_even_see_for_trigger_f}: {@code
     * Running as {0} cannot even see {1} for trigger from {2}}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Running as {0} cannot even see {1} for trigger from {2}}
     */
    public static String ReverseBuildTrigger_running_as_cannot_even_see_for_trigger_f(Object arg0, Object arg1, Object arg2) {
        return holder.format("ReverseBuildTrigger.running_as_cannot_even_see_for_trigger_f", arg0, arg1, arg2);
    }

    /**
     * Key {@code
     * ReverseBuildTrigger.running_as_cannot_even_see_for_trigger_f}: {@code
     * Running as {0} cannot even see {1} for trigger from {2}}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Running as {0} cannot even see {1} for trigger from {2}}
     */
    public static Localizable _ReverseBuildTrigger_running_as_cannot_even_see_for_trigger_f(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "ReverseBuildTrigger.running_as_cannot_even_see_for_trigger_f", arg0, arg1, arg2);
    }

}
