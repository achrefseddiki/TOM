package com.example.TOM.Security.Auth;


import com.google.common.collect.Sets;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;



import java.util.Set;
import java.util.stream.Collectors;

import static com.example.TOM.Security.Auth.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    ROOT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(MACHINE_READ,MACHINE_WRITE,PRODUCT_READ,PRODUCT_WRITE,PRODUCTFAMILY_READ,PRODUCTFAMILY_WRITE)),
    USER(Sets.newHashSet(MACHINE_READ,PRODUCT_READ,PRODUCTFAMILY_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
