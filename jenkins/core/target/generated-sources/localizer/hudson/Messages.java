// CHECKSTYLE:OFF

package hudson;

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
     * Key {@code Util.day}: {@code {0} {0,choice,0#days|1#day|1<days}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, a number.
     * @return
     *     {@code {0} {0,choice,0#days|1#day|1<days}}
     */
    public static String Util_day(Object arg0) {
        return holder.format("Util.day", arg0);
    }

    /**
     * Key {@code Util.day}: {@code {0} {0,choice,0#days|1#day|1<days}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, a number.
     * @return
     *     {@code {0} {0,choice,0#days|1#day|1<days}}
     */
    public static Localizable _Util_day(Object arg0) {
        return new Localizable(holder, "Util.day", arg0);
    }

    /**
     * Key {@code PluginManager.DisplayName}: {@code Plugin Manager}.
     * 
     * @return
     *     {@code Plugin Manager}
     */
    public static String PluginManager_DisplayName() {
        return holder.format("PluginManager.DisplayName");
    }

    /**
     * Key {@code PluginManager.DisplayName}: {@code Plugin Manager}.
     * 
     * @return
     *     {@code Plugin Manager}
     */
    public static Localizable _PluginManager_DisplayName() {
        return new Localizable(holder, "PluginManager.DisplayName");
    }

    /**
     * Key {@code Util.millisecond}: {@code {0} ms}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} ms}
     */
    public static String Util_millisecond(Object arg0) {
        return holder.format("Util.millisecond", arg0);
    }

    /**
     * Key {@code Util.millisecond}: {@code {0} ms}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} ms}
     */
    public static Localizable _Util_millisecond(Object arg0) {
        return new Localizable(holder, "Util.millisecond", arg0);
    }

    /**
     * Key {@code PluginManager.UploadPluginsPermission.Description}: {@code
     * The "upload plugin" permission allows a user to upload arbitrary
     * plugins.}.
     * 
     * @return
     *     {@code The "upload plugin" permission allows a user to upload
     *     arbitrary plugins.}
     */
    public static String PluginManager_UploadPluginsPermission_Description() {
        return holder.format("PluginManager.UploadPluginsPermission.Description");
    }

    /**
     * Key {@code PluginManager.UploadPluginsPermission.Description}: {@code
     * The "upload plugin" permission allows a user to upload arbitrary
     * plugins.}.
     * 
     * @return
     *     {@code The "upload plugin" permission allows a user to upload
     *     arbitrary plugins.}
     */
    public static Localizable _PluginManager_UploadPluginsPermission_Description() {
        return new Localizable(holder, "PluginManager.UploadPluginsPermission.Description");
    }

    /**
     * Key {@code PluginManager.PluginIsAlreadyInstalled.RestartRequired}:
     * {@code {0} plugin is already installed. Jenkins needs to be restarted
     * for the update to take effect}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} plugin is already installed. Jenkins needs to be restarted
     *     for the update to take effect}
     */
    public static String PluginManager_PluginIsAlreadyInstalled_RestartRequired(Object arg0) {
        return holder.format("PluginManager.PluginIsAlreadyInstalled.RestartRequired", arg0);
    }

    /**
     * Key {@code PluginManager.PluginIsAlreadyInstalled.RestartRequired}:
     * {@code {0} plugin is already installed. Jenkins needs to be restarted
     * for the update to take effect}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} plugin is already installed. Jenkins needs to be restarted
     *     for the update to take effect}
     */
    public static Localizable _PluginManager_PluginIsAlreadyInstalled_RestartRequired(Object arg0) {
        return new Localizable(holder, "PluginManager.PluginIsAlreadyInstalled.RestartRequired", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.notFile}: {@code ‘{0}’ is not
     * a file}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ is not a file}
     */
    public static String FilePath_validateRelativePath_notFile(Object arg0) {
        return holder.format("FilePath.validateRelativePath.notFile", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.notFile}: {@code ‘{0}’ is not
     * a file}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ is not a file}
     */
    public static Localizable _FilePath_validateRelativePath_notFile(Object arg0) {
        return new Localizable(holder, "FilePath.validateRelativePath.notFile", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.noSuchFile}: {@code No such
     * file: ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such file: ‘{0}’}
     */
    public static String FilePath_validateRelativePath_noSuchFile(Object arg0) {
        return holder.format("FilePath.validateRelativePath.noSuchFile", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.noSuchFile}: {@code No such
     * file: ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such file: ‘{0}’}
     */
    public static Localizable _FilePath_validateRelativePath_noSuchFile(Object arg0) {
        return new Localizable(holder, "FilePath.validateRelativePath.noSuchFile", arg0);
    }

    /**
     * Key {@code
     * FilePath.validateAntFileMask.doesntMatchAnythingAndSuggest}: {@code
     * ‘{0}’ doesn’t match anything: even ‘{1}’ doesn’t exist}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything: even ‘{1}’ doesn’t exist}
     */
    public static String FilePath_validateAntFileMask_doesntMatchAnythingAndSuggest(Object arg0, Object arg1) {
        return holder.format("FilePath.validateAntFileMask.doesntMatchAnythingAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code
     * FilePath.validateAntFileMask.doesntMatchAnythingAndSuggest}: {@code
     * ‘{0}’ doesn’t match anything: even ‘{1}’ doesn’t exist}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything: even ‘{1}’ doesn’t exist}
     */
    public static Localizable _FilePath_validateAntFileMask_doesntMatchAnythingAndSuggest(Object arg0, Object arg1) {
        return new Localizable(holder, "FilePath.validateAntFileMask.doesntMatchAnythingAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code FilePath.validateRelativePath.notDirectory}: {@code ‘{0}’
     * is not a directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ is not a directory}
     */
    public static String FilePath_validateRelativePath_notDirectory(Object arg0) {
        return holder.format("FilePath.validateRelativePath.notDirectory", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.notDirectory}: {@code ‘{0}’
     * is not a directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ is not a directory}
     */
    public static Localizable _FilePath_validateRelativePath_notDirectory(Object arg0) {
        return new Localizable(holder, "FilePath.validateRelativePath.notDirectory", arg0);
    }

    /**
     * Key {@code Util.pastTime}: {@code {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0}}
     */
    public static String Util_pastTime(Object arg0) {
        return holder.format("Util.pastTime", arg0);
    }

    /**
     * Key {@code Util.pastTime}: {@code {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0}}
     */
    public static Localizable _Util_pastTime(Object arg0) {
        return new Localizable(holder, "Util.pastTime", arg0);
    }

    /**
     * Key {@code
     * PluginManager.PluginDoesntSupportDynamicLoad.RestartRequired}: {@code
     * {0} plugin doesn’t support dynamic loading. Jenkins needs to be
     * restarted for the update to take effect}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} plugin doesn’t support dynamic loading. Jenkins needs to be
     *     restarted for the update to take effect}
     */
    public static String PluginManager_PluginDoesntSupportDynamicLoad_RestartRequired(Object arg0) {
        return holder.format("PluginManager.PluginDoesntSupportDynamicLoad.RestartRequired", arg0);
    }

    /**
     * Key {@code
     * PluginManager.PluginDoesntSupportDynamicLoad.RestartRequired}: {@code
     * {0} plugin doesn’t support dynamic loading. Jenkins needs to be
     * restarted for the update to take effect}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} plugin doesn’t support dynamic loading. Jenkins needs to be
     *     restarted for the update to take effect}
     */
    public static Localizable _PluginManager_PluginDoesntSupportDynamicLoad_RestartRequired(Object arg0) {
        return new Localizable(holder, "PluginManager.PluginDoesntSupportDynamicLoad.RestartRequired", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.wildcardNotAllowed}: {@code
     * Wildcard is not allowed here}.
     * 
     * @return
     *     {@code Wildcard is not allowed here}
     */
    public static String FilePath_validateRelativePath_wildcardNotAllowed() {
        return holder.format("FilePath.validateRelativePath.wildcardNotAllowed");
    }

    /**
     * Key {@code FilePath.validateRelativePath.wildcardNotAllowed}: {@code
     * Wildcard is not allowed here}.
     * 
     * @return
     *     {@code Wildcard is not allowed here}
     */
    public static Localizable _FilePath_validateRelativePath_wildcardNotAllowed() {
        return new Localizable(holder, "FilePath.validateRelativePath.wildcardNotAllowed");
    }

    /**
     * Key {@code FilePath.validateAntFileMask.doesntMatchAndSuggest}: {@code
     * ‘{0}’ doesn’t match anything, but ‘{1}’ does. Perhaps that’s what you
     * mean?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything, but ‘{1}’ does. Perhaps that’s
     *     what you mean?}
     */
    public static String FilePath_validateAntFileMask_doesntMatchAndSuggest(Object arg0, Object arg1) {
        return holder.format("FilePath.validateAntFileMask.doesntMatchAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.doesntMatchAndSuggest}: {@code
     * ‘{0}’ doesn’t match anything, but ‘{1}’ does. Perhaps that’s what you
     * mean?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything, but ‘{1}’ does. Perhaps that’s
     *     what you mean?}
     */
    public static Localizable _FilePath_validateAntFileMask_doesntMatchAndSuggest(Object arg0, Object arg1) {
        return new Localizable(holder, "FilePath.validateAntFileMask.doesntMatchAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.doesntMatchAnything}: {@code
     * ‘{0}’ doesn’t match anything}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything}
     */
    public static String FilePath_validateAntFileMask_doesntMatchAnything(Object arg0) {
        return holder.format("FilePath.validateAntFileMask.doesntMatchAnything", arg0);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.doesntMatchAnything}: {@code
     * ‘{0}’ doesn’t match anything}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything}
     */
    public static Localizable _FilePath_validateAntFileMask_doesntMatchAnything(Object arg0) {
        return new Localizable(holder, "FilePath.validateAntFileMask.doesntMatchAnything", arg0);
    }

    /**
     * Key {@code Util.hour}: {@code {0} hr}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} hr}
     */
    public static String Util_hour(Object arg0) {
        return holder.format("Util.hour", arg0);
    }

    /**
     * Key {@code Util.hour}: {@code {0} hr}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} hr}
     */
    public static Localizable _Util_hour(Object arg0) {
        return new Localizable(holder, "Util.hour", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.noSuchDirectory}: {@code No
     * such directory: ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such directory: ‘{0}’}
     */
    public static String FilePath_validateRelativePath_noSuchDirectory(Object arg0) {
        return holder.format("FilePath.validateRelativePath.noSuchDirectory", arg0);
    }

    /**
     * Key {@code FilePath.validateRelativePath.noSuchDirectory}: {@code No
     * such directory: ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such directory: ‘{0}’}
     */
    public static Localizable _FilePath_validateRelativePath_noSuchDirectory(Object arg0) {
        return new Localizable(holder, "FilePath.validateRelativePath.noSuchDirectory", arg0);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.whitespaceSeprator}: {@code
     * Whitespace can no longer be used as the separator. Please Use ‘,’ as
     * the separator instead.}.
     * 
     * @return
     *     {@code Whitespace can no longer be used as the separator. Please Use
     *     ‘,’ as the separator instead.}
     */
    public static String FilePath_validateAntFileMask_whitespaceSeprator() {
        return holder.format("FilePath.validateAntFileMask.whitespaceSeprator");
    }

    /**
     * Key {@code FilePath.validateAntFileMask.whitespaceSeprator}: {@code
     * Whitespace can no longer be used as the separator. Please Use ‘,’ as
     * the separator instead.}.
     * 
     * @return
     *     {@code Whitespace can no longer be used as the separator. Please Use
     *     ‘,’ as the separator instead.}
     */
    public static Localizable _FilePath_validateAntFileMask_whitespaceSeprator() {
        return new Localizable(holder, "FilePath.validateAntFileMask.whitespaceSeprator");
    }

    /**
     * Key {@code ProxyConfiguration.Success}: {@code Success}.
     * 
     * @return
     *     {@code Success}
     */
    public static String ProxyConfiguration_Success() {
        return holder.format("ProxyConfiguration.Success");
    }

    /**
     * Key {@code ProxyConfiguration.Success}: {@code Success}.
     * 
     * @return
     *     {@code Success}
     */
    public static Localizable _ProxyConfiguration_Success() {
        return new Localizable(holder, "ProxyConfiguration.Success");
    }

    /**
     * Key {@code ProxyConfiguration.FailedToConnectViaProxy}: {@code Failed
     * to connect to {0}.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to connect to {0}.}
     */
    public static String ProxyConfiguration_FailedToConnectViaProxy(Object arg0) {
        return holder.format("ProxyConfiguration.FailedToConnectViaProxy", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.FailedToConnectViaProxy}: {@code Failed
     * to connect to {0}.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to connect to {0}.}
     */
    public static Localizable _ProxyConfiguration_FailedToConnectViaProxy(Object arg0) {
        return new Localizable(holder, "ProxyConfiguration.FailedToConnectViaProxy", arg0);
    }

    /**
     * Key {@code Util.minute}: {@code {0} min}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} min}
     */
    public static String Util_minute(Object arg0) {
        return holder.format("Util.minute", arg0);
    }

    /**
     * Key {@code Util.minute}: {@code {0} min}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} min}
     */
    public static Localizable _Util_minute(Object arg0) {
        return new Localizable(holder, "Util.minute", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.FailedToConnect}: {@code Failed to
     * connect to {0} (code {1}).}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to connect to {0} (code {1}).}
     */
    public static String ProxyConfiguration_FailedToConnect(Object arg0, Object arg1) {
        return holder.format("ProxyConfiguration.FailedToConnect", arg0, arg1);
    }

    /**
     * Key {@code ProxyConfiguration.FailedToConnect}: {@code Failed to
     * connect to {0} (code {1}).}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to connect to {0} (code {1}).}
     */
    public static Localizable _ProxyConfiguration_FailedToConnect(Object arg0, Object arg1) {
        return new Localizable(holder, "ProxyConfiguration.FailedToConnect", arg0, arg1);
    }

    /**
     * Key {@code PluginManager.PortNotANumber}: {@code Port is not a
     * number}.
     * 
     * @return
     *     {@code Port is not a number}
     */
    public static String PluginManager_PortNotANumber() {
        return holder.format("PluginManager.PortNotANumber");
    }

    /**
     * Key {@code PluginManager.PortNotANumber}: {@code Port is not a
     * number}.
     * 
     * @return
     *     {@code Port is not a number}
     */
    public static Localizable _PluginManager_PortNotANumber() {
        return new Localizable(holder, "PluginManager.PortNotANumber");
    }

    /**
     * Key {@code Util.year}: {@code {0} yr}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} yr}
     */
    public static String Util_year(Object arg0) {
        return holder.format("Util.year", arg0);
    }

    /**
     * Key {@code Util.year}: {@code {0} yr}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} yr}
     */
    public static Localizable _Util_year(Object arg0) {
        return new Localizable(holder, "Util.year", arg0);
    }

    /**
     * Key {@code ProxyConfiguration.TestUrlRequired}: {@code Test URL is
     * required.}.
     * 
     * @return
     *     {@code Test URL is required.}
     */
    public static String ProxyConfiguration_TestUrlRequired() {
        return holder.format("ProxyConfiguration.TestUrlRequired");
    }

    /**
     * Key {@code ProxyConfiguration.TestUrlRequired}: {@code Test URL is
     * required.}.
     * 
     * @return
     *     {@code Test URL is required.}
     */
    public static Localizable _ProxyConfiguration_TestUrlRequired() {
        return new Localizable(holder, "ProxyConfiguration.TestUrlRequired");
    }

    /**
     * Key {@code PluginManager.ConfigureUpdateCenterPermission.Description}:
     * {@code The "configure update center" permission allows a user to
     * configure update sites and proxy settings.}.
     * 
     * @return
     *     {@code The "configure update center" permission allows a user to
     *     configure update sites and proxy settings.}
     */
    public static String PluginManager_ConfigureUpdateCenterPermission_Description() {
        return holder.format("PluginManager.ConfigureUpdateCenterPermission.Description");
    }

    /**
     * Key {@code PluginManager.ConfigureUpdateCenterPermission.Description}:
     * {@code The "configure update center" permission allows a user to
     * configure update sites and proxy settings.}.
     * 
     * @return
     *     {@code The "configure update center" permission allows a user to
     *     configure update sites and proxy settings.}
     */
    public static Localizable _PluginManager_ConfigureUpdateCenterPermission_Description() {
        return new Localizable(holder, "PluginManager.ConfigureUpdateCenterPermission.Description");
    }

    /**
     * Key {@code FilePath.validateAntFileMask.portionMatchAndSuggest}:
     * {@code ‘{0}’ doesn’t match anything, although ‘{1}’ exists}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything, although ‘{1}’ exists}
     */
    public static String FilePath_validateAntFileMask_portionMatchAndSuggest(Object arg0, Object arg1) {
        return holder.format("FilePath.validateAntFileMask.portionMatchAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code FilePath.validateAntFileMask.portionMatchAndSuggest}:
     * {@code ‘{0}’ doesn’t match anything, although ‘{1}’ exists}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything, although ‘{1}’ exists}
     */
    public static Localizable _FilePath_validateAntFileMask_portionMatchAndSuggest(Object arg0, Object arg1) {
        return new Localizable(holder, "FilePath.validateAntFileMask.portionMatchAndSuggest", arg0, arg1);
    }

    /**
     * Key {@code Util.month}: {@code {0} mo}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} mo}
     */
    public static String Util_month(Object arg0) {
        return holder.format("Util.month", arg0);
    }

    /**
     * Key {@code Util.month}: {@code {0} mo}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} mo}
     */
    public static Localizable _Util_month(Object arg0) {
        return new Localizable(holder, "Util.month", arg0);
    }

    /**
     * Key {@code
     * FilePath.validateAntFileMask.portionMatchButPreviousNotMatchAndSuggest}:
     * {@code ‘{0}’ doesn’t match anything: ‘{1}’ exists but not ‘{2}’}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything: ‘{1}’ exists but not ‘{2}’}
     */
    public static String FilePath_validateAntFileMask_portionMatchButPreviousNotMatchAndSuggest(Object arg0, Object arg1, Object arg2) {
        return holder.format("FilePath.validateAntFileMask.portionMatchButPreviousNotMatchAndSuggest", arg0, arg1, arg2);
    }

    /**
     * Key {@code
     * FilePath.validateAntFileMask.portionMatchButPreviousNotMatchAndSuggest}:
     * {@code ‘{0}’ doesn’t match anything: ‘{1}’ exists but not ‘{2}’}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code ‘{0}’ doesn’t match anything: ‘{1}’ exists but not ‘{2}’}
     */
    public static Localizable _FilePath_validateAntFileMask_portionMatchButPreviousNotMatchAndSuggest(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "FilePath.validateAntFileMask.portionMatchButPreviousNotMatchAndSuggest", arg0, arg1, arg2);
    }

    /**
     * Key {@code Util.second}: {@code {0} sec}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} sec}
     */
    public static String Util_second(Object arg0) {
        return holder.format("Util.second", arg0);
    }

    /**
     * Key {@code Util.second}: {@code {0} sec}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} sec}
     */
    public static Localizable _Util_second(Object arg0) {
        return new Localizable(holder, "Util.second", arg0);
    }

    /**
     * Key {@code FilePath.did_not_manage_to_validate_may_be_too_sl}: {@code
     * Did not manage to validate {0} (may be too slow)}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Did not manage to validate {0} (may be too slow)}
     */
    public static String FilePath_did_not_manage_to_validate_may_be_too_sl(Object arg0) {
        return holder.format("FilePath.did_not_manage_to_validate_may_be_too_sl", arg0);
    }

    /**
     * Key {@code FilePath.did_not_manage_to_validate_may_be_too_sl}: {@code
     * Did not manage to validate {0} (may be too slow)}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Did not manage to validate {0} (may be too slow)}
     */
    public static Localizable _FilePath_did_not_manage_to_validate_may_be_too_sl(Object arg0) {
        return new Localizable(holder, "FilePath.did_not_manage_to_validate_may_be_too_sl", arg0);
    }

    /**
     * Key {@code PluginManager.PortNotInRange}: {@code Port doesn’t range
     * from {0} to {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Port doesn’t range from {0} to {1}}
     */
    public static String PluginManager_PortNotInRange(Object arg0, Object arg1) {
        return holder.format("PluginManager.PortNotInRange", arg0, arg1);
    }

    /**
     * Key {@code PluginManager.PortNotInRange}: {@code Port doesn’t range
     * from {0} to {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Port doesn’t range from {0} to {1}}
     */
    public static Localizable _PluginManager_PortNotInRange(Object arg0, Object arg1) {
        return new Localizable(holder, "PluginManager.PortNotInRange", arg0, arg1);
    }

    /**
     * Key {@code FilePath.TildaDoesntWork}: {@code ‘~’ is only supported in
     * a Unix shell and nowhere else.}.
     * 
     * @return
     *     {@code ‘~’ is only supported in a Unix shell and nowhere else.}
     */
    public static String FilePath_TildaDoesntWork() {
        return holder.format("FilePath.TildaDoesntWork");
    }

    /**
     * Key {@code FilePath.TildaDoesntWork}: {@code ‘~’ is only supported in
     * a Unix shell and nowhere else.}.
     * 
     * @return
     *     {@code ‘~’ is only supported in a Unix shell and nowhere else.}
     */
    public static Localizable _FilePath_TildaDoesntWork() {
        return new Localizable(holder, "FilePath.TildaDoesntWork");
    }

    /**
     * Key {@code AboutJenkins.DisplayName}: {@code About Jenkins}.
     * 
     * @return
     *     {@code About Jenkins}
     */
    public static String AboutJenkins_DisplayName() {
        return holder.format("AboutJenkins.DisplayName");
    }

    /**
     * Key {@code AboutJenkins.DisplayName}: {@code About Jenkins}.
     * 
     * @return
     *     {@code About Jenkins}
     */
    public static Localizable _AboutJenkins_DisplayName() {
        return new Localizable(holder, "AboutJenkins.DisplayName");
    }

    /**
     * Key {@code AboutJenkins.Description}: {@code See the version and
     * license information.}.
     * 
     * @return
     *     {@code See the version and license information.}
     */
    public static String AboutJenkins_Description() {
        return holder.format("AboutJenkins.Description");
    }

    /**
     * Key {@code AboutJenkins.Description}: {@code See the version and
     * license information.}.
     * 
     * @return
     *     {@code See the version and license information.}
     */
    public static Localizable _AboutJenkins_Description() {
        return new Localizable(holder, "AboutJenkins.Description");
    }

}
