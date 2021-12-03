package com.mxchen.shangyitong.swagger;

import lombok.Data;
import springfox.documentation.swagger.web.SwaggerResource;

/**
 * 构建 {@link SwaggerResource} 基础对象
 * @since 1.0.0
 */
@Data
public class SwaggerRoute {

    /**
     * 如: giant-demo
     */
    private String id;

    /**
     * 如: /giant-demo/**
     */
    private String fullPath;

    /**
     * 如: /**
     */
    private String path;

    /**
     * 如: giant-demo-service
     */
    private String location;

    /**
     * 如: /giant-demo
     */
    private String prefix;



    public SwaggerRoute(String id, String location, String fullPath) {
        this.id = id;
        this.location = location;
        this.fullPath = fullPath;
    }

    @Override
    public boolean equals(Object obj) {
        SwaggerRoute swaggerRoute = (SwaggerRoute) obj;
        return this.getLocation().equals(swaggerRoute.getLocation());
    }

    @Override
    public int hashCode() {
        String in = this.getLocation();
        return in.hashCode();
    }
}
