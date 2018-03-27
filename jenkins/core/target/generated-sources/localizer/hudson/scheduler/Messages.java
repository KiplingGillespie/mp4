// CHECKSTYLE:OFF

package hudson.scheduler;

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
     * Key {@code CronTabList.InvalidInput}: {@code Invalid input: "{0}":
     * {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Invalid input: "{0}": {1}}
     */
    public static String CronTabList_InvalidInput(Object arg0, Object arg1) {
        return holder.format("CronTabList.InvalidInput", arg0, arg1);
    }

    /**
     * Key {@code CronTabList.InvalidInput}: {@code Invalid input: "{0}":
     * {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Invalid input: "{0}": {1}}
     */
    public static Localizable _CronTabList_InvalidInput(Object arg0, Object arg1) {
        return new Localizable(holder, "CronTabList.InvalidInput", arg0, arg1);
    }

    /**
     * Key {@code CronTab.spread_load_evenly_by_using_rather_than_}: {@code
     * Spread load evenly by using ‘{0}’ rather than ‘{1}’}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Spread load evenly by using ‘{0}’ rather than ‘{1}’}
     */
    public static String CronTab_spread_load_evenly_by_using_rather_than_(Object arg0, Object arg1) {
        return holder.format("CronTab.spread_load_evenly_by_using_rather_than_", arg0, arg1);
    }

    /**
     * Key {@code CronTab.spread_load_evenly_by_using_rather_than_}: {@code
     * Spread load evenly by using ‘{0}’ rather than ‘{1}’}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Spread load evenly by using ‘{0}’ rather than ‘{1}’}
     */
    public static Localizable _CronTab_spread_load_evenly_by_using_rather_than_(Object arg0, Object arg1) {
        return new Localizable(holder, "CronTab.spread_load_evenly_by_using_rather_than_", arg0, arg1);
    }

    /**
     * Key {@code BaseParser.OutOfRange}: {@code {0} is an invalid value.
     * Must be within {1} and {2}}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is an invalid value. Must be within {1} and {2}}
     */
    public static String BaseParser_OutOfRange(Object arg0, Object arg1, Object arg2) {
        return holder.format("BaseParser.OutOfRange", arg0, arg1, arg2);
    }

    /**
     * Key {@code BaseParser.OutOfRange}: {@code {0} is an invalid value.
     * Must be within {1} and {2}}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is an invalid value. Must be within {1} and {2}}
     */
    public static Localizable _BaseParser_OutOfRange(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "BaseParser.OutOfRange", arg0, arg1, arg2);
    }

    /**
     * Key {@code BaseParser.MustBePositive}: {@code step must be positive,
     * but found {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code step must be positive, but found {0}}
     */
    public static String BaseParser_MustBePositive(Object arg0) {
        return holder.format("BaseParser.MustBePositive", arg0);
    }

    /**
     * Key {@code BaseParser.MustBePositive}: {@code step must be positive,
     * but found {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code step must be positive, but found {0}}
     */
    public static Localizable _BaseParser_MustBePositive(Object arg0) {
        return new Localizable(holder, "BaseParser.MustBePositive", arg0);
    }

    /**
     * Key {@code BaseParser.StartEndReversed}: {@code You mean {0}-{1}?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code You mean {0}-{1}?}
     */
    public static String BaseParser_StartEndReversed(Object arg0, Object arg1) {
        return holder.format("BaseParser.StartEndReversed", arg0, arg1);
    }

    /**
     * Key {@code BaseParser.StartEndReversed}: {@code You mean {0}-{1}?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code You mean {0}-{1}?}
     */
    public static Localizable _BaseParser_StartEndReversed(Object arg0, Object arg1) {
        return new Localizable(holder, "BaseParser.StartEndReversed", arg0, arg1);
    }

    /**
     * Key {@code CronTab.short_cycles_in_the_day_of_month_field_w}: {@code
     * Short cycles in the day-of-month field will behave oddly near the end
     * of a month}.
     * 
     * @return
     *     {@code Short cycles in the day-of-month field will behave oddly near
     *     the end of a month}
     */
    public static String CronTab_short_cycles_in_the_day_of_month_field_w() {
        return holder.format("CronTab.short_cycles_in_the_day_of_month_field_w");
    }

    /**
     * Key {@code CronTab.short_cycles_in_the_day_of_month_field_w}: {@code
     * Short cycles in the day-of-month field will behave oddly near the end
     * of a month}.
     * 
     * @return
     *     {@code Short cycles in the day-of-month field will behave oddly near
     *     the end of a month}
     */
    public static Localizable _CronTab_short_cycles_in_the_day_of_month_field_w() {
        return new Localizable(holder, "CronTab.short_cycles_in_the_day_of_month_field_w");
    }

    /**
     * Key {@code CronTab.do_you_really_mean_every_minute_when_you}: {@code
     * Do you really mean "every minute" when you say "{0}"? Perhaps you
     * meant "{1}" to poll once per hour}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Do you really mean "every minute" when you say "{0}"? Perhaps
     *     you meant "{1}" to poll once per hour}
     */
    public static String CronTab_do_you_really_mean_every_minute_when_you(Object arg0, Object arg1) {
        return holder.format("CronTab.do_you_really_mean_every_minute_when_you", arg0, arg1);
    }

    /**
     * Key {@code CronTab.do_you_really_mean_every_minute_when_you}: {@code
     * Do you really mean "every minute" when you say "{0}"? Perhaps you
     * meant "{1}" to poll once per hour}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Do you really mean "every minute" when you say "{0}"? Perhaps
     *     you meant "{1}" to poll once per hour}
     */
    public static Localizable _CronTab_do_you_really_mean_every_minute_when_you(Object arg0, Object arg1) {
        return new Localizable(holder, "CronTab.do_you_really_mean_every_minute_when_you", arg0, arg1);
    }

}
