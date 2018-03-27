package hudson.model;

import hudson.security.*;
import hudson.security.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class AbstractProjectTest
  extends org.jvnet.hudson.test.HudsonTestCase  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  void testConfigRoundtrip() { }
public  void testWipeWorkspace() { }
@org.jvnet.hudson.test.recipes.PresetData(value=org.jvnet.hudson.test.recipes.PresetData.DataSet.NO_ANONYMOUS_READACCESS) public  void testWipeWorkspaceProtected() { }
@org.jvnet.hudson.test.recipes.PresetData(value=org.jvnet.hudson.test.recipes.PresetData.DataSet.ANONYMOUS_READONLY) public  void testWipeWorkspaceProtected2() { }
public  void testOptionalBlockDataBindingRoundtrip() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-4423") public  void testConfiguringBlockBuildWhenUpstreamBuildingRoundtrip() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-4202") public  void testPollingAndBuildExclusion() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-1986") public  void testBuildSymlinks() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-2543") public  void testSymlinkForPostBuildFailure() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-17137") public  void testExternalBuildDirectorySymlinks() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-17138") public  void testExternalBuildDirectoryRenameDelete() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-18678") public  void testRenameJobLostBuilds()throws java.lang.Exception { }
@org.jvnet.hudson.test.Issue(value="JENKINS-17575") public  void testDeleteRedirect() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-18407") public  void testQueueSuccessBehavior() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-18407") public  void testQueueSuccessBehaviorOverHTTP() { }
public  void testVectorTriggers() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-18813") public  void testRemoveTrigger() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-18813") public  void testAddTriggerSameType() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-18813") public  void testAddTriggerDifferentType() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-10615") public  void testWorkspaceLock() { }
public  void testRenameToPrivileged() { }
public  void testConfigDotXmlSubmissionToDifferentType() { }
}
