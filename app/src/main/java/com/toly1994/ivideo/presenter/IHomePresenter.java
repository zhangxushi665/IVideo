package com.toly1994.ivideo.presenter;

import android.content.Context;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2019/4/1/001:20:49<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public interface IHomePresenter extends IPresenter {
    void delete(Context context, int videoId);
}