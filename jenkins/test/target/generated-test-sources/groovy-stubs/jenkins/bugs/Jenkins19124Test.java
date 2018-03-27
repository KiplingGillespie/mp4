package jenkins.bugs;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class Jenkins19124Test
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public org.jvnet.hudson.test.JenkinsRule j;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  jenkins.bugs.Jenkins19124Test.DescriptorImpl getD() { return (jenkins.bugs.Jenkins19124Test.DescriptorImpl)null;}
public  void setD(jenkins.bugs.Jenkins19124Test.DescriptorImpl value) { }
@org.jvnet.hudson.test.Issue(value="JENKINS-19124") @org.junit.Test() public  void interrelatedFormValidation() { }
public static class Foo
  extends hudson.tasks.Builder  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.lang.String getAlpha() { return (java.lang.String)null;}
public  java.lang.String getBravo() { return (java.lang.String)null;}
@java.lang.Override() public  boolean perform(hudson.model.AbstractBuild<?, ?> build, hudson.Launcher launcher, hudson.model.BuildListener listener)throws java.lang.InterruptedException, java.io.IOException { return false;}
}
@org.jvnet.hudson.test.TestExtension() public static class DescriptorImpl
  extends hudson.tasks.BuildStepDescriptor<hudson.tasks.Builder>  implements
    groovy.lang.GroovyObject {
public DescriptorImpl
() {
super ((java.lang.Class)null);
}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.lang.String getAlpha() { return (java.lang.String)null;}
public  void setAlpha(java.lang.String value) { }
public  java.lang.String getBravo() { return (java.lang.String)null;}
public  void setBravo(java.lang.String value) { }
@java.lang.Override() public  java.lang.String getDisplayName() { return (java.lang.String)null;}
public  hudson.util.FormValidation doCheckAlpha(java.lang.String value, java.lang.String bravo) { return (hudson.util.FormValidation)null;}
public  hudson.util.ListBoxModel doFillBravoItems() { return (hudson.util.ListBoxModel)null;}
@java.lang.Override() public  boolean isApplicable(java.lang.Class<? extends hudson.model.AbstractProject> jobType) { return false;}
}
}
