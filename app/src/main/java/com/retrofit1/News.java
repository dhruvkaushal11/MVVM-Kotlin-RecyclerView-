
package com.retrofit1;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("n_id")
    @Expose
    private String nId;
    @SerializedName("n_type")
    @Expose
    private String nType;
    @SerializedName("n_is_sponsored")
    @Expose
    private String nIsSponsored;
    @SerializedName("n_share_link")
    @Expose
    private String nShareLink;
    @SerializedName("n_title")
    @Expose
    private String nTitle;
    @SerializedName("n_short_desc")
    @Expose
    private String nShortDesc;
    @SerializedName("n_pcategory_id")
    @Expose
    private String nPcategoryId;
    @SerializedName("n_pcategory_name")
    @Expose
    private String nPcategoryName;
    @SerializedName("n_rating")
    @Expose
    private List<Object> nRating = null;
    @SerializedName("n_comment_count")
    @Expose
    private String nCommentCount;
    @SerializedName("n_highlight")
    @Expose
    private List<Object> nHighlight = null;
    @SerializedName("n_small_image")
    @Expose
    private String nSmallImage;
    @SerializedName("n_large_image")
    @Expose
    private String nLargeImage;
    @SerializedName("n_extralarge_image")
    @Expose
    private String nExtralargeImage;
    @SerializedName("n_updated_datetime")
    @Expose
    private String nUpdatedDatetime;
    @SerializedName("n_photo")
    @Expose
    private List<Object> nPhoto = null;
    @SerializedName("n_video")
    @Expose
    private List<Object> nVideo = null;

    public String getNId() {
        return nId;
    }

    public void setNId(String nId) {
        this.nId = nId;
    }

    public String getNType() {
        return nType;
    }

    public void setNType(String nType) {
        this.nType = nType;
    }

    public String getNIsSponsored() {
        return nIsSponsored;
    }

    public void setNIsSponsored(String nIsSponsored) {
        this.nIsSponsored = nIsSponsored;
    }

    public String getNShareLink() {
        return nShareLink;
    }

    public void setNShareLink(String nShareLink) {
        this.nShareLink = nShareLink;
    }

    public String getNTitle() {
        return nTitle;
    }

    public void setNTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getNShortDesc() {
        return nShortDesc;
    }

    public void setNShortDesc(String nShortDesc) {
        this.nShortDesc = nShortDesc;
    }

    public String getNPcategoryId() {
        return nPcategoryId;
    }

    public void setNPcategoryId(String nPcategoryId) {
        this.nPcategoryId = nPcategoryId;
    }

    public String getNPcategoryName() {
        return nPcategoryName;
    }

    public void setNPcategoryName(String nPcategoryName) {
        this.nPcategoryName = nPcategoryName;
    }

    public List<Object> getNRating() {
        return nRating;
    }

    public void setNRating(List<Object> nRating) {
        this.nRating = nRating;
    }

    public String getNCommentCount() {
        return nCommentCount;
    }

    public void setNCommentCount(String nCommentCount) {
        this.nCommentCount = nCommentCount;
    }

    public List<Object> getNHighlight() {
        return nHighlight;
    }

    public void setNHighlight(List<Object> nHighlight) {
        this.nHighlight = nHighlight;
    }

    public String getNSmallImage() {
        return nSmallImage;
    }

    public void setNSmallImage(String nSmallImage) {
        this.nSmallImage = nSmallImage;
    }

    public String getNLargeImage() {
        return nLargeImage;
    }

    public void setNLargeImage(String nLargeImage) {
        this.nLargeImage = nLargeImage;
    }

    public String getNExtralargeImage() {
        return nExtralargeImage;
    }

    public void setNExtralargeImage(String nExtralargeImage) {
        this.nExtralargeImage = nExtralargeImage;
    }

    public String getNUpdatedDatetime() {
        return nUpdatedDatetime;
    }

    public void setNUpdatedDatetime(String nUpdatedDatetime) {
        this.nUpdatedDatetime = nUpdatedDatetime;
    }

    public List<Object> getNPhoto() {
        return nPhoto;
    }

    public void setNPhoto(List<Object> nPhoto) {
        this.nPhoto = nPhoto;
    }

    public List<Object> getNVideo() {
        return nVideo;
    }

    public void setNVideo(List<Object> nVideo) {
        this.nVideo = nVideo;
    }

}
