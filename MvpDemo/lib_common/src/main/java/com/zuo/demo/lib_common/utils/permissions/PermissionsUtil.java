package com.zuo.demo.lib_common.utils.permissions;

import android.content.Context;

import pub.devrel.easypermissions.EasyPermissions;

public class PermissionsUtil {
    private static PermissionsUtil instance;

    public static PermissionsUtil getInstance(){
        if(instance == null){
            synchronized (PermissionsUtil.class){
                if (instance == null){
                    instance = new PermissionsUtil();
                }
            }
        }
        return instance;
    }

    public void getPermission(final Context context,final String[] perms,final OnPerMissionResult onPerMissionResult) {
        if (EasyPermissions.hasPermissions(context, perms)) {
            onPerMissionResult.onPermissionGranted();
        } else {
            onPerMissionResult.onNoPermission();
        }
    }
}

