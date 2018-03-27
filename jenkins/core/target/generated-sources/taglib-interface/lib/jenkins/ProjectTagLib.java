
package lib.jenkins;

import java.util.Map;
import groovy.lang.Closure;
import org.kohsuke.stapler.jelly.groovy.TagFile;
import org.kohsuke.stapler.jelly.groovy.TagLibraryUri;
import org.kohsuke.stapler.jelly.groovy.TypedTagLibrary;

@TagLibraryUri("/lib/hudson/project")
public interface ProjectTagLib
    extends TypedTagLibrary
{


    /**
     * 
     */
    @TagFile("config-builders")
    void config_builders(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-builders")
    void config_builders(Closure body);

    /**
     * 
     */
    @TagFile("config-builders")
    void config_builders(Map args);

    /**
     * 
     */
    @TagFile("config-builders")
    void config_builders();

    /**
     * 
     */
    @TagFile("config-retryCount")
    void config_retryCount(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-retryCount")
    void config_retryCount(Closure body);

    /**
     * 
     */
    @TagFile("config-retryCount")
    void config_retryCount(Map args);

    /**
     * 
     */
    @TagFile("config-retryCount")
    void config_retryCount();

    /**
     * 
     */
    void projectActionFloatingBox(Map args, Closure body);

    /**
     * 
     */
    void projectActionFloatingBox(Closure body);

    /**
     * 
     */
    void projectActionFloatingBox(Map args);

    /**
     * 
     */
    void projectActionFloatingBox();

    /**
     * 
     */
    @TagFile("config-blockWhenUpstreamBuilding")
    void config_blockWhenUpstreamBuilding(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-blockWhenUpstreamBuilding")
    void config_blockWhenUpstreamBuilding(Closure body);

    /**
     * 
     */
    @TagFile("config-blockWhenUpstreamBuilding")
    void config_blockWhenUpstreamBuilding(Map args);

    /**
     * 
     */
    @TagFile("config-blockWhenUpstreamBuilding")
    void config_blockWhenUpstreamBuilding();

    /**
     * 
     */
    @TagFile("config-upstream-pseudo-trigger")
    void config_upstream_pseudo_trigger(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-upstream-pseudo-trigger")
    void config_upstream_pseudo_trigger(Closure body);

    /**
     * 
     */
    @TagFile("config-upstream-pseudo-trigger")
    void config_upstream_pseudo_trigger(Map args);

    /**
     * 
     */
    @TagFile("config-upstream-pseudo-trigger")
    void config_upstream_pseudo_trigger();

    /**
     * 
     */
    @TagFile("config-scm")
    void config_scm(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-scm")
    void config_scm(Closure body);

    /**
     * 
     */
    @TagFile("config-scm")
    void config_scm(Map args);

    /**
     * 
     */
    @TagFile("config-scm")
    void config_scm();

    /**
     * 
     */
    @TagFile("config-customWorkspace")
    void config_customWorkspace(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-customWorkspace")
    void config_customWorkspace(Closure body);

    /**
     * 
     */
    @TagFile("config-customWorkspace")
    void config_customWorkspace(Map args);

    /**
     * 
     */
    @TagFile("config-customWorkspace")
    void config_customWorkspace();

    /**
     * 
     *     Deprecated as of 1.463. Use &lt;config-publishers2> and update your code to do
     *     publishers.rebuildHetero(req, json, Publisher.all(), "publisher");
     *   
     * 
     */
    @TagFile("config-publishers")
    void config_publishers(Map args, Closure body);

    /**
     * 
     *     Deprecated as of 1.463. Use &lt;config-publishers2> and update your code to do
     *     publishers.rebuildHetero(req, json, Publisher.all(), "publisher");
     *   
     * 
     */
    @TagFile("config-publishers")
    void config_publishers(Closure body);

    /**
     * 
     *     Deprecated as of 1.463. Use &lt;config-publishers2> and update your code to do
     *     publishers.rebuildHetero(req, json, Publisher.all(), "publisher");
     *   
     * 
     */
    @TagFile("config-publishers")
    void config_publishers(Map args);

    /**
     * 
     *     Deprecated as of 1.463. Use &lt;config-publishers2> and update your code to do
     *     publishers.rebuildHetero(req, json, Publisher.all(), "publisher");
     *   
     * 
     */
    @TagFile("config-publishers")
    void config_publishers();

    /**
     * 
     */
    @TagFile("config-disableBuild")
    void config_disableBuild(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-disableBuild")
    void config_disableBuild(Closure body);

    /**
     * 
     */
    @TagFile("config-disableBuild")
    void config_disableBuild(Map args);

    /**
     * 
     */
    @TagFile("config-disableBuild")
    void config_disableBuild();

    /**
     * 
     */
    @TagFile("config-publishers2")
    void config_publishers2(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-publishers2")
    void config_publishers2(Closure body);

    /**
     * 
     */
    @TagFile("config-publishers2")
    void config_publishers2(Map args);

    /**
     * 
     */
    @TagFile("config-publishers2")
    void config_publishers2();

    /**
     * 
     */
    @TagFile("build-permalink")
    void build_permalink(Map args, Closure body);

    /**
     * 
     */
    @TagFile("build-permalink")
    void build_permalink(Closure body);

    /**
     * 
     */
    @TagFile("build-permalink")
    void build_permalink(Map args);

    /**
     * 
     */
    @TagFile("build-permalink")
    void build_permalink();

    /**
     * 
     */
    @TagFile("config-trigger")
    void config_trigger(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-trigger")
    void config_trigger(Closure body);

    /**
     * 
     */
    @TagFile("config-trigger")
    void config_trigger(Map args);

    /**
     * 
     */
    @TagFile("config-trigger")
    void config_trigger();

    /**
     * 
     */
    @TagFile("config-blockWhenDownstreamBuilding")
    void config_blockWhenDownstreamBuilding(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-blockWhenDownstreamBuilding")
    void config_blockWhenDownstreamBuilding(Closure body);

    /**
     * 
     */
    @TagFile("config-blockWhenDownstreamBuilding")
    void config_blockWhenDownstreamBuilding(Map args);

    /**
     * 
     */
    @TagFile("config-blockWhenDownstreamBuilding")
    void config_blockWhenDownstreamBuilding();

    /**
     * 
     */
    @TagFile("console-link")
    void console_link(Map args, Closure body);

    /**
     * 
     */
    @TagFile("console-link")
    void console_link(Closure body);

    /**
     * 
     */
    @TagFile("console-link")
    void console_link(Map args);

    /**
     * 
     */
    @TagFile("console-link")
    void console_link();

    /**
     * 
     */
    @TagFile("config-buildWrappers")
    void config_buildWrappers(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-buildWrappers")
    void config_buildWrappers(Closure body);

    /**
     * 
     */
    @TagFile("config-buildWrappers")
    void config_buildWrappers(Map args);

    /**
     * 
     */
    @TagFile("config-buildWrappers")
    void config_buildWrappers();

    /**
     * 
     */
    @TagFile("config-concurrentBuild")
    void config_concurrentBuild(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-concurrentBuild")
    void config_concurrentBuild(Closure body);

    /**
     * 
     */
    @TagFile("config-concurrentBuild")
    void config_concurrentBuild(Map args);

    /**
     * 
     */
    @TagFile("config-concurrentBuild")
    void config_concurrentBuild();

    /**
     * 
     */
    @TagFile("config-quietPeriod")
    void config_quietPeriod(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-quietPeriod")
    void config_quietPeriod(Closure body);

    /**
     * 
     */
    @TagFile("config-quietPeriod")
    void config_quietPeriod(Map args);

    /**
     * 
     */
    @TagFile("config-quietPeriod")
    void config_quietPeriod();

    /**
     * 
     */
    @TagFile("config-assignedLabel")
    void config_assignedLabel(Map args, Closure body);

    /**
     * 
     */
    @TagFile("config-assignedLabel")
    void config_assignedLabel(Closure body);

    /**
     * 
     */
    @TagFile("config-assignedLabel")
    void config_assignedLabel(Map args);

    /**
     * 
     */
    @TagFile("config-assignedLabel")
    void config_assignedLabel();

    /**
     * 
     */
    void configurable(Map args, Closure body);

    /**
     * 
     */
    void configurable(Closure body);

    /**
     * 
     */
    void configurable(Map args);

    /**
     * 
     */
    void configurable();

    /**
     * 
     */
    @TagFile("upstream-downstream")
    void upstream_downstream(Map args, Closure body);

    /**
     * 
     */
    @TagFile("upstream-downstream")
    void upstream_downstream(Closure body);

    /**
     * 
     */
    @TagFile("upstream-downstream")
    void upstream_downstream(Map args);

    /**
     * 
     */
    @TagFile("upstream-downstream")
    void upstream_downstream();

}
