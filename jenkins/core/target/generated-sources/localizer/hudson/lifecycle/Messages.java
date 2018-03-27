// CHECKSTYLE:OFF

package hudson.lifecycle;

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
     * Key {@code WindowsInstallerLink.DisplayName}: {@code Install as
     * Windows Service}.
     * 
     * @return
     *     {@code Install as Windows Service}
     */
    public static String WindowsInstallerLink_DisplayName() {
        return holder.format("WindowsInstallerLink.DisplayName");
    }

    /**
     * Key {@code WindowsInstallerLink.DisplayName}: {@code Install as
     * Windows Service}.
     * 
     * @return
     *     {@code Install as Windows Service}
     */
    public static Localizable _WindowsInstallerLink_DisplayName() {
        return new Localizable(holder, "WindowsInstallerLink.DisplayName");
    }

    /**
     * Key {@code WindowsSlaveInstaller.InstallationSuccessful}: {@code
     * Installation was successful. Would you like to start the service
     * now?}.
     * 
     * @return
     *     {@code Installation was successful. Would you like to start the
     *     service now?}
     */
    public static String WindowsSlaveInstaller_InstallationSuccessful() {
        return holder.format("WindowsSlaveInstaller.InstallationSuccessful");
    }

    /**
     * Key {@code WindowsSlaveInstaller.InstallationSuccessful}: {@code
     * Installation was successful. Would you like to start the service
     * now?}.
     * 
     * @return
     *     {@code Installation was successful. Would you like to start the
     *     service now?}
     */
    public static Localizable _WindowsSlaveInstaller_InstallationSuccessful() {
        return new Localizable(holder, "WindowsSlaveInstaller.InstallationSuccessful");
    }

    /**
     * Key {@code WindowsSlaveInstaller.DotNetRequired}: {@code .NET
     * Framework 2.0 or later is required for this feature}.
     * 
     * @return
     *     {@code .NET Framework 2.0 or later is required for this feature}
     */
    public static String WindowsSlaveInstaller_DotNetRequired() {
        return holder.format("WindowsSlaveInstaller.DotNetRequired");
    }

    /**
     * Key {@code WindowsSlaveInstaller.DotNetRequired}: {@code .NET
     * Framework 2.0 or later is required for this feature}.
     * 
     * @return
     *     {@code .NET Framework 2.0 or later is required for this feature}
     */
    public static Localizable _WindowsSlaveInstaller_DotNetRequired() {
        return new Localizable(holder, "WindowsSlaveInstaller.DotNetRequired");
    }

    /**
     * Key {@code WindowsInstallerLink.Description}: {@code Installs Jenkins
     * as a Windows service to this system, so that Jenkins starts
     * automatically when the machine boots.}.
     * 
     * @return
     *     {@code Installs Jenkins as a Windows service to this system, so that
     *     Jenkins starts automatically when the machine boots.}
     */
    public static String WindowsInstallerLink_Description() {
        return holder.format("WindowsInstallerLink.Description");
    }

    /**
     * Key {@code WindowsInstallerLink.Description}: {@code Installs Jenkins
     * as a Windows service to this system, so that Jenkins starts
     * automatically when the machine boots.}.
     * 
     * @return
     *     {@code Installs Jenkins as a Windows service to this system, so that
     *     Jenkins starts automatically when the machine boots.}
     */
    public static Localizable _WindowsInstallerLink_Description() {
        return new Localizable(holder, "WindowsInstallerLink.Description");
    }

    /**
     * Key {@code WindowsSlaveInstaller.RootFsDoesntExist}: {@code Slave root
     * directory ‘{0}’ doesn’t exist}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Slave root directory ‘{0}’ doesn’t exist}
     */
    public static String WindowsSlaveInstaller_RootFsDoesntExist(Object arg0) {
        return holder.format("WindowsSlaveInstaller.RootFsDoesntExist", arg0);
    }

    /**
     * Key {@code WindowsSlaveInstaller.RootFsDoesntExist}: {@code Slave root
     * directory ‘{0}’ doesn’t exist}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Slave root directory ‘{0}’ doesn’t exist}
     */
    public static Localizable _WindowsSlaveInstaller_RootFsDoesntExist(Object arg0) {
        return new Localizable(holder, "WindowsSlaveInstaller.RootFsDoesntExist", arg0);
    }

    /**
     * Key {@code WindowsSlaveInstaller.ConfirmInstallation}: {@code This
     * will install a slave agent as a Windows service, so that a Jenkins
     * slave starts automatically when the machine boots.}.
     * 
     * @return
     *     {@code This will install a slave agent as a Windows service, so that a
     *     Jenkins slave starts automatically when the machine boots.}
     */
    public static String WindowsSlaveInstaller_ConfirmInstallation() {
        return holder.format("WindowsSlaveInstaller.ConfirmInstallation");
    }

    /**
     * Key {@code WindowsSlaveInstaller.ConfirmInstallation}: {@code This
     * will install a slave agent as a Windows service, so that a Jenkins
     * slave starts automatically when the machine boots.}.
     * 
     * @return
     *     {@code This will install a slave agent as a Windows service, so that a
     *     Jenkins slave starts automatically when the machine boots.}
     */
    public static Localizable _WindowsSlaveInstaller_ConfirmInstallation() {
        return new Localizable(holder, "WindowsSlaveInstaller.ConfirmInstallation");
    }

}
