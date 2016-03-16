package com.netease.qa.emmagee.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.netease.qa.emmagee.utils.MemoryInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hujiachun on 16/2/25.
 */
public class TestService extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        int mem = MemoryInfo.getPidMemorySize(23655, getApplicationContext());
//        Log.e("TestService", mem + " ");
        Runtime runtime = Runtime.getRuntime();
        try {
            Process p = runtime.exec("dumpsys meminfo 12936 ");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = buffer.readLine()) != null) {
                Log.e("TestService", line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return super.onStartCommand(intent, flags, startId);
    }
}
