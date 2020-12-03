package com.gongxiao.zichan.model;

public class Pics {
    private Integer id;

    private String name;

    private String belongtotable;

    private String belongtoid;

    private String imgurl;

    private byte[] pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBelongtotable() {
        return belongtotable;
    }

    public void setBelongtotable(String belongtotable) {
        this.belongtotable = belongtotable == null ? null : belongtotable.trim();
    }

    public String getBelongtoid() {
        return belongtoid;
    }

    public void setBelongtoid(String belongtoid) {
        this.belongtoid = belongtoid == null ? null : belongtoid.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}