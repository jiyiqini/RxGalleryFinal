package cn.finalteam.rxgalleryfinal.presenter;

import cn.finalteam.rxgalleryfinal.view.MediaGridView;

/**
 * Desction:
 * Author:pengjianbo
 * Date:16/5/14 上午10:53
 */
public interface MediaGridPresenter {

    void setMediaGridView(MediaGridView mediaGridView);
    void getMediaList(int pageSize, int currentOffset);
}
