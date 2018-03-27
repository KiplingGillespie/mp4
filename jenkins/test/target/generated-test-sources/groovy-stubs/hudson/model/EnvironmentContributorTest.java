package hudson.model;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class EnvironmentContributorTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public org.jvnet.hudson.test.JenkinsRule j;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void testProjectScoped() { }
@org.jvnet.hudson.test.TestExtension(value="testProjectScoped") public static class JobScopedInjection
  extends hudson.model.EnvironmentContributor  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() public  void buildEnvironmentFor(hudson.model.Job j, hudson.EnvVars envs, hudson.model.TaskListener listener) { }
}
}
