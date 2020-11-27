package com.example.xmfy.yzubookshop.utils;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * Created by xmfy on 2018/1/28.
 */
public class ScreenUtils {
    private static int screenW;
    private static int screenH;

    public static int getScreenW(Activity mActivity){
        if (screenW == 0){
            initScreen(mActivity);
        }
        return screenW;
    }

    public static int getScreenH(Activity mActivity){
        if (screenH == 0){
            initScreen(mActivity);
        }
        return screenH;
    }

    public static void initScreen(Activity mActivity){
        DisplayMetrics metric = new DisplayMetrics();
        mActivity.getWindowManager().getDefaultDisplay().getMetrics(metric);
        screenW = metric.widthPixels;
        screenH = metric.heightPixels;
    }
}
