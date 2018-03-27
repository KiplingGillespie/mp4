
package lib;

import java.util.Map;
import groovy.lang.Closure;
import org.kohsuke.stapler.jelly.groovy.TagFile;
import org.kohsuke.stapler.jelly.groovy.TagLibraryUri;
import org.kohsuke.stapler.jelly.groovy.TypedTagLibrary;

@TagLibraryUri("/lib/hudson")
public interface JenkinsTagLib
    extends TypedTagLibrary
{


    /**
     * 
     */
    void scriptConsole(Map args, Closure body);

    /**
     * 
     */
    void scriptConsole(Closure body);

    /**
     * 
     */
    void scriptConsole(Map args);

    /**
     * 
     */
    void scriptConsole();

    /**
     * 
     */
    void thirdPartyLicenses(Map args, Closure body);

    /**
     * 
     */
    void thirdPartyLicenses(Closure body);

    /**
     * 
     */
    void thirdPartyLicenses(Map args);

    /**
     * 
     */
    void thirdPartyLicenses();

    /**
     * 
     */
    void buildCaption(Map args, Closure body);

    /**
     * 
     */
    void buildCaption(Closure body);

    /**
     * 
     */
    void buildCaption(Map args);

    /**
     * 
     */
    void buildCaption();

    /**
     * 
     */
    void buildStatusSummary(Map args, Closure body);

    /**
     * 
     */
    void buildStatusSummary(Closure body);

    /**
     * 
     */
    void buildStatusSummary(Map args);

    /**
     * 
     */
    void buildStatusSummary();

    /**
     * 
     *         Displays a list of log records.
     *         
     *     
     * 
     */
    void logRecords(Map args, Closure body);

    /**
     * 
     *         Displays a list of log records.
     *         
     *     
     * 
     */
    void logRecords(Closure body);

    /**
     * 
     *         Displays a list of log records.
     *         
     *     
     * 
     */
    void logRecords(Map args);

    /**
     * 
     *         Displays a list of log records.
     *         
     *     
     * 
     */
    void logRecords();

    /**
     * 
     *     Generates a link to a job.
     *     
     *   
     * 
     */
    void jobLink(Map args, Closure body);

    /**
     * 
     *     Generates a link to a job.
     *     
     *   
     * 
     */
    void jobLink(Closure body);

    /**
     * 
     *     Generates a link to a job.
     *     
     *   
     * 
     */
    void jobLink(Map args);

    /**
     * 
     *     Generates a link to a job.
     *     
     *   
     * 
     */
    void jobLink();

    /**
     * 
     *     List browser SCMs
     *     
     *   
     * 
     */
    void listScmBrowsers(Map args, Closure body);

    /**
     * 
     *     List browser SCMs
     *     
     *   
     * 
     */
    void listScmBrowsers(Closure body);

    /**
     * 
     *     List browser SCMs
     *     
     *   
     * 
     */
    void listScmBrowsers(Map args);

    /**
     * 
     *     List browser SCMs
     *     
     *   
     * 
     */
    void listScmBrowsers();

    /**
     * 
     */
    void buildHealth(Map args, Closure body);

    /**
     * 
     */
    void buildHealth(Closure body);

    /**
     * 
     */
    void buildHealth(Map args);

    /**
     * 
     */
    void buildHealth();

    /**
     * 
     *     Renders ${it.description} and then allow it to be editable in place,
     *     if the current user has the specified permission.
     * 
     *     
     *   
     * 
     */
    void editableDescription(Map args, Closure body);

    /**
     * 
     *     Renders ${it.description} and then allow it to be editable in place,
     *     if the current user has the specified permission.
     * 
     *     
     *   
     * 
     */
    void editableDescription(Closure body);

    /**
     * 
     *     Renders ${it.description} and then allow it to be editable in place,
     *     if the current user has the specified permission.
     * 
     *     
     *   
     * 
     */
    void editableDescription(Map args);

    /**
     * 
     *     Renders ${it.description} and then allow it to be editable in place,
     *     if the current user has the specified permission.
     * 
     *     
     *   
     * 
     */
    void editableDescription();

    /**
     * 
     */
    @TagFile("rssBar-with-iconSize")
    void rssBar_with_iconSize(Map args, Closure body);

    /**
     * 
     */
    @TagFile("rssBar-with-iconSize")
    void rssBar_with_iconSize(Closure body);

    /**
     * 
     */
    @TagFile("rssBar-with-iconSize")
    void rssBar_with_iconSize(Map args);

    /**
     * 
     */
    @TagFile("rssBar-with-iconSize")
    void rssBar_with_iconSize();

    /**
     * 
     */
    void iconSize(Map args, Closure body);

    /**
     * 
     */
    void iconSize(Closure body);

    /**
     * 
     */
    void iconSize(Map args);

    /**
     * 
     */
    void iconSize();

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("aggregated-failed-tests")
    void aggregated_failed_tests(Map args, Closure body);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("aggregated-failed-tests")
    void aggregated_failed_tests(Closure body);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("aggregated-failed-tests")
    void aggregated_failed_tests(Map args);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("aggregated-failed-tests")
    void aggregated_failed_tests();

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("failed-test")
    void failed_test(Map args, Closure body);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("failed-test")
    void failed_test(Closure body);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("failed-test")
    void failed_test(Map args);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("failed-test")
    void failed_test();

    /**
     * 
     *     Shows a list of tasks.
     * 
     *     
     *   
     * 
     */
    void actions(Map args, Closure body);

    /**
     * 
     *     Shows a list of tasks.
     * 
     *     
     *   
     * 
     */
    void actions(Closure body);

    /**
     * 
     *     Shows a list of tasks.
     * 
     *     
     *   
     * 
     */
    void actions(Map args);

    /**
     * 
     *     Shows a list of tasks.
     * 
     *     
     *   
     * 
     */
    void actions();

    /**
     * 
     */
    void editTypeIcon(Map args, Closure body);

    /**
     * 
     */
    void editTypeIcon(Closure body);

    /**
     * 
     */
    void editTypeIcon(Map args);

    /**
     * 
     */
    void editTypeIcon();

    /**
     * 
     *     Display the ball in a TD.
     *     
     *     
     *     
     *   
     * 
     */
    void ballColorTd(Map args, Closure body);

    /**
     * 
     *     Display the ball in a TD.
     *     
     *     
     *     
     *   
     * 
     */
    void ballColorTd(Closure body);

    /**
     * 
     *     Display the ball in a TD.
     *     
     *     
     *     
     *   
     * 
     */
    void ballColorTd(Map args);

    /**
     * 
     *     Display the ball in a TD.
     *     
     *     
     *     
     *   
     * 
     */
    void ballColorTd();

    /**
     * 
     */
    void progressiveText(Map args, Closure body);

    /**
     * 
     */
    void progressiveText(Closure body);

    /**
     * 
     */
    void progressiveText(Map args);

    /**
     * 
     */
    void progressiveText();

    /**
     * 
     *     Renders a list of jobs and their key information.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void projectView(Map args, Closure body);

    /**
     * 
     *     Renders a list of jobs and their key information.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void projectView(Closure body);

    /**
     * 
     *     Renders a list of jobs and their key information.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void projectView(Map args);

    /**
     * 
     *     Renders a list of jobs and their key information.
     * 
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void projectView();

    /**
     * 
     */
    void rssBar(Map args, Closure body);

    /**
     * 
     */
    void rssBar(Closure body);

    /**
     * 
     */
    void rssBar(Map args);

    /**
     * 
     */
    void rssBar();

    /**
     * 
     */
    void projectViewRow(Map args, Closure body);

    /**
     * 
     */
    void projectViewRow(Closure body);

    /**
     * 
     */
    void projectViewRow(Map args);

    /**
     * 
     */
    void projectViewRow();

    /**
     * 
     *     Displays the build queue as &lt;l:pane>
     * 
     *     
     *     
     *   
     * 
     */
    void queue(Map args, Closure body);

    /**
     * 
     *     Displays the build queue as &lt;l:pane>
     * 
     *     
     *     
     *   
     * 
     */
    void queue(Closure body);

    /**
     * 
     *     Displays the build queue as &lt;l:pane>
     * 
     *     
     *     
     *   
     * 
     */
    void queue(Map args);

    /**
     * 
     *     Displays the build queue as &lt;l:pane>
     * 
     *     
     *     
     *   
     * 
     */
    void queue();

    /**
     * 
     *     Progress bar for a build in progress.
     * 
     *     
     *     
     *   
     * 
     */
    void buildProgressBar(Map args, Closure body);

    /**
     * 
     *     Progress bar for a build in progress.
     * 
     *     
     *     
     *   
     * 
     */
    void buildProgressBar(Closure body);

    /**
     * 
     *     Progress bar for a build in progress.
     * 
     *     
     *     
     *   
     * 
     */
    void buildProgressBar(Map args);

    /**
     * 
     *     Progress bar for a build in progress.
     * 
     *     
     *     
     *   
     * 
     */
    void buildProgressBar();

    /**
     * 
     *     Creates a table of builds.
     *     
     *   
     * 
     */
    void buildListTable(Map args, Closure body);

    /**
     * 
     *     Creates a table of builds.
     *     
     *   
     * 
     */
    void buildListTable(Closure body);

    /**
     * 
     *     Creates a table of builds.
     *     
     *   
     * 
     */
    void buildListTable(Map args);

    /**
     * 
     *     Creates a table of builds.
     *     
     *   
     * 
     */
    void buildListTable();

    /**
     * 
     */
    void setIconSize(Map args, Closure body);

    /**
     * 
     */
    void setIconSize(Closure body);

    /**
     * 
     */
    void setIconSize(Map args);

    /**
     * 
     */
    void setIconSize();

    /**
     * 
     *     Renders a help entry for one environment variable. See EnvironmentContributor. The body of this tag
     *     renders the content.
     *     
     *   
     * 
     */
    void buildEnvVar(Map args, Closure body);

    /**
     * 
     *     Renders a help entry for one environment variable. See EnvironmentContributor. The body of this tag
     *     renders the content.
     *     
     *   
     * 
     */
    void buildEnvVar(Closure body);

    /**
     * 
     *     Renders a help entry for one environment variable. See EnvironmentContributor. The body of this tag
     *     renders the content.
     *     
     *   
     * 
     */
    void buildEnvVar(Map args);

    /**
     * 
     *     Renders a help entry for one environment variable. See EnvironmentContributor. The body of this tag
     *     renders the content.
     *     
     *   
     * 
     */
    void buildEnvVar();

    /**
     * 
     *     Displays a link to a node.
     *     
     *     
     *   
     * 
     */
    void node(Map args, Closure body);

    /**
     * 
     *     Displays a link to a node.
     *     
     *     
     *   
     * 
     */
    void node(Closure body);

    /**
     * 
     *     Displays a link to a node.
     *     
     *     
     *   
     * 
     */
    void node(Map args);

    /**
     * 
     *     Displays a link to a node.
     *     
     *     
     *   
     * 
     */
    void node();

    /**
     * 
     */
    void buildRangeLink(Map args, Closure body);

    /**
     * 
     */
    void buildRangeLink(Closure body);

    /**
     * 
     */
    void buildRangeLink(Map args);

    /**
     * 
     */
    void buildRangeLink();

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("test-result")
    void test_result(Map args, Closure body);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("test-result")
    void test_result(Closure body);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("test-result")
    void test_result(Map args);

    /**
     * 
     *       DEPRECATED
     *   
     * 
     */
    @TagFile("test-result")
    void test_result();

    /**
     * 
     *     Displays the status of executors.
     *     
     *   
     * 
     */
    void executors(Map args, Closure body);

    /**
     * 
     *     Displays the status of executors.
     *     
     *   
     * 
     */
    void executors(Closure body);

    /**
     * 
     *     Displays the status of executors.
     *     
     *   
     * 
     */
    void executors(Map args);

    /**
     * 
     *     Displays the status of executors.
     *     
     *   
     * 
     */
    void executors();

    /**
     * 
     */
    void progressBar(Map args, Closure body);

    /**
     * 
     */
    void progressBar(Closure body);

    /**
     * 
     */
    void progressBar(Map args);

    /**
     * 
     */
    void progressBar();

    /**
     * 
     */
    void buildLink(Map args, Closure body);

    /**
     * 
     */
    void buildLink(Closure body);

    /**
     * 
     */
    void buildLink(Map args);

    /**
     * 
     */
    void buildLink();

    /**
     * 
     *     Displays a link with a large icon. Used in the project top page.
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void summary(Map args, Closure body);

    /**
     * 
     *     Displays a link with a large icon. Used in the project top page.
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void summary(Closure body);

    /**
     * 
     *     Displays a link with a large icon. Used in the project top page.
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void summary(Map args);

    /**
     * 
     *     Displays a link with a large icon. Used in the project top page.
     * 
     *     
     *     
     *     
     *     
     *   
     * 
     */
    void summary();

    /**
     * 
     */
    void projectViewNested(Map args, Closure body);

    /**
     * 
     */
    void projectViewNested(Closure body);

    /**
     * 
     */
    void projectViewNested(Map args);

    /**
     * 
     */
    void projectViewNested();

    /**
     * 
     */
    void help(Map args, Closure body);

    /**
     * 
     */
    void help(Closure body);

    /**
     * 
     */
    void help(Map args);

    /**
     * 
     */
    void help();

    /**
     * 
     *     Displays a link when given an AbstractItem. It is assumed that that Abstract
     *     Item is passed in ${it}
     *   
     * 
     */
    void abstractItemLink(Map args, Closure body);

    /**
     * 
     *     Displays a link when given an AbstractItem. It is assumed that that Abstract
     *     Item is passed in ${it}
     *   
     * 
     */
    void abstractItemLink(Closure body);

    /**
     * 
     *     Displays a link when given an AbstractItem. It is assumed that that Abstract
     *     Item is passed in ${it}
     *   
     * 
     */
    void abstractItemLink(Map args);

    /**
     * 
     *     Displays a link when given an AbstractItem. It is assumed that that Abstract
     *     Item is passed in ${it}
     *   
     * 
     */
    void abstractItemLink();

    /**
     * 
     *     Generates a listing of the build artifacts.
     *     Depending on the size of the artifact, this will either produce a list or a link to the directory view.
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void artifactList(Map args, Closure body);

    /**
     * 
     *     Generates a listing of the build artifacts.
     *     Depending on the size of the artifact, this will either produce a list or a link to the directory view.
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void artifactList(Closure body);

    /**
     * 
     *     Generates a listing of the build artifacts.
     *     Depending on the size of the artifact, this will either produce a list or a link to the directory view.
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void artifactList(Map args);

    /**
     * 
     *     Generates a listing of the build artifacts.
     *     Depending on the size of the artifact, this will either produce a list or a link to the directory view.
     * 
     *     
     *     
     *     
     *   
     * 
     */
    void artifactList();

    /**
     * 
     *     Dispaly sortable table of properties.
     * 
     *     
     *   
     * 
     */
    void propertyTable(Map args, Closure body);

    /**
     * 
     *     Dispaly sortable table of properties.
     * 
     *     
     *   
     * 
     */
    void propertyTable(Closure body);

    /**
     * 
     *     Dispaly sortable table of properties.
     * 
     *     
     *   
     * 
     */
    void propertyTable(Map args);

    /**
     * 
     *     Dispaly sortable table of properties.
     * 
     *     
     *   
     * 
     */
    void propertyTable();

}
