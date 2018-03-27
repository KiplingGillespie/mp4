package hudson.util;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class SecretTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public jenkins.security.ConfidentialStoreRule confidentialStore;
@org.junit.Rule() public MockSecretRule mockSecretRule;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Test() public  void testEncrypt() { }
@org.junit.Test() public  void testDecrypt() { }
@org.junit.Test() public  void testSerialization() { }
@org.junit.Test() public  void testCompatibilityFromString() { }
@org.junit.Test() public  void migrationFromLegacyKeyToConfidentialStore() { }
public static class Foo
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  hudson.util.Secret getPassword() { return (hudson.util.Secret)null;}
public  void setPassword(hudson.util.Secret value) { }
}
}
