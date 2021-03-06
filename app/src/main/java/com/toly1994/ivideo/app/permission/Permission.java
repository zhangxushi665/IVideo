package com.toly1994.ivideo.app.permission;

import android.Manifest;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/10/31 0031:20:36<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public class Permission {
    /**
     * 请求的权限
     */
    public String permission;
    /**
     * 解析为什么请求这个权限
     */
    public String explain;
    /**
     * 请求码
     */
    public int requestCode;

    /**
     * @param permission  权限
     * @param explain     解析
     * @param requestCode 请求码
     */
    public Permission(String permission, String explain, int requestCode) {
        this.permission = permission;
        this.explain = explain;
        this.requestCode = requestCode;
    }

    /**
     * 申请SD卡读写权限
     */
    public static Permission WRITE_EXTERNAL_STORAGE =
            new Permission(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    "我们需要您允许我们读写你的存储卡，以方便使用该功能!", PermissionActivity.WRITE_EXTERNAL_STORAGE);
    /**
     * 申请读取通讯录权限
     */
    public static Permission READ_CONTACTS =
            new Permission(Manifest.permission.READ_CONTACTS,
                    "我们需要您允许我们读取通讯录，以方便功能使用!", PermissionActivity.READ_CONTACTS);
    /**
     * 申请读取通讯录权限
     */
    public static Permission READ_SMS =
            new Permission(Manifest.permission.READ_SMS,
                    "我们需要您允许我们读取短信，以方便功能使用!", PermissionActivity.READ_SMS);
    /**
     * 申请录音权限
     */
    public static Permission RECORD_AUDIO =
            new Permission(Manifest.permission.RECORD_AUDIO,
                    "我们需要您允许我们访问录音设备，以方便录音功能使用!", PermissionActivity.RECORD_AUDIO);
    /**
     * 申请拍照权限
     */
    public static Permission CAMERA =
            new Permission(Manifest.permission.CAMERA,
                    "我们需要您允许我们访问相机，以方便拍照功能使用!", PermissionActivity.CAMERA);
    /**
     * 申请电话权限
     */
    public static Permission CALL_PHONE =
            new Permission(Manifest.permission.CALL_PHONE,
                    "我们需要您允许我们访问电话设备，以方便功能使用!", PermissionActivity.CALL_PHONE);

    /**
     * 申请地理位置权限
     */
    public static Permission ACCESS_COARSE_LOCATION =
            new Permission(Manifest.permission.ACCESS_COARSE_LOCATION,
                    "我们需要您允许我们访问位置，以方便功能使用!", PermissionActivity.LOCATION);


}


