// CHECKSTYLE:OFF

package hudson.cli;

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
     * Key {@code BuildCommand.ShortDescription}: {@code Builds a job, and
     * optionally waits until its completion.}.
     * 
     * @return
     *     {@code Builds a job, and optionally waits until its completion.}
     */
    public static String BuildCommand_ShortDescription() {
        return holder.format("BuildCommand.ShortDescription");
    }

    /**
     * Key {@code BuildCommand.ShortDescription}: {@code Builds a job, and
     * optionally waits until its completion.}.
     * 
     * @return
     *     {@code Builds a job, and optionally waits until its completion.}
     */
    public static Localizable _BuildCommand_ShortDescription() {
        return new Localizable(holder, "BuildCommand.ShortDescription");
    }

    /**
     * Key {@code LoginCommand.ShortDescription}: {@code Saves the current
     * credential to allow future commands to run without explicit credential
     * information.}.
     * 
     * @return
     *     {@code Saves the current credential to allow future commands to run
     *     without explicit credential information.}
     */
    public static String LoginCommand_ShortDescription() {
        return holder.format("LoginCommand.ShortDescription");
    }

    /**
     * Key {@code LoginCommand.ShortDescription}: {@code Saves the current
     * credential to allow future commands to run without explicit credential
     * information.}.
     * 
     * @return
     *     {@code Saves the current credential to allow future commands to run
     *     without explicit credential information.}
     */
    public static Localizable _LoginCommand_ShortDescription() {
        return new Localizable(holder, "LoginCommand.ShortDescription");
    }

    /**
     * Key {@code GetNodeCommand.ShortDescription}: {@code Dumps the node
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the node definition XML to stdout.}
     */
    public static String GetNodeCommand_ShortDescription() {
        return holder.format("GetNodeCommand.ShortDescription");
    }

    /**
     * Key {@code GetNodeCommand.ShortDescription}: {@code Dumps the node
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the node definition XML to stdout.}
     */
    public static Localizable _GetNodeCommand_ShortDescription() {
        return new Localizable(holder, "GetNodeCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteBuildsCommand.ShortDescription}: {@code Deletes build
     * record(s).}.
     * 
     * @return
     *     {@code Deletes build record(s).}
     */
    public static String DeleteBuildsCommand_ShortDescription() {
        return holder.format("DeleteBuildsCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteBuildsCommand.ShortDescription}: {@code Deletes build
     * record(s).}.
     * 
     * @return
     *     {@code Deletes build record(s).}
     */
    public static Localizable _DeleteBuildsCommand_ShortDescription() {
        return new Localizable(holder, "DeleteBuildsCommand.ShortDescription");
    }

    /**
     * Key {@code CopyJobCommand.ShortDescription}: {@code Copies a job.}.
     * 
     * @return
     *     {@code Copies a job.}
     */
    public static String CopyJobCommand_ShortDescription() {
        return holder.format("CopyJobCommand.ShortDescription");
    }

    /**
     * Key {@code CopyJobCommand.ShortDescription}: {@code Copies a job.}.
     * 
     * @return
     *     {@code Copies a job.}
     */
    public static Localizable _CopyJobCommand_ShortDescription() {
        return new Localizable(holder, "CopyJobCommand.ShortDescription");
    }

    /**
     * Key {@code MailCommand.ShortDescription}: {@code Reads stdin and sends
     * that out as an e-mail.}.
     * 
     * @return
     *     {@code Reads stdin and sends that out as an e-mail.}
     */
    public static String MailCommand_ShortDescription() {
        return holder.format("MailCommand.ShortDescription");
    }

    /**
     * Key {@code MailCommand.ShortDescription}: {@code Reads stdin and sends
     * that out as an e-mail.}.
     * 
     * @return
     *     {@code Reads stdin and sends that out as an e-mail.}
     */
    public static Localizable _MailCommand_ShortDescription() {
        return new Localizable(holder, "MailCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.ShortDescription}: {@code Installs a
     * plugin either from a file, an URL, or from update center. }.
     * 
     * @return
     *     {@code Installs a plugin either from a file, an URL, or from update
     *     center. }
     */
    public static String InstallPluginCommand_ShortDescription() {
        return holder.format("InstallPluginCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.ShortDescription}: {@code Installs a
     * plugin either from a file, an URL, or from update center. }.
     * 
     * @return
     *     {@code Installs a plugin either from a file, an URL, or from update
     *     center. }
     */
    public static Localizable _InstallPluginCommand_ShortDescription() {
        return new Localizable(holder, "InstallPluginCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.DidYouMean}: {@code {0} looks like a
     * short plugin name. Did you mean ‘{1}’?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} looks like a short plugin name. Did you mean ‘{1}’?}
     */
    public static String InstallPluginCommand_DidYouMean(Object arg0, Object arg1) {
        return holder.format("InstallPluginCommand.DidYouMean", arg0, arg1);
    }

    /**
     * Key {@code InstallPluginCommand.DidYouMean}: {@code {0} looks like a
     * short plugin name. Did you mean ‘{1}’?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} looks like a short plugin name. Did you mean ‘{1}’?}
     */
    public static Localizable _InstallPluginCommand_DidYouMean(Object arg0, Object arg1) {
        return new Localizable(holder, "InstallPluginCommand.DidYouMean", arg0, arg1);
    }

    /**
     * Key {@code BuildCommand.CLICause.ShortDescription}: {@code Started
     * from command line by {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Started from command line by {0}}
     */
    public static String BuildCommand_CLICause_ShortDescription(Object arg0) {
        return holder.format("BuildCommand.CLICause.ShortDescription", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.ShortDescription}: {@code Started
     * from command line by {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Started from command line by {0}}
     */
    public static Localizable _BuildCommand_CLICause_ShortDescription(Object arg0) {
        return new Localizable(holder, "BuildCommand.CLICause.ShortDescription", arg0);
    }

    /**
     * Key {@code GetJobCommand.ShortDescription}: {@code Dumps the job
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the job definition XML to stdout.}
     */
    public static String GetJobCommand_ShortDescription() {
        return holder.format("GetJobCommand.ShortDescription");
    }

    /**
     * Key {@code GetJobCommand.ShortDescription}: {@code Dumps the job
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the job definition XML to stdout.}
     */
    public static Localizable _GetJobCommand_ShortDescription() {
        return new Localizable(holder, "GetJobCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.NoUpdateCenterDefined}: {@code Note
     * that no update center is defined in this Jenkins.}.
     * 
     * @return
     *     {@code Note that no update center is defined in this Jenkins.}
     */
    public static String InstallPluginCommand_NoUpdateCenterDefined() {
        return holder.format("InstallPluginCommand.NoUpdateCenterDefined");
    }

    /**
     * Key {@code InstallPluginCommand.NoUpdateCenterDefined}: {@code Note
     * that no update center is defined in this Jenkins.}.
     * 
     * @return
     *     {@code Note that no update center is defined in this Jenkins.}
     */
    public static Localizable _InstallPluginCommand_NoUpdateCenterDefined() {
        return new Localizable(holder, "InstallPluginCommand.NoUpdateCenterDefined");
    }

    /**
     * Key {@code InstallToolCommand.ShortDescription}: {@code Performs
     * automatic tool installation, and print its location to stdout. Can be
     * only called from inside a build.}.
     * 
     * @return
     *     {@code Performs automatic tool installation, and print its location to
     *     stdout. Can be only called from inside a build.}
     */
    public static String InstallToolCommand_ShortDescription() {
        return holder.format("InstallToolCommand.ShortDescription");
    }

    /**
     * Key {@code InstallToolCommand.ShortDescription}: {@code Performs
     * automatic tool installation, and print its location to stdout. Can be
     * only called from inside a build.}.
     * 
     * @return
     *     {@code Performs automatic tool installation, and print its location to
     *     stdout. Can be only called from inside a build.}
     */
    public static Localizable _InstallToolCommand_ShortDescription() {
        return new Localizable(holder, "InstallToolCommand.ShortDescription");
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildConfigNotSaved}: {@code
     * Cannot build {0} because its configuration has not been saved.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} because its configuration has not been saved.}
     */
    public static String BuildCommand_CLICause_CannotBuildConfigNotSaved(Object arg0) {
        return holder.format("BuildCommand.CLICause.CannotBuildConfigNotSaved", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildConfigNotSaved}: {@code
     * Cannot build {0} because its configuration has not been saved.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} because its configuration has not been saved.}
     */
    public static Localizable _BuildCommand_CLICause_CannotBuildConfigNotSaved(Object arg0) {
        return new Localizable(holder, "BuildCommand.CLICause.CannotBuildConfigNotSaved", arg0);
    }

    /**
     * Key {@code SessionIdCommand.ShortDescription}: {@code Outputs the
     * session ID, which changes every time Jenkins restarts.}.
     * 
     * @return
     *     {@code Outputs the session ID, which changes every time Jenkins
     *     restarts.}
     */
    public static String SessionIdCommand_ShortDescription() {
        return holder.format("SessionIdCommand.ShortDescription");
    }

    /**
     * Key {@code SessionIdCommand.ShortDescription}: {@code Outputs the
     * session ID, which changes every time Jenkins restarts.}.
     * 
     * @return
     *     {@code Outputs the session ID, which changes every time Jenkins
     *     restarts.}
     */
    public static Localizable _SessionIdCommand_ShortDescription() {
        return new Localizable(holder, "SessionIdCommand.ShortDescription");
    }

    /**
     * Key {@code CreateNodeCommand.ShortDescription}: {@code Creates a new
     * node by reading stdin as a XML configuration.}.
     * 
     * @return
     *     {@code Creates a new node by reading stdin as a XML configuration.}
     */
    public static String CreateNodeCommand_ShortDescription() {
        return holder.format("CreateNodeCommand.ShortDescription");
    }

    /**
     * Key {@code CreateNodeCommand.ShortDescription}: {@code Creates a new
     * node by reading stdin as a XML configuration.}.
     * 
     * @return
     *     {@code Creates a new node by reading stdin as a XML configuration.}
     */
    public static Localizable _CreateNodeCommand_ShortDescription() {
        return new Localizable(holder, "CreateNodeCommand.ShortDescription");
    }

    /**
     * Key {@code CreateJobCommand.ShortDescription}: {@code Creates a new
     * job by reading stdin as a configuration XML file.}.
     * 
     * @return
     *     {@code Creates a new job by reading stdin as a configuration XML
     *     file.}
     */
    public static String CreateJobCommand_ShortDescription() {
        return holder.format("CreateJobCommand.ShortDescription");
    }

    /**
     * Key {@code CreateJobCommand.ShortDescription}: {@code Creates a new
     * job by reading stdin as a configuration XML file.}.
     * 
     * @return
     *     {@code Creates a new job by reading stdin as a configuration XML
     *     file.}
     */
    public static Localizable _CreateJobCommand_ShortDescription() {
        return new Localizable(holder, "CreateJobCommand.ShortDescription");
    }

    /**
     * Key {@code HelpCommand.ShortDescription}: {@code Lists all the
     * available commands or a detailed description of single command.}.
     * 
     * @return
     *     {@code Lists all the available commands or a detailed description of
     *     single command.}
     */
    public static String HelpCommand_ShortDescription() {
        return holder.format("HelpCommand.ShortDescription");
    }

    /**
     * Key {@code HelpCommand.ShortDescription}: {@code Lists all the
     * available commands or a detailed description of single command.}.
     * 
     * @return
     *     {@code Lists all the available commands or a detailed description of
     *     single command.}
     */
    public static Localizable _HelpCommand_ShortDescription() {
        return new Localizable(holder, "HelpCommand.ShortDescription");
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildDisabled}: {@code Cannot
     * build {0} because it is disabled.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} because it is disabled.}
     */
    public static String BuildCommand_CLICause_CannotBuildDisabled(Object arg0) {
        return holder.format("BuildCommand.CLICause.CannotBuildDisabled", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildDisabled}: {@code Cannot
     * build {0} because it is disabled.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} because it is disabled.}
     */
    public static Localizable _BuildCommand_CLICause_CannotBuildDisabled(Object arg0) {
        return new Localizable(holder, "BuildCommand.CLICause.CannotBuildDisabled", arg0);
    }

    /**
     * Key {@code UpdateViewCommand.ShortDescription}: {@code Updates the
     * view definition XML from stdin. The opposite of the get-view
     * command.}.
     * 
     * @return
     *     {@code Updates the view definition XML from stdin. The opposite of the
     *     get-view command.}
     */
    public static String UpdateViewCommand_ShortDescription() {
        return holder.format("UpdateViewCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateViewCommand.ShortDescription}: {@code Updates the
     * view definition XML from stdin. The opposite of the get-view
     * command.}.
     * 
     * @return
     *     {@code Updates the view definition XML from stdin. The opposite of the
     *     get-view command.}
     */
    public static Localizable _UpdateViewCommand_ShortDescription() {
        return new Localizable(holder, "UpdateViewCommand.ShortDescription");
    }

    /**
     * Key {@code WhoAmICommand.ShortDescription}: {@code Reports your
     * credential and permissions.}.
     * 
     * @return
     *     {@code Reports your credential and permissions.}
     */
    public static String WhoAmICommand_ShortDescription() {
        return holder.format("WhoAmICommand.ShortDescription");
    }

    /**
     * Key {@code WhoAmICommand.ShortDescription}: {@code Reports your
     * credential and permissions.}.
     * 
     * @return
     *     {@code Reports your credential and permissions.}
     */
    public static Localizable _WhoAmICommand_ShortDescription() {
        return new Localizable(holder, "WhoAmICommand.ShortDescription");
    }

    /**
     * Key {@code AddJobToViewCommand.ShortDescription}: {@code Adds jobs to
     * view.}.
     * 
     * @return
     *     {@code Adds jobs to view.}
     */
    public static String AddJobToViewCommand_ShortDescription() {
        return holder.format("AddJobToViewCommand.ShortDescription");
    }

    /**
     * Key {@code AddJobToViewCommand.ShortDescription}: {@code Adds jobs to
     * view.}.
     * 
     * @return
     *     {@code Adds jobs to view.}
     */
    public static Localizable _AddJobToViewCommand_ShortDescription() {
        return new Localizable(holder, "AddJobToViewCommand.ShortDescription");
    }

    /**
     * Key {@code VersionCommand.ShortDescription}: {@code Outputs the
     * current version.}.
     * 
     * @return
     *     {@code Outputs the current version.}
     */
    public static String VersionCommand_ShortDescription() {
        return holder.format("VersionCommand.ShortDescription");
    }

    /**
     * Key {@code VersionCommand.ShortDescription}: {@code Outputs the
     * current version.}.
     * 
     * @return
     *     {@code Outputs the current version.}
     */
    public static Localizable _VersionCommand_ShortDescription() {
        return new Localizable(holder, "VersionCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteViewCommand.ShortDescription}: {@code Deletes view.}.
     * 
     * @return
     *     {@code Deletes view.}
     */
    public static String DeleteViewCommand_ShortDescription() {
        return holder.format("DeleteViewCommand.ShortDescription");
    }

    /**
     * Key {@code DeleteViewCommand.ShortDescription}: {@code Deletes view.}.
     * 
     * @return
     *     {@code Deletes view.}
     */
    public static Localizable _DeleteViewCommand_ShortDescription() {
        return new Localizable(holder, "DeleteViewCommand.ShortDescription");
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildUnknownReasons}: {@code
     * Cannot build {0} for unknown reasons.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} for unknown reasons.}
     */
    public static String BuildCommand_CLICause_CannotBuildUnknownReasons(Object arg0) {
        return holder.format("BuildCommand.CLICause.CannotBuildUnknownReasons", arg0);
    }

    /**
     * Key {@code BuildCommand.CLICause.CannotBuildUnknownReasons}: {@code
     * Cannot build {0} for unknown reasons.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot build {0} for unknown reasons.}
     */
    public static Localizable _BuildCommand_CLICause_CannotBuildUnknownReasons(Object arg0) {
        return new Localizable(holder, "BuildCommand.CLICause.CannotBuildUnknownReasons", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.NotAValidSourceName}: {@code {0} is
     * neither a valid file, URL, nor a plugin artifact name in the update
     * center}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is neither a valid file, URL, nor a plugin artifact name in
     *     the update center}
     */
    public static String InstallPluginCommand_NotAValidSourceName(Object arg0) {
        return holder.format("InstallPluginCommand.NotAValidSourceName", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.NotAValidSourceName}: {@code {0} is
     * neither a valid file, URL, nor a plugin artifact name in the update
     * center}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is neither a valid file, URL, nor a plugin artifact name in
     *     the update center}
     */
    public static Localizable _InstallPluginCommand_NotAValidSourceName(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.NotAValidSourceName", arg0);
    }

    /**
     * Key {@code RemoveJobFromViewCommand.ShortDescription}: {@code Removes
     * jobs from view.}.
     * 
     * @return
     *     {@code Removes jobs from view.}
     */
    public static String RemoveJobFromViewCommand_ShortDescription() {
        return holder.format("RemoveJobFromViewCommand.ShortDescription");
    }

    /**
     * Key {@code RemoveJobFromViewCommand.ShortDescription}: {@code Removes
     * jobs from view.}.
     * 
     * @return
     *     {@code Removes jobs from view.}
     */
    public static Localizable _RemoveJobFromViewCommand_ShortDescription() {
        return new Localizable(holder, "RemoveJobFromViewCommand.ShortDescription");
    }

    /**
     * Key {@code GetViewCommand.ShortDescription}: {@code Dumps the view
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the view definition XML to stdout.}
     */
    public static String GetViewCommand_ShortDescription() {
        return holder.format("GetViewCommand.ShortDescription");
    }

    /**
     * Key {@code GetViewCommand.ShortDescription}: {@code Dumps the view
     * definition XML to stdout.}.
     * 
     * @return
     *     {@code Dumps the view definition XML to stdout.}
     */
    public static Localizable _GetViewCommand_ShortDescription() {
        return new Localizable(holder, "GetViewCommand.ShortDescription");
    }

    /**
     * Key {@code LogoutCommand.ShortDescription}: {@code Deletes the
     * credential stored with the login command. }.
     * 
     * @return
     *     {@code Deletes the credential stored with the login command. }
     */
    public static String LogoutCommand_ShortDescription() {
        return holder.format("LogoutCommand.ShortDescription");
    }

    /**
     * Key {@code LogoutCommand.ShortDescription}: {@code Deletes the
     * credential stored with the login command. }.
     * 
     * @return
     *     {@code Deletes the credential stored with the login command. }
     */
    public static Localizable _LogoutCommand_ShortDescription() {
        return new Localizable(holder, "LogoutCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateJobCommand.ShortDescription}: {@code Updates the job
     * definition XML from stdin. The opposite of the get-job command.}.
     * 
     * @return
     *     {@code Updates the job definition XML from stdin. The opposite of the
     *     get-job command.}
     */
    public static String UpdateJobCommand_ShortDescription() {
        return holder.format("UpdateJobCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateJobCommand.ShortDescription}: {@code Updates the job
     * definition XML from stdin. The opposite of the get-job command.}.
     * 
     * @return
     *     {@code Updates the job definition XML from stdin. The opposite of the
     *     get-job command.}
     */
    public static Localizable _UpdateJobCommand_ShortDescription() {
        return new Localizable(holder, "UpdateJobCommand.ShortDescription");
    }

    /**
     * Key {@code GroovyshCommand.ShortDescription}: {@code Runs an
     * interactive groovy shell.}.
     * 
     * @return
     *     {@code Runs an interactive groovy shell.}
     */
    public static String GroovyshCommand_ShortDescription() {
        return holder.format("GroovyshCommand.ShortDescription");
    }

    /**
     * Key {@code GroovyshCommand.ShortDescription}: {@code Runs an
     * interactive groovy shell.}.
     * 
     * @return
     *     {@code Runs an interactive groovy shell.}
     */
    public static Localizable _GroovyshCommand_ShortDescription() {
        return new Localizable(holder, "GroovyshCommand.ShortDescription");
    }

    /**
     * Key {@code ConsoleCommand.ShortDescription}: {@code Retrieves console
     * output of a build.}.
     * 
     * @return
     *     {@code Retrieves console output of a build.}
     */
    public static String ConsoleCommand_ShortDescription() {
        return holder.format("ConsoleCommand.ShortDescription");
    }

    /**
     * Key {@code ConsoleCommand.ShortDescription}: {@code Retrieves console
     * output of a build.}.
     * 
     * @return
     *     {@code Retrieves console output of a build.}
     */
    public static Localizable _ConsoleCommand_ShortDescription() {
        return new Localizable(holder, "ConsoleCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.NoUpdateDataRetrieved}: {@code No
     * update center data is retrieved yet from: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No update center data is retrieved yet from: {0}}
     */
    public static String InstallPluginCommand_NoUpdateDataRetrieved(Object arg0) {
        return holder.format("InstallPluginCommand.NoUpdateDataRetrieved", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.NoUpdateDataRetrieved}: {@code No
     * update center data is retrieved yet from: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No update center data is retrieved yet from: {0}}
     */
    public static Localizable _InstallPluginCommand_NoUpdateDataRetrieved(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.NoUpdateDataRetrieved", arg0);
    }

    /**
     * Key {@code SetBuildDisplayNameCommand.ShortDescription}: {@code Sets
     * the displayName of a build.}.
     * 
     * @return
     *     {@code Sets the displayName of a build.}
     */
    public static String SetBuildDisplayNameCommand_ShortDescription() {
        return holder.format("SetBuildDisplayNameCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildDisplayNameCommand.ShortDescription}: {@code Sets
     * the displayName of a build.}.
     * 
     * @return
     *     {@code Sets the displayName of a build.}
     */
    public static Localizable _SetBuildDisplayNameCommand_ShortDescription() {
        return new Localizable(holder, "SetBuildDisplayNameCommand.ShortDescription");
    }

    /**
     * Key {@code ListPluginsCommand.ShortDescription}: {@code Outputs a list
     * of installed plugins.}.
     * 
     * @return
     *     {@code Outputs a list of installed plugins.}
     */
    public static String ListPluginsCommand_ShortDescription() {
        return holder.format("ListPluginsCommand.ShortDescription");
    }

    /**
     * Key {@code ListPluginsCommand.ShortDescription}: {@code Outputs a list
     * of installed plugins.}.
     * 
     * @return
     *     {@code Outputs a list of installed plugins.}
     */
    public static Localizable _ListPluginsCommand_ShortDescription() {
        return new Localizable(holder, "ListPluginsCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromUrl}: {@code
     * Installing a plugin from {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing a plugin from {0}}
     */
    public static String InstallPluginCommand_InstallingPluginFromUrl(Object arg0) {
        return holder.format("InstallPluginCommand.InstallingPluginFromUrl", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromUrl}: {@code
     * Installing a plugin from {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing a plugin from {0}}
     */
    public static Localizable _InstallPluginCommand_InstallingPluginFromUrl(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.InstallingPluginFromUrl", arg0);
    }

    /**
     * Key {@code SetBuildParameterCommand.ShortDescription}: {@code
     * Update/set the build parameter of the current build in progress.}.
     * 
     * @return
     *     {@code Update/set the build parameter of the current build in
     *     progress.}
     */
    public static String SetBuildParameterCommand_ShortDescription() {
        return holder.format("SetBuildParameterCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildParameterCommand.ShortDescription}: {@code
     * Update/set the build parameter of the current build in progress.}.
     * 
     * @return
     *     {@code Update/set the build parameter of the current build in
     *     progress.}
     */
    public static Localizable _SetBuildParameterCommand_ShortDescription() {
        return new Localizable(holder, "SetBuildParameterCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildDescriptionCommand.ShortDescription}: {@code Sets
     * the description of a build.}.
     * 
     * @return
     *     {@code Sets the description of a build.}
     */
    public static String SetBuildDescriptionCommand_ShortDescription() {
        return holder.format("SetBuildDescriptionCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildDescriptionCommand.ShortDescription}: {@code Sets
     * the description of a build.}.
     * 
     * @return
     *     {@code Sets the description of a build.}
     */
    public static Localizable _SetBuildDescriptionCommand_ShortDescription() {
        return new Localizable(holder, "SetBuildDescriptionCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromLocalFile}: {@code
     * Installing a plugin from local file: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing a plugin from local file: {0}}
     */
    public static String InstallPluginCommand_InstallingPluginFromLocalFile(Object arg0) {
        return holder.format("InstallPluginCommand.InstallingPluginFromLocalFile", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.InstallingPluginFromLocalFile}: {@code
     * Installing a plugin from local file: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing a plugin from local file: {0}}
     */
    public static Localizable _InstallPluginCommand_InstallingPluginFromLocalFile(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.InstallingPluginFromLocalFile", arg0);
    }

    /**
     * Key {@code GroovyCommand.ShortDescription}: {@code Executes the
     * specified Groovy script. }.
     * 
     * @return
     *     {@code Executes the specified Groovy script. }
     */
    public static String GroovyCommand_ShortDescription() {
        return holder.format("GroovyCommand.ShortDescription");
    }

    /**
     * Key {@code GroovyCommand.ShortDescription}: {@code Executes the
     * specified Groovy script. }.
     * 
     * @return
     *     {@code Executes the specified Groovy script. }
     */
    public static Localizable _GroovyCommand_ShortDescription() {
        return new Localizable(holder, "GroovyCommand.ShortDescription");
    }

    /**
     * Key {@code InstallPluginCommand.InstallingFromUpdateCenter}: {@code
     * Installing {0} from update center}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing {0} from update center}
     */
    public static String InstallPluginCommand_InstallingFromUpdateCenter(Object arg0) {
        return holder.format("InstallPluginCommand.InstallingFromUpdateCenter", arg0);
    }

    /**
     * Key {@code InstallPluginCommand.InstallingFromUpdateCenter}: {@code
     * Installing {0} from update center}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Installing {0} from update center}
     */
    public static Localizable _InstallPluginCommand_InstallingFromUpdateCenter(Object arg0) {
        return new Localizable(holder, "InstallPluginCommand.InstallingFromUpdateCenter", arg0);
    }

    /**
     * Key {@code ListJobsCommand.ShortDescription}: {@code Lists all jobs in
     * a specific view or item group.}.
     * 
     * @return
     *     {@code Lists all jobs in a specific view or item group.}
     */
    public static String ListJobsCommand_ShortDescription() {
        return holder.format("ListJobsCommand.ShortDescription");
    }

    /**
     * Key {@code ListJobsCommand.ShortDescription}: {@code Lists all jobs in
     * a specific view or item group.}.
     * 
     * @return
     *     {@code Lists all jobs in a specific view or item group.}
     */
    public static Localizable _ListJobsCommand_ShortDescription() {
        return new Localizable(holder, "ListJobsCommand.ShortDescription");
    }

    /**
     * Key {@code CreateViewCommand.ShortDescription}: {@code Creates a new
     * view by reading stdin as a XML configuration.}.
     * 
     * @return
     *     {@code Creates a new view by reading stdin as a XML configuration.}
     */
    public static String CreateViewCommand_ShortDescription() {
        return holder.format("CreateViewCommand.ShortDescription");
    }

    /**
     * Key {@code CreateViewCommand.ShortDescription}: {@code Creates a new
     * view by reading stdin as a XML configuration.}.
     * 
     * @return
     *     {@code Creates a new view by reading stdin as a XML configuration.}
     */
    public static Localizable _CreateViewCommand_ShortDescription() {
        return new Localizable(holder, "CreateViewCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildResultCommand.ShortDescription}: {@code Sets the
     * result of the current build. Works only if invoked from within a
     * build.}.
     * 
     * @return
     *     {@code Sets the result of the current build. Works only if invoked
     *     from within a build.}
     */
    public static String SetBuildResultCommand_ShortDescription() {
        return holder.format("SetBuildResultCommand.ShortDescription");
    }

    /**
     * Key {@code SetBuildResultCommand.ShortDescription}: {@code Sets the
     * result of the current build. Works only if invoked from within a
     * build.}.
     * 
     * @return
     *     {@code Sets the result of the current build. Works only if invoked
     *     from within a build.}
     */
    public static Localizable _SetBuildResultCommand_ShortDescription() {
        return new Localizable(holder, "SetBuildResultCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateNodeCommand.ShortDescription}: {@code Updates the
     * node definition XML from stdin. The opposite of the get-node
     * command.}.
     * 
     * @return
     *     {@code Updates the node definition XML from stdin. The opposite of the
     *     get-node command.}
     */
    public static String UpdateNodeCommand_ShortDescription() {
        return holder.format("UpdateNodeCommand.ShortDescription");
    }

    /**
     * Key {@code UpdateNodeCommand.ShortDescription}: {@code Updates the
     * node definition XML from stdin. The opposite of the get-node
     * command.}.
     * 
     * @return
     *     {@code Updates the node definition XML from stdin. The opposite of the
     *     get-node command.}
     */
    public static Localizable _UpdateNodeCommand_ShortDescription() {
        return new Localizable(holder, "UpdateNodeCommand.ShortDescription");
    }

    /**
     * Key {@code ListChangesCommand.ShortDescription}: {@code Dumps the
     * changelog for the specified build(s).}.
     * 
     * @return
     *     {@code Dumps the changelog for the specified build(s).}
     */
    public static String ListChangesCommand_ShortDescription() {
        return holder.format("ListChangesCommand.ShortDescription");
    }

    /**
     * Key {@code ListChangesCommand.ShortDescription}: {@code Dumps the
     * changelog for the specified build(s).}.
     * 
     * @return
     *     {@code Dumps the changelog for the specified build(s).}
     */
    public static Localizable _ListChangesCommand_ShortDescription() {
        return new Localizable(holder, "ListChangesCommand.ShortDescription");
    }

}
