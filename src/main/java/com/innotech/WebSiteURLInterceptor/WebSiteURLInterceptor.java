package com.innotech.WebSiteURLInterceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@Component
public class WebSiteURLInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            // Your logic to inspect and modify webSiteURL field
            String webSiteURL = request.getParameter("webSiteURL");
            if (webSiteURL != null && !isValidURL(webSiteURL)) {
                // Set webSiteURL to null or handle accordingly
                request.setAttribute("webSiteURL", null);
            }
        }
        return true;
    }

    private boolean isValidURL(String url) {
        // Your logic to check if the URL is valid
        // Example regex pattern for a valid URL
        String urlRegex = "^(http|https)://([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        return url.matches(urlRegex);
    }
}
