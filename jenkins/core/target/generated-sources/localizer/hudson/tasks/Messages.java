// CHECKSTYLE:OFF

package hudson.tasks;

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
     * Key {@code BuildTrigger.InQueue}: {@code {0} is already in the queue}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is already in the queue}
     */
    public static String BuildTrigger_InQueue(Object arg0) {
        return holder.format("BuildTrigger.InQueue", arg0);
    }

    /**
     * Key {@code BuildTrigger.InQueue}: {@code {0} is already in the queue}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is already in the queue}
     */
    public static Localizable _BuildTrigger_InQueue(Object arg0) {
        return new Localizable(holder, "BuildTrigger.InQueue", arg0);
    }

    /**
     * Key {@code ArtifactArchiver.DisplayName}: {@code Archive the
     * artifacts}.
     * 
     * @return
     *     {@code Archive the artifacts}
     */
    public static String ArtifactArchiver_DisplayName() {
        return holder.format("ArtifactArchiver.DisplayName");
    }

    /**
     * Key {@code ArtifactArchiver.DisplayName}: {@code Archive the
     * artifacts}.
     * 
     * @return
     *     {@code Archive the artifacts}
     */
    public static Localizable _ArtifactArchiver_DisplayName() {
        return new Localizable(holder, "ArtifactArchiver.DisplayName");
    }

    /**
     * Key {@code Shell.DisplayName}: {@code Execute shell}.
     * 
     * @return
     *     {@code Execute shell}
     */
    public static String Shell_DisplayName() {
        return holder.format("Shell.DisplayName");
    }

    /**
     * Key {@code Shell.DisplayName}: {@code Execute shell}.
     * 
     * @return
     *     {@code Execute shell}
     */
    public static Localizable _Shell_DisplayName() {
        return new Localizable(holder, "Shell.DisplayName");
    }

    /**
     * Key {@code Fingerprinter.Recording}: {@code Recording fingerprints}.
     * 
     * @return
     *     {@code Recording fingerprints}
     */
    public static String Fingerprinter_Recording() {
        return holder.format("Fingerprinter.Recording");
    }

    /**
     * Key {@code Fingerprinter.Recording}: {@code Recording fingerprints}.
     * 
     * @return
     *     {@code Recording fingerprints}
     */
    public static Localizable _Fingerprinter_Recording() {
        return new Localizable(holder, "Fingerprinter.Recording");
    }

    /**
     * Key {@code BuildTrigger.DisplayName}: {@code Build other projects}.
     * 
     * @return
     *     {@code Build other projects}
     */
    public static String BuildTrigger_DisplayName() {
        return holder.format("BuildTrigger.DisplayName");
    }

    /**
     * Key {@code BuildTrigger.DisplayName}: {@code Build other projects}.
     * 
     * @return
     *     {@code Build other projects}
     */
    public static Localizable _BuildTrigger_DisplayName() {
        return new Localizable(holder, "BuildTrigger.DisplayName");
    }

    /**
     * Key {@code ArtifactArchiver.NoMatchFound}: {@code No artifacts found
     * that match the file pattern "{0}". Configuration error?}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No artifacts found that match the file pattern "{0}".
     *     Configuration error?}
     */
    public static String ArtifactArchiver_NoMatchFound(Object arg0) {
        return holder.format("ArtifactArchiver.NoMatchFound", arg0);
    }

    /**
     * Key {@code ArtifactArchiver.NoMatchFound}: {@code No artifacts found
     * that match the file pattern "{0}". Configuration error?}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No artifacts found that match the file pattern "{0}".
     *     Configuration error?}
     */
    public static Localizable _ArtifactArchiver_NoMatchFound(Object arg0) {
        return new Localizable(holder, "ArtifactArchiver.NoMatchFound", arg0);
    }

    /**
     * Key {@code BuildTrigger.NoProjectSpecified}: {@code No project
     * specified}.
     * 
     * @return
     *     {@code No project specified}
     */
    public static String BuildTrigger_NoProjectSpecified() {
        return holder.format("BuildTrigger.NoProjectSpecified");
    }

    /**
     * Key {@code BuildTrigger.NoProjectSpecified}: {@code No project
     * specified}.
     * 
     * @return
     *     {@code No project specified}
     */
    public static Localizable _BuildTrigger_NoProjectSpecified() {
        return new Localizable(holder, "BuildTrigger.NoProjectSpecified");
    }

    /**
     * Key {@code JavadocArchiver.UnableToCopy}: {@code Unable to copy
     * Javadoc from {0} to {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unable to copy Javadoc from {0} to {1}}
     */
    public static String JavadocArchiver_UnableToCopy(Object arg0, Object arg1) {
        return holder.format("JavadocArchiver.UnableToCopy", arg0, arg1);
    }

    /**
     * Key {@code JavadocArchiver.UnableToCopy}: {@code Unable to copy
     * Javadoc from {0} to {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unable to copy Javadoc from {0} to {1}}
     */
    public static Localizable _JavadocArchiver_UnableToCopy(Object arg0, Object arg1) {
        return new Localizable(holder, "JavadocArchiver.UnableToCopy", arg0, arg1);
    }

    /**
     * Key {@code BuildTrigger.you_have_no_permission_to_build_}: {@code You
     * have no permission to build {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code You have no permission to build {0}}
     */
    public static String BuildTrigger_you_have_no_permission_to_build_(Object arg0) {
        return holder.format("BuildTrigger.you_have_no_permission_to_build_", arg0);
    }

    /**
     * Key {@code BuildTrigger.you_have_no_permission_to_build_}: {@code You
     * have no permission to build {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code You have no permission to build {0}}
     */
    public static Localizable _BuildTrigger_you_have_no_permission_to_build_(Object arg0) {
        return new Localizable(holder, "BuildTrigger.you_have_no_permission_to_build_", arg0);
    }

    /**
     * Key {@code BuildTrigger.warning_this_build_has_no_associated_aut}:
     * {@code Warning: this build has no associated authentication, so build
     * permissions may be lacking, and downstream projects which cannot even
     * be seen by an anonymous user will be silently skipped}.
     * 
     * @return
     *     {@code Warning: this build has no associated authentication, so build
     *     permissions may be lacking, and downstream projects which cannot even
     *     be seen by an anonymous user will be silently skipped}
     */
    public static String BuildTrigger_warning_this_build_has_no_associated_aut() {
        return holder.format("BuildTrigger.warning_this_build_has_no_associated_aut");
    }

    /**
     * Key {@code BuildTrigger.warning_this_build_has_no_associated_aut}:
     * {@code Warning: this build has no associated authentication, so build
     * permissions may be lacking, and downstream projects which cannot even
     * be seen by an anonymous user will be silently skipped}.
     * 
     * @return
     *     {@code Warning: this build has no associated authentication, so build
     *     permissions may be lacking, and downstream projects which cannot even
     *     be seen by an anonymous user will be silently skipped}
     */
    public static Localizable _BuildTrigger_warning_this_build_has_no_associated_aut() {
        return new Localizable(holder, "BuildTrigger.warning_this_build_has_no_associated_aut");
    }

    /**
     * Key {@code Ant.ExecutableNotFound}: {@code Cannot find executable from
     * the chosen Ant installation "{0}"}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot find executable from the chosen Ant installation "{0}"}
     */
    public static String Ant_ExecutableNotFound(Object arg0) {
        return holder.format("Ant.ExecutableNotFound", arg0);
    }

    /**
     * Key {@code Ant.ExecutableNotFound}: {@code Cannot find executable from
     * the chosen Ant installation "{0}"}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cannot find executable from the chosen Ant installation "{0}"}
     */
    public static Localizable _Ant_ExecutableNotFound(Object arg0) {
        return new Localizable(holder, "Ant.ExecutableNotFound", arg0);
    }

    /**
     * Key {@code ArtifactArchiver.ARCHIVING_ARTIFACTS}: {@code Archiving
     * artifacts}.
     * 
     * @return
     *     {@code Archiving artifacts}
     */
    public static String ArtifactArchiver_ARCHIVING_ARTIFACTS() {
        return holder.format("ArtifactArchiver.ARCHIVING_ARTIFACTS");
    }

    /**
     * Key {@code ArtifactArchiver.ARCHIVING_ARTIFACTS}: {@code Archiving
     * artifacts}.
     * 
     * @return
     *     {@code Archiving artifacts}
     */
    public static Localizable _ArtifactArchiver_ARCHIVING_ARTIFACTS() {
        return new Localizable(holder, "ArtifactArchiver.ARCHIVING_ARTIFACTS");
    }

    /**
     * Key {@code BuildTrigger.Triggering}: {@code Triggering a new build of
     * {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggering a new build of {0}}
     */
    public static String BuildTrigger_Triggering(Object arg0) {
        return holder.format("BuildTrigger.Triggering", arg0);
    }

    /**
     * Key {@code BuildTrigger.Triggering}: {@code Triggering a new build of
     * {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Triggering a new build of {0}}
     */
    public static Localizable _BuildTrigger_Triggering(Object arg0) {
        return new Localizable(holder, "BuildTrigger.Triggering", arg0);
    }

    /**
     * Key {@code BuildTrigger.Disabled}: {@code {0} is disabled. Triggering
     * skipped}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is disabled. Triggering skipped}
     */
    public static String BuildTrigger_Disabled(Object arg0) {
        return holder.format("BuildTrigger.Disabled", arg0);
    }

    /**
     * Key {@code BuildTrigger.Disabled}: {@code {0} is disabled. Triggering
     * skipped}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is disabled. Triggering skipped}
     */
    public static Localizable _BuildTrigger_Disabled(Object arg0) {
        return new Localizable(holder, "BuildTrigger.Disabled", arg0);
    }

    /**
     * Key {@code ArtifactArchiver.NoIncludes}: {@code No artifacts are
     * configured for archiving.
     * You probably forgot to set the file pattern,
     * so please go back to the configuration and specify it.
     * If you really
     * did mean to archive all the files in the workspace, please specify
     * "**"}.
     * 
     * @return
     *     {@code No artifacts are configured for archiving.
     *     You probably forgot
     *     to set the file pattern, so please go back to the configuration and
     *     specify it.
     *     If you really did mean to archive all the files in the
     *     workspace, please specify "**"}
     */
    public static String ArtifactArchiver_NoIncludes() {
        return holder.format("ArtifactArchiver.NoIncludes");
    }

    /**
     * Key {@code ArtifactArchiver.NoIncludes}: {@code No artifacts are
     * configured for archiving.
     * You probably forgot to set the file pattern,
     * so please go back to the configuration and specify it.
     * If you really
     * did mean to archive all the files in the workspace, please specify
     * "**"}.
     * 
     * @return
     *     {@code No artifacts are configured for archiving.
     *     You probably forgot
     *     to set the file pattern, so please go back to the configuration and
     *     specify it.
     *     If you really did mean to archive all the files in the
     *     workspace, please specify "**"}
     */
    public static Localizable _ArtifactArchiver_NoIncludes() {
        return new Localizable(holder, "ArtifactArchiver.NoIncludes");
    }

    /**
     * Key {@code Maven.DisplayName}: {@code Invoke top-level Maven targets}.
     * 
     * @return
     *     {@code Invoke top-level Maven targets}
     */
    public static String Maven_DisplayName() {
        return holder.format("Maven.DisplayName");
    }

    /**
     * Key {@code Maven.DisplayName}: {@code Invoke top-level Maven targets}.
     * 
     * @return
     *     {@code Invoke top-level Maven targets}
     */
    public static Localizable _Maven_DisplayName() {
        return new Localizable(holder, "Maven.DisplayName");
    }

    /**
     * Key {@code Ant.NotAntDirectory}: {@code {0} doesn’t look like an Ant
     * directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} doesn’t look like an Ant directory}
     */
    public static String Ant_NotAntDirectory(Object arg0) {
        return holder.format("Ant.NotAntDirectory", arg0);
    }

    /**
     * Key {@code Ant.NotAntDirectory}: {@code {0} doesn’t look like an Ant
     * directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} doesn’t look like an Ant directory}
     */
    public static Localizable _Ant_NotAntDirectory(Object arg0) {
        return new Localizable(holder, "Ant.NotAntDirectory", arg0);
    }

    /**
     * Key {@code Maven.ExecFailed}: {@code command execution failed}.
     * 
     * @return
     *     {@code command execution failed}
     */
    public static String Maven_ExecFailed() {
        return holder.format("Maven.ExecFailed");
    }

    /**
     * Key {@code Maven.ExecFailed}: {@code command execution failed}.
     * 
     * @return
     *     {@code command execution failed}
     */
    public static Localizable _Maven_ExecFailed() {
        return new Localizable(holder, "Maven.ExecFailed");
    }

    /**
     * Key {@code BatchFile.DisplayName}: {@code Execute Windows batch
     * command}.
     * 
     * @return
     *     {@code Execute Windows batch command}
     */
    public static String BatchFile_DisplayName() {
        return holder.format("BatchFile.DisplayName");
    }

    /**
     * Key {@code BatchFile.DisplayName}: {@code Execute Windows batch
     * command}.
     * 
     * @return
     *     {@code Execute Windows batch command}
     */
    public static Localizable _BatchFile_DisplayName() {
        return new Localizable(holder, "BatchFile.DisplayName");
    }

    /**
     * Key {@code Fingerprinter.FailedFor}: {@code failed to record
     * fingerprint for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code failed to record fingerprint for {0}}
     */
    public static String Fingerprinter_FailedFor(Object arg0) {
        return holder.format("Fingerprinter.FailedFor", arg0);
    }

    /**
     * Key {@code Fingerprinter.FailedFor}: {@code failed to record
     * fingerprint for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code failed to record fingerprint for {0}}
     */
    public static Localizable _Fingerprinter_FailedFor(Object arg0) {
        return new Localizable(holder, "Fingerprinter.FailedFor", arg0);
    }

    /**
     * Key {@code JavadocArchiver.DisplayName}: {@code Publish Javadoc}.
     * 
     * @return
     *     {@code Publish Javadoc}
     */
    public static String JavadocArchiver_DisplayName() {
        return holder.format("JavadocArchiver.DisplayName");
    }

    /**
     * Key {@code JavadocArchiver.DisplayName}: {@code Publish Javadoc}.
     * 
     * @return
     *     {@code Publish Javadoc}
     */
    public static Localizable _JavadocArchiver_DisplayName() {
        return new Localizable(holder, "JavadocArchiver.DisplayName");
    }

    /**
     * Key {@code CommandInterpreter.UnableToDelete}: {@code Unable to delete
     * script file {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unable to delete script file {0}}
     */
    public static String CommandInterpreter_UnableToDelete(Object arg0) {
        return holder.format("CommandInterpreter.UnableToDelete", arg0);
    }

    /**
     * Key {@code CommandInterpreter.UnableToDelete}: {@code Unable to delete
     * script file {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unable to delete script file {0}}
     */
    public static Localizable _CommandInterpreter_UnableToDelete(Object arg0) {
        return new Localizable(holder, "CommandInterpreter.UnableToDelete", arg0);
    }

    /**
     * Key {@code ArtifactArchiver.FailedToArchive}: {@code Failed to archive
     * artifacts: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to archive artifacts: {0}}
     */
    public static String ArtifactArchiver_FailedToArchive(Object arg0) {
        return holder.format("ArtifactArchiver.FailedToArchive", arg0);
    }

    /**
     * Key {@code ArtifactArchiver.FailedToArchive}: {@code Failed to archive
     * artifacts: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to archive artifacts: {0}}
     */
    public static Localizable _ArtifactArchiver_FailedToArchive(Object arg0) {
        return new Localizable(holder, "ArtifactArchiver.FailedToArchive", arg0);
    }

    /**
     * Key {@code Fingerprinter.Failed}: {@code Failed to record
     * fingerprints}.
     * 
     * @return
     *     {@code Failed to record fingerprints}
     */
    public static String Fingerprinter_Failed() {
        return holder.format("Fingerprinter.Failed");
    }

    /**
     * Key {@code Fingerprinter.Failed}: {@code Failed to record
     * fingerprints}.
     * 
     * @return
     *     {@code Failed to record fingerprints}
     */
    public static Localizable _Fingerprinter_Failed() {
        return new Localizable(holder, "Fingerprinter.Failed");
    }

    /**
     * Key {@code JavadocArchiver.Publishing}: {@code Publishing Javadoc}.
     * 
     * @return
     *     {@code Publishing Javadoc}
     */
    public static String JavadocArchiver_Publishing() {
        return holder.format("JavadocArchiver.Publishing");
    }

    /**
     * Key {@code JavadocArchiver.Publishing}: {@code Publishing Javadoc}.
     * 
     * @return
     *     {@code Publishing Javadoc}
     */
    public static Localizable _JavadocArchiver_Publishing() {
        return new Localizable(holder, "JavadocArchiver.Publishing");
    }

    /**
     * Key {@code Ant.GlobalConfigNeeded}: {@code Maybe you need to configure
     * where your Ant installations are?}.
     * 
     * @return
     *     {@code Maybe you need to configure where your Ant installations are?}
     */
    public static String Ant_GlobalConfigNeeded() {
        return holder.format("Ant.GlobalConfigNeeded");
    }

    /**
     * Key {@code Ant.GlobalConfigNeeded}: {@code Maybe you need to configure
     * where your Ant installations are?}.
     * 
     * @return
     *     {@code Maybe you need to configure where your Ant installations are?}
     */
    public static Localizable _Ant_GlobalConfigNeeded() {
        return new Localizable(holder, "Ant.GlobalConfigNeeded");
    }

    /**
     * Key {@code BuildTrigger.NoSuchProject}: {@code No such project ‘{0}’.
     * Did you mean ‘{1}’?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such project ‘{0}’. Did you mean ‘{1}’?}
     */
    public static String BuildTrigger_NoSuchProject(Object arg0, Object arg1) {
        return holder.format("BuildTrigger.NoSuchProject", arg0, arg1);
    }

    /**
     * Key {@code BuildTrigger.NoSuchProject}: {@code No such project ‘{0}’.
     * Did you mean ‘{1}’?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such project ‘{0}’. Did you mean ‘{1}’?}
     */
    public static Localizable _BuildTrigger_NoSuchProject(Object arg0, Object arg1) {
        return new Localizable(holder, "BuildTrigger.NoSuchProject", arg0, arg1);
    }

    /**
     * Key {@code CommandInterpreter.CommandFailed}: {@code command execution
     * failed}.
     * 
     * @return
     *     {@code command execution failed}
     */
    public static String CommandInterpreter_CommandFailed() {
        return holder.format("CommandInterpreter.CommandFailed");
    }

    /**
     * Key {@code CommandInterpreter.CommandFailed}: {@code command execution
     * failed}.
     * 
     * @return
     *     {@code command execution failed}
     */
    public static Localizable _CommandInterpreter_CommandFailed() {
        return new Localizable(holder, "CommandInterpreter.CommandFailed");
    }

    /**
     * Key {@code JavadocArchiver.NoMatchFound}: {@code No javadoc found in
     * {0}: {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No javadoc found in {0}: {1}}
     */
    public static String JavadocArchiver_NoMatchFound(Object arg0, Object arg1) {
        return holder.format("JavadocArchiver.NoMatchFound", arg0, arg1);
    }

    /**
     * Key {@code JavadocArchiver.NoMatchFound}: {@code No javadoc found in
     * {0}: {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No javadoc found in {0}: {1}}
     */
    public static Localizable _JavadocArchiver_NoMatchFound(Object arg0, Object arg1) {
        return new Localizable(holder, "JavadocArchiver.NoMatchFound", arg0, arg1);
    }

    /**
     * Key {@code JavadocArchiver.DisplayName.Javadoc}: {@code Javadoc}.
     * 
     * @return
     *     {@code Javadoc}
     */
    public static String JavadocArchiver_DisplayName_Javadoc() {
        return holder.format("JavadocArchiver.DisplayName.Javadoc");
    }

    /**
     * Key {@code JavadocArchiver.DisplayName.Javadoc}: {@code Javadoc}.
     * 
     * @return
     *     {@code Javadoc}
     */
    public static Localizable _JavadocArchiver_DisplayName_Javadoc() {
        return new Localizable(holder, "JavadocArchiver.DisplayName.Javadoc");
    }

    /**
     * Key {@code Fingerprinter.DigestFailed}: {@code Failed to compute
     * digest for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to compute digest for {0}}
     */
    public static String Fingerprinter_DigestFailed(Object arg0) {
        return holder.format("Fingerprinter.DigestFailed", arg0);
    }

    /**
     * Key {@code Fingerprinter.DigestFailed}: {@code Failed to compute
     * digest for {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to compute digest for {0}}
     */
    public static Localizable _Fingerprinter_DigestFailed(Object arg0) {
        return new Localizable(holder, "Fingerprinter.DigestFailed", arg0);
    }

    /**
     * Key {@code Fingerprinter.Aborted}: {@code Aborted}.
     * 
     * @return
     *     {@code Aborted}
     */
    public static String Fingerprinter_Aborted() {
        return holder.format("Fingerprinter.Aborted");
    }

    /**
     * Key {@code Fingerprinter.Aborted}: {@code Aborted}.
     * 
     * @return
     *     {@code Aborted}
     */
    public static Localizable _Fingerprinter_Aborted() {
        return new Localizable(holder, "Fingerprinter.Aborted");
    }

    /**
     * Key {@code BuildTrigger.warning_access_control_for_builds_in_glo}:
     * {@code Warning: ‘Access Control for Builds’ in global security
     * configuration is empty, so falling back to legacy behavior of
     * permitting any downstream builds to be triggered}.
     * 
     * @return
     *     {@code Warning: ‘Access Control for Builds’ in global security
     *     configuration is empty, so falling back to legacy behavior of
     *     permitting any downstream builds to be triggered}
     */
    public static String BuildTrigger_warning_access_control_for_builds_in_glo() {
        return holder.format("BuildTrigger.warning_access_control_for_builds_in_glo");
    }

    /**
     * Key {@code BuildTrigger.warning_access_control_for_builds_in_glo}:
     * {@code Warning: ‘Access Control for Builds’ in global security
     * configuration is empty, so falling back to legacy behavior of
     * permitting any downstream builds to be triggered}.
     * 
     * @return
     *     {@code Warning: ‘Access Control for Builds’ in global security
     *     configuration is empty, so falling back to legacy behavior of
     *     permitting any downstream builds to be triggered}
     */
    public static Localizable _BuildTrigger_warning_access_control_for_builds_in_glo() {
        return new Localizable(holder, "BuildTrigger.warning_access_control_for_builds_in_glo");
    }

    /**
     * Key {@code Fingerprinter.Action.DisplayName}: {@code See
     * Fingerprints}.
     * 
     * @return
     *     {@code See Fingerprints}
     */
    public static String Fingerprinter_Action_DisplayName() {
        return holder.format("Fingerprinter.Action.DisplayName");
    }

    /**
     * Key {@code Fingerprinter.Action.DisplayName}: {@code See
     * Fingerprints}.
     * 
     * @return
     *     {@code See Fingerprints}
     */
    public static Localizable _Fingerprinter_Action_DisplayName() {
        return new Localizable(holder, "Fingerprinter.Action.DisplayName");
    }

    /**
     * Key {@code CommandInterpreter.UnableToProduceScript}: {@code Unable to
     * produce a script file}.
     * 
     * @return
     *     {@code Unable to produce a script file}
     */
    public static String CommandInterpreter_UnableToProduceScript() {
        return holder.format("CommandInterpreter.UnableToProduceScript");
    }

    /**
     * Key {@code CommandInterpreter.UnableToProduceScript}: {@code Unable to
     * produce a script file}.
     * 
     * @return
     *     {@code Unable to produce a script file}
     */
    public static Localizable _CommandInterpreter_UnableToProduceScript() {
        return new Localizable(holder, "CommandInterpreter.UnableToProduceScript");
    }

    /**
     * Key {@code Ant.DisplayName}: {@code Invoke Ant}.
     * 
     * @return
     *     {@code Invoke Ant}
     */
    public static String Ant_DisplayName() {
        return holder.format("Ant.DisplayName");
    }

    /**
     * Key {@code Ant.DisplayName}: {@code Invoke Ant}.
     * 
     * @return
     *     {@code Invoke Ant}
     */
    public static Localizable _Ant_DisplayName() {
        return new Localizable(holder, "Ant.DisplayName");
    }

    /**
     * Key {@code Maven.NoExecutable}: {@code Couldn’t find any executable in
     * {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Couldn’t find any executable in {0}}
     */
    public static String Maven_NoExecutable(Object arg0) {
        return holder.format("Maven.NoExecutable", arg0);
    }

    /**
     * Key {@code Maven.NoExecutable}: {@code Couldn’t find any executable in
     * {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Couldn’t find any executable in {0}}
     */
    public static Localizable _Maven_NoExecutable(Object arg0) {
        return new Localizable(holder, "Maven.NoExecutable", arg0);
    }

    /**
     * Key {@code TestJavadocArchiver.DisplayName.Javadoc}: {@code Test
     * Javadoc}.
     * 
     * @return
     *     {@code Test Javadoc}
     */
    public static String TestJavadocArchiver_DisplayName_Javadoc() {
        return holder.format("TestJavadocArchiver.DisplayName.Javadoc");
    }

    /**
     * Key {@code TestJavadocArchiver.DisplayName.Javadoc}: {@code Test
     * Javadoc}.
     * 
     * @return
     *     {@code Test Javadoc}
     */
    public static Localizable _TestJavadocArchiver_DisplayName_Javadoc() {
        return new Localizable(holder, "TestJavadocArchiver.DisplayName.Javadoc");
    }

    /**
     * Key {@code Maven.NotMavenDirectory}: {@code {0} doesn’t look like a
     * Maven directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} doesn’t look like a Maven directory}
     */
    public static String Maven_NotMavenDirectory(Object arg0) {
        return holder.format("Maven.NotMavenDirectory", arg0);
    }

    /**
     * Key {@code Maven.NotMavenDirectory}: {@code {0} doesn’t look like a
     * Maven directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} doesn’t look like a Maven directory}
     */
    public static Localizable _Maven_NotMavenDirectory(Object arg0) {
        return new Localizable(holder, "Maven.NotMavenDirectory", arg0);
    }

    /**
     * Key {@code BuildTrigger.NotBuildable}: {@code {0} is not buildable}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is not buildable}
     */
    public static String BuildTrigger_NotBuildable(Object arg0) {
        return holder.format("BuildTrigger.NotBuildable", arg0);
    }

    /**
     * Key {@code BuildTrigger.NotBuildable}: {@code {0} is not buildable}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is not buildable}
     */
    public static Localizable _BuildTrigger_NotBuildable(Object arg0) {
        return new Localizable(holder, "BuildTrigger.NotBuildable", arg0);
    }

    /**
     * Key {@code InstallFromApache}: {@code Install from Apache}.
     * 
     * @return
     *     {@code Install from Apache}
     */
    public static String InstallFromApache() {
        return holder.format("InstallFromApache");
    }

    /**
     * Key {@code InstallFromApache}: {@code Install from Apache}.
     * 
     * @return
     *     {@code Install from Apache}
     */
    public static Localizable _InstallFromApache() {
        return new Localizable(holder, "InstallFromApache");
    }

    /**
     * Key {@code JavadocArchiver.DisplayName.Generic}: {@code Document}.
     * 
     * @return
     *     {@code Document}
     */
    public static String JavadocArchiver_DisplayName_Generic() {
        return holder.format("JavadocArchiver.DisplayName.Generic");
    }

    /**
     * Key {@code JavadocArchiver.DisplayName.Generic}: {@code Document}.
     * 
     * @return
     *     {@code Document}
     */
    public static Localizable _JavadocArchiver_DisplayName_Generic() {
        return new Localizable(holder, "JavadocArchiver.DisplayName.Generic");
    }

    /**
     * Key {@code Ant.ExecFailed}: {@code command execution failed.}.
     * 
     * @return
     *     {@code command execution failed.}
     */
    public static String Ant_ExecFailed() {
        return holder.format("Ant.ExecFailed");
    }

    /**
     * Key {@code Ant.ExecFailed}: {@code command execution failed.}.
     * 
     * @return
     *     {@code command execution failed.}
     */
    public static Localizable _Ant_ExecFailed() {
        return new Localizable(holder, "Ant.ExecFailed");
    }

    /**
     * Key {@code BuildTrigger.warning_you_have_no_plugins_providing_ac}:
     * {@code Warning: you have no plugins providing access control for
     * builds, so falling back to legacy behavior of permitting any
     * downstream builds to be triggered}.
     * 
     * @return
     *     {@code Warning: you have no plugins providing access control for
     *     builds, so falling back to legacy behavior of permitting any
     *     downstream builds to be triggered}
     */
    public static String BuildTrigger_warning_you_have_no_plugins_providing_ac() {
        return holder.format("BuildTrigger.warning_you_have_no_plugins_providing_ac");
    }

    /**
     * Key {@code BuildTrigger.warning_you_have_no_plugins_providing_ac}:
     * {@code Warning: you have no plugins providing access control for
     * builds, so falling back to legacy behavior of permitting any
     * downstream builds to be triggered}.
     * 
     * @return
     *     {@code Warning: you have no plugins providing access control for
     *     builds, so falling back to legacy behavior of permitting any
     *     downstream builds to be triggered}
     */
    public static Localizable _BuildTrigger_warning_you_have_no_plugins_providing_ac() {
        return new Localizable(holder, "BuildTrigger.warning_you_have_no_plugins_providing_ac");
    }

    /**
     * Key {@code Ant.NotADirectory}: {@code {0} is not a directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is not a directory}
     */
    public static String Ant_NotADirectory(Object arg0) {
        return holder.format("Ant.NotADirectory", arg0);
    }

    /**
     * Key {@code Ant.NotADirectory}: {@code {0} is not a directory}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is not a directory}
     */
    public static Localizable _Ant_NotADirectory(Object arg0) {
        return new Localizable(holder, "Ant.NotADirectory", arg0);
    }

    /**
     * Key {@code ArtifactArchiver.SkipBecauseOnlyIfSuccessful}: {@code
     * Skipped archiving because build is not successful}.
     * 
     * @return
     *     {@code Skipped archiving because build is not successful}
     */
    public static String ArtifactArchiver_SkipBecauseOnlyIfSuccessful() {
        return holder.format("ArtifactArchiver.SkipBecauseOnlyIfSuccessful");
    }

    /**
     * Key {@code ArtifactArchiver.SkipBecauseOnlyIfSuccessful}: {@code
     * Skipped archiving because build is not successful}.
     * 
     * @return
     *     {@code Skipped archiving because build is not successful}
     */
    public static Localizable _ArtifactArchiver_SkipBecauseOnlyIfSuccessful() {
        return new Localizable(holder, "ArtifactArchiver.SkipBecauseOnlyIfSuccessful");
    }

    /**
     * Key {@code Fingerprinter.DisplayName}: {@code Record fingerprints of
     * files to track usage}.
     * 
     * @return
     *     {@code Record fingerprints of files to track usage}
     */
    public static String Fingerprinter_DisplayName() {
        return holder.format("Fingerprinter.DisplayName");
    }

    /**
     * Key {@code Fingerprinter.DisplayName}: {@code Record fingerprints of
     * files to track usage}.
     * 
     * @return
     *     {@code Record fingerprints of files to track usage}
     */
    public static Localizable _Fingerprinter_DisplayName() {
        return new Localizable(holder, "Fingerprinter.DisplayName");
    }

    /**
     * Key {@code Ant.ProjectConfigNeeded}: {@code Maybe you need to
     * configure the job to choose one of your Ant installations?}.
     * 
     * @return
     *     {@code Maybe you need to configure the job to choose one of your Ant
     *     installations?}
     */
    public static String Ant_ProjectConfigNeeded() {
        return holder.format("Ant.ProjectConfigNeeded");
    }

    /**
     * Key {@code Ant.ProjectConfigNeeded}: {@code Maybe you need to
     * configure the job to choose one of your Ant installations?}.
     * 
     * @return
     *     {@code Maybe you need to configure the job to choose one of your Ant
     *     installations?}
     */
    public static Localizable _Ant_ProjectConfigNeeded() {
        return new Localizable(holder, "Ant.ProjectConfigNeeded");
    }

}
