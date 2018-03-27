// CHECKSTYLE:OFF

package hudson.cli.client;

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
     * Key {@code CLI.Usage}: {@code Jenkins CLI
     * Usage: java -jar
     * jenkins-cli.jar [-s URL] command [opts...] args...
     * Options:
     * -s URL    
     * : the server URL (defaults to the JENKINS_URL env var)
     * -i KEY       :
     * SSH private key file used for authentication
     * -p HOST:PORT : HTTP proxy
     * host and port for HTTPS proxy tunneling. See
     * http://jenkins-ci.org/https-proxy-tunnel
     * -noCertificateCheck : bypass
     * HTTPS certificate check entirely. Use with caution
     * -noKeyAuth   :
     * don't try to load the SSH authentication private key. Conflicts with
     * -i
     * 
     * The available commands depend on the server. Run the 'help'
     * command to
     * see the list.}.
     * 
     * @return
     *     {@code Jenkins CLI
     *     Usage: java -jar jenkins-cli.jar [-s URL] command
     *     [opts...] args...
     *     Options:
     *     -s URL       : the server URL (defaults to
     *     the JENKINS_URL env var)
     *     -i KEY       : SSH private key file used for
     *     authentication
     *     -p HOST:PORT : HTTP proxy host and port for HTTPS proxy
     *     tunneling. See
     *     http://jenkins-ci.org/https-proxy-tunnel
     *     -noCertificateCheck : bypass
     *     HTTPS certificate check entirely. Use with caution
     *     -noKeyAuth   :
     *     don't try to load the SSH authentication private key. Conflicts with
     *     -i
     *     
     *     The available commands depend on the server. Run the 'help'
     *     command to
     *     see the list.}
     */
    public static String CLI_Usage() {
        return holder.format("CLI.Usage");
    }

    /**
     * Key {@code CLI.Usage}: {@code Jenkins CLI
     * Usage: java -jar
     * jenkins-cli.jar [-s URL] command [opts...] args...
     * Options:
     * -s URL    
     * : the server URL (defaults to the JENKINS_URL env var)
     * -i KEY       :
     * SSH private key file used for authentication
     * -p HOST:PORT : HTTP proxy
     * host and port for HTTPS proxy tunneling. See
     * http://jenkins-ci.org/https-proxy-tunnel
     * -noCertificateCheck : bypass
     * HTTPS certificate check entirely. Use with caution
     * -noKeyAuth   :
     * don't try to load the SSH authentication private key. Conflicts with
     * -i
     * 
     * The available commands depend on the server. Run the 'help'
     * command to
     * see the list.}.
     * 
     * @return
     *     {@code Jenkins CLI
     *     Usage: java -jar jenkins-cli.jar [-s URL] command
     *     [opts...] args...
     *     Options:
     *     -s URL       : the server URL (defaults to
     *     the JENKINS_URL env var)
     *     -i KEY       : SSH private key file used for
     *     authentication
     *     -p HOST:PORT : HTTP proxy host and port for HTTPS proxy
     *     tunneling. See
     *     http://jenkins-ci.org/https-proxy-tunnel
     *     -noCertificateCheck : bypass
     *     HTTPS certificate check entirely. Use with caution
     *     -noKeyAuth   :
     *     don't try to load the SSH authentication private key. Conflicts with
     *     -i
     *     
     *     The available commands depend on the server. Run the 'help'
     *     command to
     *     see the list.}
     */
    public static Localizable _CLI_Usage() {
        return new Localizable(holder, "CLI.Usage");
    }

    /**
     * Key {@code CLI.NoURL}: {@code Neither -s nor the JENKINS_URL env var
     * is specified.}.
     * 
     * @return
     *     {@code Neither -s nor the JENKINS_URL env var is specified.}
     */
    public static String CLI_NoURL() {
        return holder.format("CLI.NoURL");
    }

    /**
     * Key {@code CLI.NoURL}: {@code Neither -s nor the JENKINS_URL env var
     * is specified.}.
     * 
     * @return
     *     {@code Neither -s nor the JENKINS_URL env var is specified.}
     */
    public static Localizable _CLI_NoURL() {
        return new Localizable(holder, "CLI.NoURL");
    }

    /**
     * Key {@code CLI.NoSuchFileExists}: {@code No such file exists: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such file exists: {0}}
     */
    public static String CLI_NoSuchFileExists(Object arg0) {
        return holder.format("CLI.NoSuchFileExists", arg0);
    }

    /**
     * Key {@code CLI.NoSuchFileExists}: {@code No such file exists: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code No such file exists: {0}}
     */
    public static Localizable _CLI_NoSuchFileExists(Object arg0) {
        return new Localizable(holder, "CLI.NoSuchFileExists", arg0);
    }

    /**
     * Key {@code CLI.VersionMismatch}: {@code Version mismatch. This CLI
     * cannot work with this Jenkins server.}.
     * 
     * @return
     *     {@code Version mismatch. This CLI cannot work with this Jenkins
     *     server.}
     */
    public static String CLI_VersionMismatch() {
        return holder.format("CLI.VersionMismatch");
    }

    /**
     * Key {@code CLI.VersionMismatch}: {@code Version mismatch. This CLI
     * cannot work with this Jenkins server.}.
     * 
     * @return
     *     {@code Version mismatch. This CLI cannot work with this Jenkins
     *     server.}
     */
    public static Localizable _CLI_VersionMismatch() {
        return new Localizable(holder, "CLI.VersionMismatch");
    }

}
