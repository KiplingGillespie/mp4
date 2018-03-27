// CHECKSTYLE:OFF

package hudson.security;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code FullControlOnceLoggedInAuthorizationStrategy.DisplayName}:
     * {@code Logged-in users can do anything}.
     * 
     * @return
     *     {@code Logged-in users can do anything}
     */
    public static String FullControlOnceLoggedInAuthorizationStrategy_DisplayName() {
        return holder.format("FullControlOnceLoggedInAuthorizationStrategy.DisplayName");
    }

    /**
     * Key {@code FullControlOnceLoggedInAuthorizationStrategy.DisplayName}:
     * {@code Logged-in users can do anything}.
     * 
     * @return
     *     {@code Logged-in users can do anything}
     */
    public static Localizable _FullControlOnceLoggedInAuthorizationStrategy_DisplayName() {
        return new Localizable(holder, "FullControlOnceLoggedInAuthorizationStrategy.DisplayName");
    }

    /**
     * Key {@code AccessDeniedException2.MissingPermission}: {@code {0} is
     * missing the {1} permission}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is missing the {1} permission}
     */
    public static String AccessDeniedException2_MissingPermission(Object arg0, Object arg1) {
        return holder.format("AccessDeniedException2.MissingPermission", arg0, arg1);
    }

    /**
     * Key {@code AccessDeniedException2.MissingPermission}: {@code {0} is
     * missing the {1} permission}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} is missing the {1} permission}
     */
    public static Localizable _AccessDeniedException2_MissingPermission(Object arg0, Object arg1) {
        return new Localizable(holder, "AccessDeniedException2.MissingPermission", arg0, arg1);
    }

    /**
     * Key {@code PAMSecurityRealm.Success}: {@code Success}.
     * 
     * @return
     *     {@code Success}
     */
    public static String PAMSecurityRealm_Success() {
        return holder.format("PAMSecurityRealm.Success");
    }

    /**
     * Key {@code PAMSecurityRealm.Success}: {@code Success}.
     * 
     * @return
     *     {@code Success}
     */
    public static Localizable _PAMSecurityRealm_Success() {
        return new Localizable(holder, "PAMSecurityRealm.Success");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.DisplayName}: {@code Jenkins’
     * own user database}.
     * 
     * @return
     *     {@code Jenkins’ own user database}
     */
    public static String HudsonPrivateSecurityRealm_DisplayName() {
        return holder.format("HudsonPrivateSecurityRealm.DisplayName");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.DisplayName}: {@code Jenkins’
     * own user database}.
     * 
     * @return
     *     {@code Jenkins’ own user database}
     */
    public static Localizable _HudsonPrivateSecurityRealm_DisplayName() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.DisplayName");
    }

    /**
     * Key {@code Permission.Permissions.Title}: {@code N/A}.
     * 
     * @return
     *     {@code N/A}
     */
    public static String Permission_Permissions_Title() {
        return holder.format("Permission.Permissions.Title");
    }

    /**
     * Key {@code Permission.Permissions.Title}: {@code N/A}.
     * 
     * @return
     *     {@code N/A}
     */
    public static Localizable _Permission_Permissions_Title() {
        return new Localizable(holder, "Permission.Permissions.Title");
    }

    /**
     * Key {@code
     * HudsonPrivateSecurityRealm.CreateAccount.InvalidEmailAddress}: {@code
     * Invalid e-mail address}.
     * 
     * @return
     *     {@code Invalid e-mail address}
     */
    public static String HudsonPrivateSecurityRealm_CreateAccount_InvalidEmailAddress() {
        return holder.format("HudsonPrivateSecurityRealm.CreateAccount.InvalidEmailAddress");
    }

    /**
     * Key {@code
     * HudsonPrivateSecurityRealm.CreateAccount.InvalidEmailAddress}: {@code
     * Invalid e-mail address}.
     * 
     * @return
     *     {@code Invalid e-mail address}
     */
    public static Localizable _HudsonPrivateSecurityRealm_CreateAccount_InvalidEmailAddress() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.CreateAccount.InvalidEmailAddress");
    }

    /**
     * Key {@code GlobalSecurityConfiguration.DisplayName}: {@code Configure
     * Global Security}.
     * 
     * @return
     *     {@code Configure Global Security}
     */
    public static String GlobalSecurityConfiguration_DisplayName() {
        return holder.format("GlobalSecurityConfiguration.DisplayName");
    }

    /**
     * Key {@code GlobalSecurityConfiguration.DisplayName}: {@code Configure
     * Global Security}.
     * 
     * @return
     *     {@code Configure Global Security}
     */
    public static Localizable _GlobalSecurityConfiguration_DisplayName() {
        return new Localizable(holder, "GlobalSecurityConfiguration.DisplayName");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.ManageUserLinks.DisplayName}:
     * {@code Manage Users}.
     * 
     * @return
     *     {@code Manage Users}
     */
    public static String HudsonPrivateSecurityRealm_ManageUserLinks_DisplayName() {
        return holder.format("HudsonPrivateSecurityRealm.ManageUserLinks.DisplayName");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.ManageUserLinks.DisplayName}:
     * {@code Manage Users}.
     * 
     * @return
     *     {@code Manage Users}
     */
    public static Localizable _HudsonPrivateSecurityRealm_ManageUserLinks_DisplayName() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.ManageUserLinks.DisplayName");
    }

    /**
     * Key {@code LDAPSecurityRealm.UnableToConnect}: {@code Unable to
     * connect to {0} : {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unable to connect to {0} : {1}}
     */
    public static String LDAPSecurityRealm_UnableToConnect(Object arg0, Object arg1) {
        return holder.format("LDAPSecurityRealm.UnableToConnect", arg0, arg1);
    }

    /**
     * Key {@code LDAPSecurityRealm.UnableToConnect}: {@code Unable to
     * connect to {0} : {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unable to connect to {0} : {1}}
     */
    public static Localizable _LDAPSecurityRealm_UnableToConnect(Object arg0, Object arg1) {
        return new Localizable(holder, "LDAPSecurityRealm.UnableToConnect", arg0, arg1);
    }

    /**
     * Key {@code
     * HudsonPrivateSecurityRealm.CreateAccount.TextNotMatchWordInImage}:
     * {@code Text didn't match the word shown in the image}.
     * 
     * @return
     *     {@code Text didn't match the word shown in the image}
     */
    public static String HudsonPrivateSecurityRealm_CreateAccount_TextNotMatchWordInImage() {
        return holder.format("HudsonPrivateSecurityRealm.CreateAccount.TextNotMatchWordInImage");
    }

    /**
     * Key {@code
     * HudsonPrivateSecurityRealm.CreateAccount.TextNotMatchWordInImage}:
     * {@code Text didn't match the word shown in the image}.
     * 
     * @return
     *     {@code Text didn't match the word shown in the image}
     */
    public static Localizable _HudsonPrivateSecurityRealm_CreateAccount_TextNotMatchWordInImage() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.CreateAccount.TextNotMatchWordInImage");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.ManageUserLinks.Description}:
     * {@code Create/delete/modify users that can log in to this Jenkins}.
     * 
     * @return
     *     {@code Create/delete/modify users that can log in to this Jenkins}
     */
    public static String HudsonPrivateSecurityRealm_ManageUserLinks_Description() {
        return holder.format("HudsonPrivateSecurityRealm.ManageUserLinks.Description");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.ManageUserLinks.Description}:
     * {@code Create/delete/modify users that can log in to this Jenkins}.
     * 
     * @return
     *     {@code Create/delete/modify users that can log in to this Jenkins}
     */
    public static Localizable _HudsonPrivateSecurityRealm_ManageUserLinks_Description() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.ManageUserLinks.Description");
    }

    /**
     * Key {@code PAMSecurityRealm.BelongToGroup}: {@code {0} needs to belong
     * to group {1} to read /etc/shadow}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} needs to belong to group {1} to read /etc/shadow}
     */
    public static String PAMSecurityRealm_BelongToGroup(Object arg0, Object arg1) {
        return holder.format("PAMSecurityRealm.BelongToGroup", arg0, arg1);
    }

    /**
     * Key {@code PAMSecurityRealm.BelongToGroup}: {@code {0} needs to belong
     * to group {1} to read /etc/shadow}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} needs to belong to group {1} to read /etc/shadow}
     */
    public static Localizable _PAMSecurityRealm_BelongToGroup(Object arg0, Object arg1) {
        return new Localizable(holder, "PAMSecurityRealm.BelongToGroup", arg0, arg1);
    }

    /**
     * Key {@code
     * HudsonPrivateSecurityRealm.CreateAccount.UserNameAlreadyTaken}: {@code
     * User name is already taken}.
     * 
     * @return
     *     {@code User name is already taken}
     */
    public static String HudsonPrivateSecurityRealm_CreateAccount_UserNameAlreadyTaken() {
        return holder.format("HudsonPrivateSecurityRealm.CreateAccount.UserNameAlreadyTaken");
    }

    /**
     * Key {@code
     * HudsonPrivateSecurityRealm.CreateAccount.UserNameAlreadyTaken}: {@code
     * User name is already taken}.
     * 
     * @return
     *     {@code User name is already taken}
     */
    public static Localizable _HudsonPrivateSecurityRealm_CreateAccount_UserNameAlreadyTaken() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.CreateAccount.UserNameAlreadyTaken");
    }

    /**
     * Key {@code PAMSecurityRealm.DisplayName}: {@code Unix user/group
     * database}.
     * 
     * @return
     *     {@code Unix user/group database}
     */
    public static String PAMSecurityRealm_DisplayName() {
        return holder.format("PAMSecurityRealm.DisplayName");
    }

    /**
     * Key {@code PAMSecurityRealm.DisplayName}: {@code Unix user/group
     * database}.
     * 
     * @return
     *     {@code Unix user/group database}
     */
    public static Localizable _PAMSecurityRealm_DisplayName() {
        return new Localizable(holder, "PAMSecurityRealm.DisplayName");
    }

    /**
     * Key {@code LDAPSecurityRealm.SyntaxOfServerField}: {@code Syntax of
     * server field is SERVER or SERVER:PORT or ldaps://SERVER[:PORT]}.
     * 
     * @return
     *     {@code Syntax of server field is SERVER or SERVER:PORT or
     *     ldaps://SERVER[:PORT]}
     */
    public static String LDAPSecurityRealm_SyntaxOfServerField() {
        return holder.format("LDAPSecurityRealm.SyntaxOfServerField");
    }

    /**
     * Key {@code LDAPSecurityRealm.SyntaxOfServerField}: {@code Syntax of
     * server field is SERVER or SERVER:PORT or ldaps://SERVER[:PORT]}.
     * 
     * @return
     *     {@code Syntax of server field is SERVER or SERVER:PORT or
     *     ldaps://SERVER[:PORT]}
     */
    public static Localizable _LDAPSecurityRealm_SyntaxOfServerField() {
        return new Localizable(holder, "LDAPSecurityRealm.SyntaxOfServerField");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.Details.DisplayName}: {@code
     * Password}.
     * 
     * @return
     *     {@code Password}
     */
    public static String HudsonPrivateSecurityRealm_Details_DisplayName() {
        return holder.format("HudsonPrivateSecurityRealm.Details.DisplayName");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.Details.DisplayName}: {@code
     * Password}.
     * 
     * @return
     *     {@code Password}
     */
    public static Localizable _HudsonPrivateSecurityRealm_Details_DisplayName() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.Details.DisplayName");
    }

    /**
     * Key {@code PAMSecurityRealm.ReadPermission}: {@code Jenkins needs to
     * be able to read /etc/shadow}.
     * 
     * @return
     *     {@code Jenkins needs to be able to read /etc/shadow}
     */
    public static String PAMSecurityRealm_ReadPermission() {
        return holder.format("PAMSecurityRealm.ReadPermission");
    }

    /**
     * Key {@code PAMSecurityRealm.ReadPermission}: {@code Jenkins needs to
     * be able to read /etc/shadow}.
     * 
     * @return
     *     {@code Jenkins needs to be able to read /etc/shadow}
     */
    public static Localizable _PAMSecurityRealm_ReadPermission() {
        return new Localizable(holder, "PAMSecurityRealm.ReadPermission");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.CreateAccount.PasswordRequired}:
     * {@code Password is required}.
     * 
     * @return
     *     {@code Password is required}
     */
    public static String HudsonPrivateSecurityRealm_CreateAccount_PasswordRequired() {
        return holder.format("HudsonPrivateSecurityRealm.CreateAccount.PasswordRequired");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.CreateAccount.PasswordRequired}:
     * {@code Password is required}.
     * 
     * @return
     *     {@code Password is required}
     */
    public static Localizable _HudsonPrivateSecurityRealm_CreateAccount_PasswordRequired() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.CreateAccount.PasswordRequired");
    }

    /**
     * Key {@code PAMSecurityRealm.Uid}: {@code uid: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code uid: {0}}
     */
    public static String PAMSecurityRealm_Uid(Object arg0) {
        return holder.format("PAMSecurityRealm.Uid", arg0);
    }

    /**
     * Key {@code PAMSecurityRealm.Uid}: {@code uid: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code uid: {0}}
     */
    public static Localizable _PAMSecurityRealm_Uid(Object arg0) {
        return new Localizable(holder, "PAMSecurityRealm.Uid", arg0);
    }

    /**
     * Key {@code LDAPSecurityRealm.DisplayName}: {@code LDAP}.
     * 
     * @return
     *     {@code LDAP}
     */
    public static String LDAPSecurityRealm_DisplayName() {
        return holder.format("LDAPSecurityRealm.DisplayName");
    }

    /**
     * Key {@code LDAPSecurityRealm.DisplayName}: {@code LDAP}.
     * 
     * @return
     *     {@code LDAP}
     */
    public static Localizable _LDAPSecurityRealm_DisplayName() {
        return new Localizable(holder, "LDAPSecurityRealm.DisplayName");
    }

    /**
     * Key {@code LDAPSecurityRealm.InvalidPortNumber}: {@code Invalid port
     * number}.
     * 
     * @return
     *     {@code Invalid port number}
     */
    public static String LDAPSecurityRealm_InvalidPortNumber() {
        return holder.format("LDAPSecurityRealm.InvalidPortNumber");
    }

    /**
     * Key {@code LDAPSecurityRealm.InvalidPortNumber}: {@code Invalid port
     * number}.
     * 
     * @return
     *     {@code Invalid port number}
     */
    public static Localizable _LDAPSecurityRealm_InvalidPortNumber() {
        return new Localizable(holder, "LDAPSecurityRealm.InvalidPortNumber");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.Details.PasswordError}: {@code
     * The confirmed password is not the same as the one entered. Please make
     * sure to type the same password twice.}.
     * 
     * @return
     *     {@code The confirmed password is not the same as the one entered.
     *     Please make sure to type the same password twice.}
     */
    public static String HudsonPrivateSecurityRealm_Details_PasswordError() {
        return holder.format("HudsonPrivateSecurityRealm.Details.PasswordError");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.Details.PasswordError}: {@code
     * The confirmed password is not the same as the one entered. Please make
     * sure to type the same password twice.}.
     * 
     * @return
     *     {@code The confirmed password is not the same as the one entered.
     *     Please make sure to type the same password twice.}
     */
    public static Localizable _HudsonPrivateSecurityRealm_Details_PasswordError() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.Details.PasswordError");
    }

    /**
     * Key {@code PAMSecurityRealm.CurrentUser}: {@code Current User}.
     * 
     * @return
     *     {@code Current User}
     */
    public static String PAMSecurityRealm_CurrentUser() {
        return holder.format("PAMSecurityRealm.CurrentUser");
    }

    /**
     * Key {@code PAMSecurityRealm.CurrentUser}: {@code Current User}.
     * 
     * @return
     *     {@code Current User}
     */
    public static Localizable _PAMSecurityRealm_CurrentUser() {
        return new Localizable(holder, "PAMSecurityRealm.CurrentUser");
    }

    /**
     * Key {@code UserDetailsServiceProxy.UnableToQuery}: {@code Unable to
     * query user information: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unable to query user information: {0}}
     */
    public static String UserDetailsServiceProxy_UnableToQuery(Object arg0) {
        return holder.format("UserDetailsServiceProxy.UnableToQuery", arg0);
    }

    /**
     * Key {@code UserDetailsServiceProxy.UnableToQuery}: {@code Unable to
     * query user information: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unable to query user information: {0}}
     */
    public static Localizable _UserDetailsServiceProxy_UnableToQuery(Object arg0) {
        return new Localizable(holder, "UserDetailsServiceProxy.UnableToQuery", arg0);
    }

    /**
     * Key {@code PAMSecurityRealm.RunAsUserOrBelongToGroupAndChmod}: {@code
     * Either Jenkins needs to run as {0} or {1} needs to belong to group {2}
     * and ‘chmod g+r /etc/shadow’ needs to be done to enable Jenkins to read
     * /etc/shadow}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Either Jenkins needs to run as {0} or {1} needs to belong to
     *     group {2} and ‘chmod g+r /etc/shadow’ needs to be done to enable
     *     Jenkins to read /etc/shadow}
     */
    public static String PAMSecurityRealm_RunAsUserOrBelongToGroupAndChmod(Object arg0, Object arg1, Object arg2) {
        return holder.format("PAMSecurityRealm.RunAsUserOrBelongToGroupAndChmod", arg0, arg1, arg2);
    }

    /**
     * Key {@code PAMSecurityRealm.RunAsUserOrBelongToGroupAndChmod}: {@code
     * Either Jenkins needs to run as {0} or {1} needs to belong to group {2}
     * and ‘chmod g+r /etc/shadow’ needs to be done to enable Jenkins to read
     * /etc/shadow}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Either Jenkins needs to run as {0} or {1} needs to belong to
     *     group {2} and ‘chmod g+r /etc/shadow’ needs to be done to enable
     *     Jenkins to read /etc/shadow}
     */
    public static Localizable _PAMSecurityRealm_RunAsUserOrBelongToGroupAndChmod(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "PAMSecurityRealm.RunAsUserOrBelongToGroupAndChmod", arg0, arg1, arg2);
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.WouldYouLikeToSignUp}: {@code
     * This {0} {1} is new to Jenkins. Would you like to sign up?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code This {0} {1} is new to Jenkins. Would you like to sign up?}
     */
    public static String HudsonPrivateSecurityRealm_WouldYouLikeToSignUp(Object arg0, Object arg1) {
        return holder.format("HudsonPrivateSecurityRealm.WouldYouLikeToSignUp", arg0, arg1);
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.WouldYouLikeToSignUp}: {@code
     * This {0} {1} is new to Jenkins. Would you like to sign up?}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code This {0} {1} is new to Jenkins. Would you like to sign up?}
     */
    public static Localizable _HudsonPrivateSecurityRealm_WouldYouLikeToSignUp(Object arg0, Object arg1) {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.WouldYouLikeToSignUp", arg0, arg1);
    }

    /**
     * Key {@code GlobalSecurityConfiguration.Description}: {@code Secure
     * Jenkins; define who is allowed to access/use the system.}.
     * 
     * @return
     *     {@code Secure Jenkins; define who is allowed to access/use the
     *     system.}
     */
    public static String GlobalSecurityConfiguration_Description() {
        return holder.format("GlobalSecurityConfiguration.Description");
    }

    /**
     * Key {@code GlobalSecurityConfiguration.Description}: {@code Secure
     * Jenkins; define who is allowed to access/use the system.}.
     * 
     * @return
     *     {@code Secure Jenkins; define who is allowed to access/use the
     *     system.}
     */
    public static Localizable _GlobalSecurityConfiguration_Description() {
        return new Localizable(holder, "GlobalSecurityConfiguration.Description");
    }

    /**
     * Key {@code LDAPSecurityRealm.UnknownHost}: {@code Unknown host: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unknown host: {0}}
     */
    public static String LDAPSecurityRealm_UnknownHost(Object arg0) {
        return holder.format("LDAPSecurityRealm.UnknownHost", arg0);
    }

    /**
     * Key {@code LDAPSecurityRealm.UnknownHost}: {@code Unknown host: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Unknown host: {0}}
     */
    public static Localizable _LDAPSecurityRealm_UnknownHost(Object arg0) {
        return new Localizable(holder, "LDAPSecurityRealm.UnknownHost", arg0);
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.CreateAccount.PasswordNotMatch}:
     * {@code Password didn't match}.
     * 
     * @return
     *     {@code Password didn't match}
     */
    public static String HudsonPrivateSecurityRealm_CreateAccount_PasswordNotMatch() {
        return holder.format("HudsonPrivateSecurityRealm.CreateAccount.PasswordNotMatch");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.CreateAccount.PasswordNotMatch}:
     * {@code Password didn't match}.
     * 
     * @return
     *     {@code Password didn't match}
     */
    public static Localizable _HudsonPrivateSecurityRealm_CreateAccount_PasswordNotMatch() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.CreateAccount.PasswordNotMatch");
    }

    /**
     * Key {@code AuthorizationStrategy.DisplayName}: {@code Anyone can do
     * anything}.
     * 
     * @return
     *     {@code Anyone can do anything}
     */
    public static String AuthorizationStrategy_DisplayName() {
        return holder.format("AuthorizationStrategy.DisplayName");
    }

    /**
     * Key {@code AuthorizationStrategy.DisplayName}: {@code Anyone can do
     * anything}.
     * 
     * @return
     *     {@code Anyone can do anything}
     */
    public static Localizable _AuthorizationStrategy_DisplayName() {
        return new Localizable(holder, "AuthorizationStrategy.DisplayName");
    }

    /**
     * Key {@code LegacySecurityRealm.Displayname}: {@code Delegate to
     * servlet container}.
     * 
     * @return
     *     {@code Delegate to servlet container}
     */
    public static String LegacySecurityRealm_Displayname() {
        return holder.format("LegacySecurityRealm.Displayname");
    }

    /**
     * Key {@code LegacySecurityRealm.Displayname}: {@code Delegate to
     * servlet container}.
     * 
     * @return
     *     {@code Delegate to servlet container}
     */
    public static Localizable _LegacySecurityRealm_Displayname() {
        return new Localizable(holder, "LegacySecurityRealm.Displayname");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.CreateAccount.UserNameRequired}:
     * {@code User name is required}.
     * 
     * @return
     *     {@code User name is required}
     */
    public static String HudsonPrivateSecurityRealm_CreateAccount_UserNameRequired() {
        return holder.format("HudsonPrivateSecurityRealm.CreateAccount.UserNameRequired");
    }

    /**
     * Key {@code HudsonPrivateSecurityRealm.CreateAccount.UserNameRequired}:
     * {@code User name is required}.
     * 
     * @return
     *     {@code User name is required}
     */
    public static Localizable _HudsonPrivateSecurityRealm_CreateAccount_UserNameRequired() {
        return new Localizable(holder, "HudsonPrivateSecurityRealm.CreateAccount.UserNameRequired");
    }

    /**
     * Key {@code PAMSecurityRealm.User}: {@code User ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code User ‘{0}’}
     */
    public static String PAMSecurityRealm_User(Object arg0) {
        return holder.format("PAMSecurityRealm.User", arg0);
    }

    /**
     * Key {@code PAMSecurityRealm.User}: {@code User ‘{0}’}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code User ‘{0}’}
     */
    public static Localizable _PAMSecurityRealm_User(Object arg0) {
        return new Localizable(holder, "PAMSecurityRealm.User", arg0);
    }

    /**
     * Key {@code LegacyAuthorizationStrategy.DisplayName}: {@code Legacy
     * mode}.
     * 
     * @return
     *     {@code Legacy mode}
     */
    public static String LegacyAuthorizationStrategy_DisplayName() {
        return holder.format("LegacyAuthorizationStrategy.DisplayName");
    }

    /**
     * Key {@code LegacyAuthorizationStrategy.DisplayName}: {@code Legacy
     * mode}.
     * 
     * @return
     *     {@code Legacy mode}
     */
    public static Localizable _LegacyAuthorizationStrategy_DisplayName() {
        return new Localizable(holder, "LegacyAuthorizationStrategy.DisplayName");
    }

}
