package hudson.util;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class BootFailureTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public org.junit.rules.TemporaryFolder tmpDir;
@org.junit.Rule() public org.jvnet.hudson.test.JenkinsRule j;
public static java.lang.Exception problem;
public static java.lang.Object runRecord;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public static  boolean getMakeBootFail() { return false;}
public static  boolean isMakeBootFail() { return false;}
public static  void setMakeBootFail(boolean value) { }
@org.junit.After() public  void tearDown() { }
@org.junit.Test() public  void runBootFailureScript() { }
public static class SeriousError
  extends java.lang.Error  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
}
@org.jvnet.hudson.test.TestExtension() public static class InduceBootFailure
  extends hudson.model.listeners.ItemListener  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() public  void onLoaded() { }
}
}
