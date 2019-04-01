package com.toly1994.ivideo.view;

import com.toly1994.ivideo.model.CtrlPanel;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2019/4/1/001:13:33<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public interface ICtrlView {
    void showPanel();
    void hidePanel();

    void showLoading();
    void hideLoading();

    void render(CtrlPanel ctrlPanel);
}
