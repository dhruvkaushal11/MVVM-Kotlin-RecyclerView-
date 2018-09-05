
package com.retrofit1.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WidgetDetail {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type_label")
    @Expose
    private String typeLabel;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("extended_url")
    @Expose
    private String extendedUrl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(String typeLabel) {
        this.typeLabel = typeLabel;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getExtendedUrl() {
        return extendedUrl;
    }

    public void setExtendedUrl(String extendedUrl) {
        this.extendedUrl = extendedUrl;
    }

}
