package com.bailiangjin.utilslibrary.utils.image.model;

/**
 * 图片宽高参数
 *
 * @author bailiangjin
 * @date 2018/4/17
 */

public class ImageWidthHeightParam {

    private int width;
    private int height;

    public ImageWidthHeightParam(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
