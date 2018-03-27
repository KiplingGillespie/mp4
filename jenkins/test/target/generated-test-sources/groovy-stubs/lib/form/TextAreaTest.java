package lib.form;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class TextAreaTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public org.jvnet.hudson.test.JenkinsRule j;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  lib.form.TextAreaTest.TestBuilder.DescriptorImpl getD() { return (lib.form.TextAreaTest.TestBuilder.DescriptorImpl)null;}
public  void setD(lib.form.TextAreaTest.TestBuilder.DescriptorImpl value) { }
@org.junit.Test() @org.jvnet.hudson.test.Issue(value="JENKINS-19457") public  void validation() { }
public static class TestBuilder
  extends hudson.tasks.Builder  implements
    groovy.lang.GroovyObject {
@org.kohsuke.stapler.DataBoundConstructor() public TestBuilder
() {}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.lang.String getText1() { return (java.lang.String)null;}
public  java.lang.String getText2() { return (java.lang.String)null;}
@org.jvnet.hudson.test.TestExtension() public static class DescriptorImpl
  extends hudson.tasks.BuildStepDescriptor<hudson.tasks.Builder>  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.lang.Object getText1() { return null;}
public  void setText1(java.lang.Object value) { }
public  java.lang.Object getText2() { return null;}
public  void setText2(java.lang.Object value) { }
@java.lang.Override() public  boolean isApplicable(java.lang.Class<? extends hudson.model.AbstractProject> jobType) { return false;}
public  hudson.util.FormValidation doCheckText1(java.lang.String value) { return (hudson.util.FormValidation)null;}
public  hudson.util.FormValidation doCheckText2(java.lang.String text1) { return (hudson.util.FormValidation)null;}
@java.lang.Override() public  java.lang.String getDisplayName() { return (java.lang.String)null;}
}
}
}
