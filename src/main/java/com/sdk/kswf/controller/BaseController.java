package com.sdk.kswf.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * base controller for providing common function
 * @author Kevin
 *
 */
public abstract class BaseController {

    /**
     * Gets an integer parameter from the request
     * 
     * @param request request
     * @param name parameter name
     * @return the integer parameter
     */
    protected Integer getIntParam(HttpServletRequest request, String name) {
        String[] p = request.getParameterValues(name);
        
        Integer result = null;
        
        try{
            if (p != null) {
            	//TODO:  add the apache common package for pom.xml
//                result = NumberUtils.createInteger(p[0]);
            }
        }catch(NumberFormatException ex){
            
        }
        return result;
    }
    
    /**
     * Gets a String parameter from the request
     * 
     * @param request request
     * @param name parameter name
     * @return the String parameter
     */
    protected String getStringParam(HttpServletRequest request, String name) {
        String[] p = request.getParameterValues(name);
        
        if (p == null) {
            return null;
        } else {
            return p[0];
        }
    }
    
    protected String getCookie(HttpServletRequest request, String cookieName, String defaultValue) {
        Cookie[] cookies = request.getCookies();
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookieName.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        
        return defaultValue;
    }
}
