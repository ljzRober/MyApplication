package com.example.firstline_test1;

public class News {
    private String title;
    private int imgid;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String title, int imgid, String content) {
        this.title = title;
        this.imgid = imgid;
        this.content = content;
    }

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
