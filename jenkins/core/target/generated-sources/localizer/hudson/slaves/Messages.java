// CHECKSTYLE:OFF

package hudson.slaves;

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
     * Key {@code DumbSlave.displayName}: {@code Dumb Slave}.
     * 
     * @return
     *     {@code Dumb Slave}
     */
    public static String DumbSlave_displayName() {
        return holder.format("DumbSlave.displayName");
    }

    /**
     * Key {@code DumbSlave.displayName}: {@code Dumb Slave}.
     * 
     * @return
     *     {@code Dumb Slave}
     */
    public static Localizable _DumbSlave_displayName() {
        return new Localizable(holder, "DumbSlave.displayName");
    }

    /**
     * Key {@code EnvironmentVariablesNodeProperty.displayName}: {@code
     * Environment variables}.
     * 
     * @return
     *     {@code Environment variables}
     */
    public static String EnvironmentVariablesNodeProperty_displayName() {
        return holder.format("EnvironmentVariablesNodeProperty.displayName");
    }

    /**
     * Key {@code EnvironmentVariablesNodeProperty.displayName}: {@code
     * Environment variables}.
     * 
     * @return
     *     {@code Environment variables}
     */
    public static Localizable _EnvironmentVariablesNodeProperty_displayName() {
        return new Localizable(holder, "EnvironmentVariablesNodeProperty.displayName");
    }

    /**
     * Key {@code RetentionStrategy.Demand.OfflineIdle}: {@code Offline
     * because computer was idle; it will be relaunched when needed.}.
     * 
     * @return
     *     {@code Offline because computer was idle; it will be relaunched when
     *     needed.}
     */
    public static String RetentionStrategy_Demand_OfflineIdle() {
        return holder.format("RetentionStrategy.Demand.OfflineIdle");
    }

    /**
     * Key {@code RetentionStrategy.Demand.OfflineIdle}: {@code Offline
     * because computer was idle; it will be relaunched when needed.}.
     * 
     * @return
     *     {@code Offline because computer was idle; it will be relaunched when
     *     needed.}
     */
    public static Localizable _RetentionStrategy_Demand_OfflineIdle() {
        return new Localizable(holder, "RetentionStrategy.Demand.OfflineIdle");
    }

    /**
     * Key {@code JNLPLauncher.displayName}: {@code Launch slave agents via
     * Java Web Start}.
     * 
     * @return
     *     {@code Launch slave agents via Java Web Start}
     */
    public static String JNLPLauncher_displayName() {
        return holder.format("JNLPLauncher.displayName");
    }

    /**
     * Key {@code JNLPLauncher.displayName}: {@code Launch slave agents via
     * Java Web Start}.
     * 
     * @return
     *     {@code Launch slave agents via Java Web Start}
     */
    public static Localizable _JNLPLauncher_displayName() {
        return new Localizable(holder, "JNLPLauncher.displayName");
    }

    /**
     * Key {@code ComputerLauncher.UknownJavaVersion}: {@code Couldn’t figure
     * out the Java version of {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Couldn’t figure out the Java version of {0}}
     */
    public static String ComputerLauncher_UknownJavaVersion(Object arg0) {
        return holder.format("ComputerLauncher.UknownJavaVersion", arg0);
    }

    /**
     * Key {@code ComputerLauncher.UknownJavaVersion}: {@code Couldn’t figure
     * out the Java version of {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Couldn’t figure out the Java version of {0}}
     */
    public static Localizable _ComputerLauncher_UknownJavaVersion(Object arg0) {
        return new Localizable(holder, "ComputerLauncher.UknownJavaVersion", arg0);
    }

    /**
     * Key {@code ComputerLauncher.abortedLaunch}: {@code Launching slave
     * process aborted.}.
     * 
     * @return
     *     {@code Launching slave process aborted.}
     */
    public static String ComputerLauncher_abortedLaunch() {
        return holder.format("ComputerLauncher.abortedLaunch");
    }

    /**
     * Key {@code ComputerLauncher.abortedLaunch}: {@code Launching slave
     * process aborted.}.
     * 
     * @return
     *     {@code Launching slave process aborted.}
     */
    public static Localizable _ComputerLauncher_abortedLaunch() {
        return new Localizable(holder, "ComputerLauncher.abortedLaunch");
    }

    /**
     * Key {@code SimpleScheduledRetentionStrategy.FinishedUpTime}: {@code
     * Computer has finished its scheduled uptime}.
     * 
     * @return
     *     {@code Computer has finished its scheduled uptime}
     */
    public static String SimpleScheduledRetentionStrategy_FinishedUpTime() {
        return holder.format("SimpleScheduledRetentionStrategy.FinishedUpTime");
    }

    /**
     * Key {@code SimpleScheduledRetentionStrategy.FinishedUpTime}: {@code
     * Computer has finished its scheduled uptime}.
     * 
     * @return
     *     {@code Computer has finished its scheduled uptime}
     */
    public static Localizable _SimpleScheduledRetentionStrategy_FinishedUpTime() {
        return new Localizable(holder, "SimpleScheduledRetentionStrategy.FinishedUpTime");
    }

    /**
     * Key {@code NodeDescripter.CheckName.Mandatory}: {@code Name is
     * mandatory}.
     * 
     * @return
     *     {@code Name is mandatory}
     */
    public static String NodeDescripter_CheckName_Mandatory() {
        return holder.format("NodeDescripter.CheckName.Mandatory");
    }

    /**
     * Key {@code NodeDescripter.CheckName.Mandatory}: {@code Name is
     * mandatory}.
     * 
     * @return
     *     {@code Name is mandatory}
     */
    public static Localizable _NodeDescripter_CheckName_Mandatory() {
        return new Localizable(holder, "NodeDescripter.CheckName.Mandatory");
    }

    /**
     * Key {@code NodeProvisioner.EmptyString}: {@code }.
     * 
     * @return
     *     {@code }
     */
    public static String NodeProvisioner_EmptyString() {
        return holder.format("NodeProvisioner.EmptyString");
    }

    /**
     * Key {@code NodeProvisioner.EmptyString}: {@code }.
     * 
     * @return
     *     {@code }
     */
    public static Localizable _NodeProvisioner_EmptyString() {
        return new Localizable(holder, "NodeProvisioner.EmptyString");
    }

    /**
     * Key {@code ComputerLauncher.unexpectedError}: {@code Unexpected error
     * in launching a slave. This is probably a bug in Jenkins}.
     * 
     * @return
     *     {@code Unexpected error in launching a slave. This is probably a bug
     *     in Jenkins}
     */
    public static String ComputerLauncher_unexpectedError() {
        return holder.format("ComputerLauncher.unexpectedError");
    }

    /**
     * Key {@code ComputerLauncher.unexpectedError}: {@code Unexpected error
     * in launching a slave. This is probably a bug in Jenkins}.
     * 
     * @return
     *     {@code Unexpected error in launching a slave. This is probably a bug
     *     in Jenkins}
     */
    public static Localizable _ComputerLauncher_unexpectedError() {
        return new Localizable(holder, "ComputerLauncher.unexpectedError");
    }

    /**
     * Key {@code SimpleScheduledRetentionStrategy.displayName}: {@code Take
     * this slave on-line according to a schedule}.
     * 
     * @return
     *     {@code Take this slave on-line according to a schedule}
     */
    public static String SimpleScheduledRetentionStrategy_displayName() {
        return holder.format("SimpleScheduledRetentionStrategy.displayName");
    }

    /**
     * Key {@code SimpleScheduledRetentionStrategy.displayName}: {@code Take
     * this slave on-line according to a schedule}.
     * 
     * @return
     *     {@code Take this slave on-line according to a schedule}
     */
    public static Localizable _SimpleScheduledRetentionStrategy_displayName() {
        return new Localizable(holder, "SimpleScheduledRetentionStrategy.displayName");
    }

    /**
     * Key {@code ConnectionActivityMonitor.OfflineCause}: {@code Repeated
     * ping attempts failed}.
     * 
     * @return
     *     {@code Repeated ping attempts failed}
     */
    public static String ConnectionActivityMonitor_OfflineCause() {
        return holder.format("ConnectionActivityMonitor.OfflineCause");
    }

    /**
     * Key {@code ConnectionActivityMonitor.OfflineCause}: {@code Repeated
     * ping attempts failed}.
     * 
     * @return
     *     {@code Repeated ping attempts failed}
     */
    public static Localizable _ConnectionActivityMonitor_OfflineCause() {
        return new Localizable(holder, "ConnectionActivityMonitor.OfflineCause");
    }

    /**
     * Key {@code CommandLauncher.displayName}: {@code Launch slave via
     * execution of command on the Master}.
     * 
     * @return
     *     {@code Launch slave via execution of command on the Master}
     */
    public static String CommandLauncher_displayName() {
        return holder.format("CommandLauncher.displayName");
    }

    /**
     * Key {@code CommandLauncher.displayName}: {@code Launch slave via
     * execution of command on the Master}.
     * 
     * @return
     *     {@code Launch slave via execution of command on the Master}
     */
    public static Localizable _CommandLauncher_displayName() {
        return new Localizable(holder, "CommandLauncher.displayName");
    }

    /**
     * Key {@code OfflineCause.connection_was_broken_}: {@code Connection was
     * broken: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Connection was broken: {0}}
     */
    public static String OfflineCause_connection_was_broken_(Object arg0) {
        return holder.format("OfflineCause.connection_was_broken_", arg0);
    }

    /**
     * Key {@code OfflineCause.connection_was_broken_}: {@code Connection was
     * broken: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Connection was broken: {0}}
     */
    public static Localizable _OfflineCause_connection_was_broken_(Object arg0) {
        return new Localizable(holder, "OfflineCause.connection_was_broken_", arg0);
    }

    /**
     * Key {@code ComputerLauncher.JavaVersionResult}: {@code {0} -version
     * returned {1}.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} -version returned {1}.}
     */
    public static String ComputerLauncher_JavaVersionResult(Object arg0, Object arg1) {
        return holder.format("ComputerLauncher.JavaVersionResult", arg0, arg1);
    }

    /**
     * Key {@code ComputerLauncher.JavaVersionResult}: {@code {0} -version
     * returned {1}.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} -version returned {1}.}
     */
    public static Localizable _ComputerLauncher_JavaVersionResult(Object arg0, Object arg1) {
        return new Localizable(holder, "ComputerLauncher.JavaVersionResult", arg0, arg1);
    }

    /**
     * Key {@code SlaveComputer.DisconnectedBy}: {@code Disconnected by
     * {0}{1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Disconnected by {0}{1}}
     */
    public static String SlaveComputer_DisconnectedBy(Object arg0, Object arg1) {
        return holder.format("SlaveComputer.DisconnectedBy", arg0, arg1);
    }

    /**
     * Key {@code SlaveComputer.DisconnectedBy}: {@code Disconnected by
     * {0}{1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Disconnected by {0}{1}}
     */
    public static Localizable _SlaveComputer_DisconnectedBy(Object arg0, Object arg1) {
        return new Localizable(holder, "SlaveComputer.DisconnectedBy", arg0, arg1);
    }

    /**
     * Key {@code ComputerLauncher.NoJavaFound}: {@code Java version {0} was
     * found but 1.6 or later is needed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Java version {0} was found but 1.6 or later is needed.}
     */
    public static String ComputerLauncher_NoJavaFound(Object arg0) {
        return holder.format("ComputerLauncher.NoJavaFound", arg0);
    }

    /**
     * Key {@code ComputerLauncher.NoJavaFound}: {@code Java version {0} was
     * found but 1.6 or later is needed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Java version {0} was found but 1.6 or later is needed.}
     */
    public static Localizable _ComputerLauncher_NoJavaFound(Object arg0) {
        return new Localizable(holder, "ComputerLauncher.NoJavaFound", arg0);
    }

    /**
     * Key {@code CommandLauncher.NoLaunchCommand}: {@code No launch command
     * specified}.
     * 
     * @return
     *     {@code No launch command specified}
     */
    public static String CommandLauncher_NoLaunchCommand() {
        return holder.format("CommandLauncher.NoLaunchCommand");
    }

    /**
     * Key {@code CommandLauncher.NoLaunchCommand}: {@code No launch command
     * specified}.
     * 
     * @return
     *     {@code No launch command specified}
     */
    public static Localizable _CommandLauncher_NoLaunchCommand() {
        return new Localizable(holder, "CommandLauncher.NoLaunchCommand");
    }

    /**
     * Key {@code RetentionStrategy.Always.displayName}: {@code Keep this
     * slave on-line as much as possible}.
     * 
     * @return
     *     {@code Keep this slave on-line as much as possible}
     */
    public static String RetentionStrategy_Always_displayName() {
        return holder.format("RetentionStrategy.Always.displayName");
    }

    /**
     * Key {@code RetentionStrategy.Always.displayName}: {@code Keep this
     * slave on-line as much as possible}.
     * 
     * @return
     *     {@code Keep this slave on-line as much as possible}
     */
    public static Localizable _RetentionStrategy_Always_displayName() {
        return new Localizable(holder, "RetentionStrategy.Always.displayName");
    }

    /**
     * Key {@code RetentionStrategy.Demand.displayName}: {@code Take this
     * slave on-line when in demand and off-line when idle}.
     * 
     * @return
     *     {@code Take this slave on-line when in demand and off-line when idle}
     */
    public static String RetentionStrategy_Demand_displayName() {
        return holder.format("RetentionStrategy.Demand.displayName");
    }

    /**
     * Key {@code RetentionStrategy.Demand.displayName}: {@code Take this
     * slave on-line when in demand and off-line when idle}.
     * 
     * @return
     *     {@code Take this slave on-line when in demand and off-line when idle}
     */
    public static Localizable _RetentionStrategy_Demand_displayName() {
        return new Localizable(holder, "RetentionStrategy.Demand.displayName");
    }

    /**
     * Key {@code OfflineCause.LaunchFailed}: {@code This node is offline
     * because Jenkins failed to launch the slave agent on it.}.
     * 
     * @return
     *     {@code This node is offline because Jenkins failed to launch the slave
     *     agent on it.}
     */
    public static String OfflineCause_LaunchFailed() {
        return holder.format("OfflineCause.LaunchFailed");
    }

    /**
     * Key {@code OfflineCause.LaunchFailed}: {@code This node is offline
     * because Jenkins failed to launch the slave agent on it.}.
     * 
     * @return
     *     {@code This node is offline because Jenkins failed to launch the slave
     *     agent on it.}
     */
    public static Localizable _OfflineCause_LaunchFailed() {
        return new Localizable(holder, "OfflineCause.LaunchFailed");
    }

}
