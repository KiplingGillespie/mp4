package hudson.cli;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class BuildCommandTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public org.jvnet.hudson.test.JenkinsRule j;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void async() { }
@org.junit.Test() public  void sync() { }
@org.junit.Test() public  void syncWOutputStreaming() { }
@org.junit.Test() public  void parameters() { }
@org.junit.Test() public  void defaultParameters() { }
@org.jvnet.hudson.test.RandomlyFails(value="Started test0 #1") @org.junit.Test() public  void consoleOutput() { }
@org.jvnet.hudson.test.RandomlyFails(value="Started test0 #1") @org.junit.Test() public  void consoleOutputWhenBuildSchedulingRefused() { }
@org.junit.Test() public  void refuseToBuildDisabledProject() { }
@org.junit.Test() public  void refuseToBuildNewlyCoppiedProject() { }
@org.junit.Test() public  void correctlyParseMapValuesContainingEqualsSign() { }
@org.jvnet.hudson.test.Issue(value="JENKINS-15094") @org.junit.Test() public  void executorsAliveOnParameterWithNullDefaultValue()throws java.lang.Exception { }
@org.jvnet.hudson.test.TestExtension(value="consoleOutputWhenBuildSchedulingRefused") public static class UnschedulingVetoer
  extends hudson.model.Queue.QueueDecisionHandler  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  boolean shouldSchedule(hudson.model.Queue.Task task, java.util.List<hudson.model.Action> actions) { return false;}
}
public static final class NullDefaultValueParameterDefinition
  extends hudson.model.SimpleParameterDefinition  implements
    groovy.lang.GroovyObject {
public NullDefaultValueParameterDefinition
() {
super ((java.lang.String)null, (java.lang.String)null);
}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() public  hudson.model.ParameterValue createValue(java.lang.String value) { return (hudson.model.ParameterValue)null;}
@java.lang.Override() public  hudson.model.ParameterValue createValue(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject jo) { return (hudson.model.ParameterValue)null;}
@java.lang.Override() public  hudson.model.ParameterValue getDefaultParameterValue() { return (hudson.model.ParameterValue)null;}
@hudson.Extension() public static class DescriptorImpl
  extends hudson.model.ParameterDefinition.ParameterDescriptor  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() public  java.lang.String getDisplayName() { return (java.lang.String)null;}
}
}
}
