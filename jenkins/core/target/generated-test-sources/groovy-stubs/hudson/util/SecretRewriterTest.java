package hudson.util;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class SecretRewriterTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public MockSecretRule mockSecretRule;
@org.junit.Rule() public jenkins.security.ConfidentialStoreRule confidentialStoreRule;
@org.junit.Rule() public org.junit.rules.TemporaryFolder tmp;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void singleFileRewrite() { }
public  void roundtrip(java.lang.String before, java.lang.String after) { }
public  java.lang.String encryptOld(java.lang.Object str) { return (java.lang.String)null;}
public  java.lang.String encryptNew(java.lang.Object str) { return (java.lang.String)null;}
@org.junit.Test() public  void recursionDetection() { }
}
