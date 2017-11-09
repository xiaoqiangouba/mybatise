package com.ls.pojo;

import java.util.Date;

public class Vodie {
    private Integer vid;

    private String name;

    private String author;

    private String introduce;

    private String img;

    private String video;

    private Date updatetime;

    private Date creattime;

    public Vodie(Integer vid, String name, String author, String introduce, String img, String video, Date updatetime, Date creattime) {
        this.vid = vid;
        this.name = name;
        this.author = author;
        this.introduce = introduce;
        this.img = img;
        this.video = video;
        this.updatetime = updatetime;
        this.creattime = creattime;
    }

    public Vodie() {
        super();
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }
}