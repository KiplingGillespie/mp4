package hudson.security;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class TokenBasedRememberMeServices2Test
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
@org.junit.Rule() public org.jvnet.hudson.test.JenkinsRule j;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.junit.Before() public  void setUp() { }
@org.junit.After() public  void tearDown() { }
@org.junit.Test() public  void rememberMeAutoLoginFailure() { }
@org.junit.Test() public  void basicFlow() { }
private class InvalidUserWhenLoggingBackInRealm
  extends hudson.security.AbstractPasswordBasedSecurityRealm  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() protected  org.acegisecurity.userdetails.UserDetails authenticate(java.lang.String username, java.lang.String password)throws org.acegisecurity.AuthenticationException { return (org.acegisecurity.userdetails.UserDetails)null;}
@java.lang.Override() public  hudson.security.GroupDetails loadGroupByGroupname(java.lang.String groupname)throws org.acegisecurity.userdetails.UsernameNotFoundException, org.springframework.dao.DataAccessException { return (hudson.security.GroupDetails)null;}
@java.lang.Override() public  org.acegisecurity.userdetails.UserDetails loadUserByUsername(java.lang.String username)throws org.acegisecurity.userdetails.UsernameNotFoundException, org.springframework.dao.DataAccessException { return (org.acegisecurity.userdetails.UserDetails)null;}
}
private class StupidRealm
  extends hudson.security.TokenBasedRememberMeServices2Test.InvalidUserWhenLoggingBackInRealm {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() public  org.acegisecurity.userdetails.UserDetails loadUserByUsername(java.lang.String username)throws org.acegisecurity.userdetails.UsernameNotFoundException, org.springframework.dao.DataAccessException { return (org.acegisecurity.userdetails.UserDetails)null;}
}
}
