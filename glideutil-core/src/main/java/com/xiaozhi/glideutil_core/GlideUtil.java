package com.xiaozhi.glideutil_core;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import java.io.File;

/**
 * Created by liudezhi on 16/8/5.
 */
public class GlideUtil {

    /**
     * 设置前景
     */
    public static <T> void load(Context mContext, T t, ImageView imageView, int errorId) {
        boolean isErrorImage = true;
        if (errorId <= 0) {
            isErrorImage = false;
        }

        RequestManager picasso = Glide.with(mContext);
        DrawableTypeRequest creator = null;
        if (t != null) {
            if (t instanceof Uri) {//图片本地路径
                creator = picasso.load((Uri) t);
            } else if (t instanceof String) {//图片网络路径
                creator = picasso.load((String) t);
            } else if (t instanceof File) {//文件
                creator = picasso.load((File) t);
            } else if (t instanceof Integer) {//资源Id
                creator = picasso.load((Integer) t);
            }
        }

        DrawableRequestBuilder builder = null;
        if (isErrorImage){
            builder = creator.error(errorId);
            builder.into(imageView);
            return;
        }
        creator.into(imageView);
    }

    public static <T> void load(Context mContext, T t, ImageView imageView) {
        load(mContext, t, imageView, 0);
    }

}
