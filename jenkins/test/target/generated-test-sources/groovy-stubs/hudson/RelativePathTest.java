package hudson;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class RelativePathTest
  extends org.jvnet.hudson.test.HudsonTestCase  implements
    hudson.model.Describable<hudson.RelativePathTest>,    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.jvnet.hudson.test.Issue(value="JENKINS-18776") public  void testRelativePath() { }
public  java.lang.String getName() { return (java.lang.String)null;}
public  hudson.RelativePathTest.Model getModel() { return (hudson.RelativePathTest.Model)null;}
public  hudson.RelativePathTest.DescriptorImpl getDescriptor() { return (hudson.RelativePathTest.DescriptorImpl)null;}
@org.jvnet.hudson.test.TestExtension() public static class DescriptorImpl
  extends hudson.model.Descriptor<hudson.RelativePathTest>  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() public  java.lang.String getDisplayName() { return (java.lang.String)null;}
}
public static class Model
  extends hudson.model.AbstractDescribableImpl<hudson.RelativePathTest.Model>  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.jvnet.hudson.test.TestExtension() public static class DescriptorImpl
  extends hudson.model.Descriptor<hudson.RelativePathTest.Model>  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  boolean getTouched() { return false;}
public  boolean isTouched() { return false;}
public  void setTouched(boolean value) { }
@java.lang.Override() public  java.lang.String getDisplayName() { return (java.lang.String)null;}
public  hudson.util.ListBoxModel doFillAbcItems(java.lang.String name) { return (hudson.util.ListBoxModel)null;}
}
}
}
