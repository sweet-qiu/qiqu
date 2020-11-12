package com.qiqu.realm;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyUserRealm extends AuthorizingRealm {

    //注入service

//    private RegistUserService registUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

//        String zhanghao = (String) authenticationToken.getPrincipal();
//        String password = new String((char[])authenticationToken.getCredentials());
//        //跟数据库比较
//        RegistUser registUser = registUserService.login(zhanghao);
//        if(registUser==null){
//            throw  new UnknownAccountException("用户名错误");
//        }
//        if(!registUser.getPassword().equals(password)){
//            throw new IncorrectCredentialsException("密码错误");
//        }
//        if(registUser.getRenzheng()!=0){
//            throw new LockedAccountException("账号锁定，请联系管理员哦~~~~~");
//        }
      SimpleAuthenticationInfo info = new SimpleAuthenticationInfo("registUser","password",this.getName());
        return info;

    }
}