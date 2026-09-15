package main.service;

import main.domain.Permissions;
import main.domain.Ship;

public class PermissionService {
    public boolean canCarryHazardous(Ship ship) {return hasPermission(ship,Permissions.CARRY_HAZARDOUS);}

    public boolean cannotCrossRestrictedSector(Ship ship) {
        return hasPermission(ship,Permissions.CROSS_RESTRICTED_SECTOR);
    }

    public void grantHazardousPermission(Ship ship) {
        ship.setPermissions(ship.getPermissions() | Permissions.CARRY_HAZARDOUS);
    }

    public void removeEditPermission(Ship ship) {
        ship.setPermissions(ship.getPermissions() & ~Permissions.EDIT_MANIFEST);
    }
    private boolean hasPermission(Ship ship, int permission){return (ship.getPermissions() & permission) !=0;}
}
