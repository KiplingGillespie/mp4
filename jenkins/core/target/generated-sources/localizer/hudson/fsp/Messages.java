// CHECKSTYLE:OFF

package hudson.fsp;

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
     * Key {@code WorkspaceSnapshotSCM.NoSuchJob}: {@code No such job ‘{0}’
     * exists. Perhaps you meant ‘{1}’?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such job ‘{0}’ exists. Perhaps you meant ‘{1}’?}
     */
    public static String WorkspaceSnapshotSCM_NoSuchJob(Object arg0, Object arg1) {
        return holder.format("WorkspaceSnapshotSCM.NoSuchJob", arg0, arg1);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.NoSuchJob}: {@code No such job ‘{0}’
     * exists. Perhaps you meant ‘{1}’?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such job ‘{0}’ exists. Perhaps you meant ‘{1}’?}
     */
    public static Localizable _WorkspaceSnapshotSCM_NoSuchJob(Object arg0, Object arg1) {
        return new Localizable(holder, "WorkspaceSnapshotSCM.NoSuchJob", arg0, arg1);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.NoSuchPermalink}: {@code No such
     * permalink ‘{0}’ exists for {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such permalink ‘{0}’ exists for {1}}
     */
    public static String WorkspaceSnapshotSCM_NoSuchPermalink(Object arg0, Object arg1) {
        return holder.format("WorkspaceSnapshotSCM.NoSuchPermalink", arg0, arg1);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.NoSuchPermalink}: {@code No such
     * permalink ‘{0}’ exists for {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such permalink ‘{0}’ exists for {1}}
     */
    public static Localizable _WorkspaceSnapshotSCM_NoSuchPermalink(Object arg0, Object arg1) {
        return new Localizable(holder, "WorkspaceSnapshotSCM.NoSuchPermalink", arg0, arg1);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.NoWorkspace}: {@code {0} {1} doesn’t
     * have a workspace snapshot attached,
     * probably because when the build
     * was done, no other jobs needed its workspace snapshot.
     * Please run
     * another build in {0} to get the workspace snapshot taken.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} {1} doesn’t have a workspace snapshot attached,
     *     probably
     *     because when the build was done, no other jobs needed its workspace
     *     snapshot.
     *     Please run another build in {0} to get the workspace
     *     snapshot taken.}
     */
    public static String WorkspaceSnapshotSCM_NoWorkspace(Object arg0, Object arg1) {
        return holder.format("WorkspaceSnapshotSCM.NoWorkspace", arg0, arg1);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.NoWorkspace}: {@code {0} {1} doesn’t
     * have a workspace snapshot attached,
     * probably because when the build
     * was done, no other jobs needed its workspace snapshot.
     * Please run
     * another build in {0} to get the workspace snapshot taken.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} {1} doesn’t have a workspace snapshot attached,
     *     probably
     *     because when the build was done, no other jobs needed its workspace
     *     snapshot.
     *     Please run another build in {0} to get the workspace
     *     snapshot taken.}
     */
    public static Localizable _WorkspaceSnapshotSCM_NoWorkspace(Object arg0, Object arg1) {
        return new Localizable(holder, "WorkspaceSnapshotSCM.NoWorkspace", arg0, arg1);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.IncorrectJobType}: {@code {0} isn’t a
     * job that has a workspace.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} isn’t a job that has a workspace.}
     */
    public static String WorkspaceSnapshotSCM_IncorrectJobType(Object arg0) {
        return holder.format("WorkspaceSnapshotSCM.IncorrectJobType", arg0);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.IncorrectJobType}: {@code {0} isn’t a
     * job that has a workspace.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} isn’t a job that has a workspace.}
     */
    public static Localizable _WorkspaceSnapshotSCM_IncorrectJobType(Object arg0) {
        return new Localizable(holder, "WorkspaceSnapshotSCM.IncorrectJobType", arg0);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.NoBuild}: {@code There’s no qualifying
     * build for the {0} permalink in {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code There’s no qualifying build for the {0} permalink in {1}}
     */
    public static String WorkspaceSnapshotSCM_NoBuild(Object arg0, Object arg1) {
        return holder.format("WorkspaceSnapshotSCM.NoBuild", arg0, arg1);
    }

    /**
     * Key {@code WorkspaceSnapshotSCM.NoBuild}: {@code There’s no qualifying
     * build for the {0} permalink in {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code There’s no qualifying build for the {0} permalink in {1}}
     */
    public static Localizable _WorkspaceSnapshotSCM_NoBuild(Object arg0, Object arg1) {
        return new Localizable(holder, "WorkspaceSnapshotSCM.NoBuild", arg0, arg1);
    }

}
