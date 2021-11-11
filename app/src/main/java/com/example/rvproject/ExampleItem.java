package com.example.rvproject;

public class ExampleItem {
    private int mImageResouce;
    private String mText1;
    private String mText2;
    public ExampleItem(int imageResource, String text1, String text2){
        mImageResouce = imageResource;
        mText1 = text1;
        mText2 = text2;

    }
    public int getImageResouce(){
        return mImageResouce;
    }

    public String getText1() {
        return mText1;
    }

    public String getText2() {
        return mText2;
    }
}
