package com.example.demoapp.config;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Hidden
@RestController
class HiddenController {

    @GetMapping("favicon.ico")
    void returnNoFavicon() {
        /* default icon was removed https://github.com/spring-projects/spring-boot/issues/17925
        return no favicon instead of 404
         */
    }

    @GetMapping( "/")
    public void redirectRootToSwaggerDocs(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }
}