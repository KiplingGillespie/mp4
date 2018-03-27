package hudson.model;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class AbstractBuildTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public org.jvnet.hudson.test.GroovyJenkinsRule j;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void variablesResolved() { }
@org.junit.Test() public  void rawConsoleOutput() { }
public  java.lang.Object assertCulprits(hudson.model.AbstractBuild b, java.util.Collection<java.lang.String> expectedIds) { return null;}
@org.junit.Test() public  void culprits() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-19920") @org.junit.Test() public  void lastBuildNextBuild() { }
@org.junit.Test() public  void doNotInteruptBuildAbruptlyWhenExceptionThrownFromBuildStep() { }
private static class ThrowBuilder
  extends org.jvnet.hudson.test.TestBuilder  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() public  boolean perform(hudson.model.AbstractBuild build, hudson.Launcher launcher, hudson.model.BuildListener listener)throws java.lang.InterruptedException, java.io.IOException { return false;}
}
}
