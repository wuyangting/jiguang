package com.example.jiguang;

import cn.jpush.android.service.WakedResultReceiver;

public class WakeReceiver extends WakedResultReceiver {
    @Override
    public void onWake(int i) {
        //被其他应用拉起的回调
        super.onWake(i);
    }
}
