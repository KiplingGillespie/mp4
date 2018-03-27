// CHECKSTYLE:OFF

package hudson.triggers;

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
     * Key {@code TimerTrigger.MissingWhitespace}: {@code You appear to be
     * missing whitespace between * and *.}.
     * 
     * @return
     *     {@code You appear to be missing whitespace between * and *.}
     */
    public static String TimerTrigger_MissingWhitespace() {
        return holder.format("TimerTrigger.MissingWhitespace");
    }

    /**
     * Key {@code TimerTrigger.MissingWhitespace}: {@code You appear to be
     * missing whitespace between * and *.}.
     * 
     * @return
     *     {@code You appear to be missing whitespace between * and *.}
     */
    public static Localizable _TimerTrigger_MissingWhitespace() {
        return new Localizable(holder, "TimerTrigger.MissingWhitespace");
    }

    /**
     * Key {@code TimerTrigger.TimerTriggerCause.ShortDescription}: {@code
     * Started by timer}.
     * 
     * @return
     *     {@code Started by timer}
     */
    public static String TimerTrigger_TimerTriggerCause_ShortDescription() {
        return holder.format("TimerTrigger.TimerTriggerCause.ShortDescription");
    }

    /**
     * Key {@code TimerTrigger.TimerTriggerCause.ShortDescription}: {@code
     * Started by timer}.
     * 
     * @return
     *     {@code Started by timer}
     */
    public static Localizable _TimerTrigger_TimerTriggerCause_ShortDescription() {
        return new Localizable(holder, "TimerTrigger.TimerTriggerCause.ShortDescription");
    }

    /**
     * Key {@code SCMTrigger.DisplayName}: {@code Poll SCM}.
     * 
     * @return
     *     {@code Poll SCM}
     */
    public static String SCMTrigger_DisplayName() {
        return holder.format("SCMTrigger.DisplayName");
    }

    /**
     * Key {@code SCMTrigger.DisplayName}: {@code Poll SCM}.
     * 
     * @return
     *     {@code Poll SCM}
     */
    public static Localizable _SCMTrigger_DisplayName() {
        return new Localizable(holder, "SCMTrigger.DisplayName");
    }

    /**
     * Key {@code SCMTrigger.SCMTriggerCause.ShortDescription}: {@code
     * Started by an SCM change}.
     * 
     * @return
     *     {@code Started by an SCM change}
     */
    public static String SCMTrigger_SCMTriggerCause_ShortDescription() {
        return holder.format("SCMTrigger.SCMTriggerCause.ShortDescription");
    }

    /**
     * Key {@code SCMTrigger.SCMTriggerCause.ShortDescription}: {@code
     * Started by an SCM change}.
     * 
     * @return
     *     {@code Started by an SCM change}
     */
    public static Localizable _SCMTrigger_SCMTriggerCause_ShortDescription() {
        return new Localizable(holder, "SCMTrigger.SCMTriggerCause.ShortDescription");
    }

    /**
     * Key {@code SCMTrigger.getDisplayName}: {@code {0} Polling Log}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} Polling Log}
     */
    public static String SCMTrigger_getDisplayName(Object arg0) {
        return holder.format("SCMTrigger.getDisplayName", arg0);
    }

    /**
     * Key {@code SCMTrigger.getDisplayName}: {@code {0} Polling Log}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} Polling Log}
     */
    public static Localizable _SCMTrigger_getDisplayName(Object arg0) {
        return new Localizable(holder, "SCMTrigger.getDisplayName", arg0);
    }

    /**
     * Key {@code TimerTrigger.no_schedules_so_will_never_run}: {@code No
     * schedules so will never run}.
     * 
     * @return
     *     {@code No schedules so will never run}
     */
    public static String TimerTrigger_no_schedules_so_will_never_run() {
        return holder.format("TimerTrigger.no_schedules_so_will_never_run");
    }

    /**
     * Key {@code TimerTrigger.no_schedules_so_will_never_run}: {@code No
     * schedules so will never run}.
     * 
     * @return
     *     {@code No schedules so will never run}
     */
    public static Localizable _TimerTrigger_no_schedules_so_will_never_run() {
        return new Localizable(holder, "TimerTrigger.no_schedules_so_will_never_run");
    }

    /**
     * Key {@code TimerTrigger.DisplayName}: {@code Build periodically}.
     * 
     * @return
     *     {@code Build periodically}
     */
    public static String TimerTrigger_DisplayName() {
        return holder.format("TimerTrigger.DisplayName");
    }

    /**
     * Key {@code TimerTrigger.DisplayName}: {@code Build periodically}.
     * 
     * @return
     *     {@code Build periodically}
     */
    public static Localizable _TimerTrigger_DisplayName() {
        return new Localizable(holder, "TimerTrigger.DisplayName");
    }

    /**
     * Key {@code Trigger.init}: {@code Initializing timer for triggers}.
     * 
     * @return
     *     {@code Initializing timer for triggers}
     */
    public static String Trigger_init() {
        return holder.format("Trigger.init");
    }

    /**
     * Key {@code Trigger.init}: {@code Initializing timer for triggers}.
     * 
     * @return
     *     {@code Initializing timer for triggers}
     */
    public static Localizable _Trigger_init() {
        return new Localizable(holder, "Trigger.init");
    }

    /**
     * Key {@code TimerTrigger.would_last_have_run_at_would_next_run_at}:
     * {@code Would last have run at {0}; would next run at {1}.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Would last have run at {0}; would next run at {1}.}
     */
    public static String TimerTrigger_would_last_have_run_at_would_next_run_at(Object arg0, Object arg1) {
        return holder.format("TimerTrigger.would_last_have_run_at_would_next_run_at", arg0, arg1);
    }

    /**
     * Key {@code TimerTrigger.would_last_have_run_at_would_next_run_at}:
     * {@code Would last have run at {0}; would next run at {1}.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Would last have run at {0}; would next run at {1}.}
     */
    public static Localizable _TimerTrigger_would_last_have_run_at_would_next_run_at(Object arg0, Object arg1) {
        return new Localizable(holder, "TimerTrigger.would_last_have_run_at_would_next_run_at", arg0, arg1);
    }

    /**
     * Key {@code SCMTrigger.BuildAction.DisplayName}: {@code Polling Log}.
     * 
     * @return
     *     {@code Polling Log}
     */
    public static String SCMTrigger_BuildAction_DisplayName() {
        return holder.format("SCMTrigger.BuildAction.DisplayName");
    }

    /**
     * Key {@code SCMTrigger.BuildAction.DisplayName}: {@code Polling Log}.
     * 
     * @return
     *     {@code Polling Log}
     */
    public static Localizable _SCMTrigger_BuildAction_DisplayName() {
        return new Localizable(holder, "SCMTrigger.BuildAction.DisplayName");
    }

}
