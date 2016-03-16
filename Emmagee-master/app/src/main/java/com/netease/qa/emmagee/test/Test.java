package com.netease.qa.emmagee.test;

import android.test.AndroidTestCase;
import android.util.Log;

import com.netease.qa.emmagee.utils.MemoryInfo;

/**
 * Created by hujiachun on 16/2/24.
 */
public class Test extends AndroidTestCase {
    private String TAG = "Test";
    public void test001()  throws Exception{

        String[][] info = MemoryInfo.parseMeminfo(23655);

        Log.e(TAG, info[0][0]);
        Log.e(TAG, info[0][1]);
        Log.e(TAG, info[1][0]);
        Log.e(TAG, info[1][1]);
    }
}
