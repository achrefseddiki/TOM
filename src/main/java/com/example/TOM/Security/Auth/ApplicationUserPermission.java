package com.example.TOM.Security.Auth;

public enum ApplicationUserPermission {
    MACHINE_READ("machine:read"),
    MACHINE_WRITE("machine:write"),
    PRODUCT_READ("product:read"),
    PRODUCT_WRITE("product:write"),
    PRODUCTFAMILY_READ("productfamily:read"),
    PRODUCTFAMILY_WRITE("productfamily:write");


    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
