package com.gongxiao.zichan.model;

public class Assets {
    private Integer id;

    private String name;

    private String address;

    private String area;

    private String assettype;

    private Integer assetlevel;

    private String comment;

    private String coordinate;

    private String tipname;

    private Long price;

    private Long proportion;

    private String assetstatus;

    private Integer parentid;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype == null ? null : assettype.trim();
    }

    public Integer getAssetlevel() {
        return assetlevel;
    }

    public void setAssetlevel(Integer assetlevel) {
        this.assetlevel = assetlevel;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    public String getTipname() {
        return tipname;
    }

    public void setTipname(String tipname) {
        this.tipname = tipname == null ? null : tipname.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getProportion() {
        return proportion;
    }

    public void setProportion(Long proportion) {
        this.proportion = proportion;
    }

    public String getAssetstatus() {
        return assetstatus;
    }

    public void setAssetstatus(String assetstatus) {
        this.assetstatus = assetstatus == null ? null : assetstatus.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}