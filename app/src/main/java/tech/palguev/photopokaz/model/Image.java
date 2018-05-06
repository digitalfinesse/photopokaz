package tech.palguev.photopokaz.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Image implements Parcelable {
    private String largeImageURL;
    private String webformatHeight;
    private String webformatWidth;
    private String likes;
    private String imageWidth;
    private String id;
    private String user_id;
    private String views;
    private String comments;
    private String pageURL;
    private String imageHeight;
    private String webformatURL;
    private String type;
    private String previewHeight;
    private String tags;
    private String downloads;
    private String user;
    private String favorites;
    private String imageSize;
    private String previewWidth;
    private String userImageURL;
    private String previewURL;

    public Image() { }

    public Image(String largeImageURL, String webformatHeight, String webformatWidth, String likes, String imageWidth, String id, String user_id, String views, String comments, String pageURL, String imageHeight, String webformatURL, String type, String previewHeight, String tags, String downloads, String user, String favorites, String imageSize, String previewWidth, String userImageURL, String previewURL) {
        this.largeImageURL = largeImageURL;
        this.webformatHeight = webformatHeight;
        this.webformatWidth = webformatWidth;
        this.likes = likes;
        this.imageWidth = imageWidth;
        this.id = id;
        this.user_id = user_id;
        this.views = views;
        this.comments = comments;
        this.pageURL = pageURL;
        this.imageHeight = imageHeight;
        this.webformatURL = webformatURL;
        this.type = type;
        this.previewHeight = previewHeight;
        this.tags = tags;
        this.downloads = downloads;
        this.user = user;
        this.favorites = favorites;
        this.imageSize = imageSize;
        this.previewWidth = previewWidth;
        this.userImageURL = userImageURL;
        this.previewURL = previewURL;
    }

    protected Image(Parcel in) {
        largeImageURL = in.readString();
        webformatHeight = in.readString();
        webformatWidth = in.readString();
        likes = in.readString();
        imageWidth = in.readString();
        id = in.readString();
        user_id = in.readString();
        views = in.readString();
        comments = in.readString();
        pageURL = in.readString();
        imageHeight = in.readString();
        webformatURL = in.readString();
        type = in.readString();
        previewHeight = in.readString();
        tags = in.readString();
        downloads = in.readString();
        user = in.readString();
        favorites = in.readString();
        imageSize = in.readString();
        previewWidth = in.readString();
        userImageURL = in.readString();
        previewURL = in.readString();
    }

    public static final Creator<Image> CREATOR = new Creator<Image>() {
        @Override
        public Image createFromParcel(Parcel in) {
            return new Image(in);
        }

        @Override
        public Image[] newArray(int size) {
            return new Image[size];
        }
    };

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public String getWebformatHeight() {
        return webformatHeight;
    }

    public void setWebformatHeight(String webformatHeight) {
        this.webformatHeight = webformatHeight;
    }

    public String getWebformatWidth() {
        return webformatWidth;
    }

    public void setWebformatWidth(String webformatWidth) {
        this.webformatWidth = webformatWidth;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getWebformatURL() {
        return webformatURL;
    }

    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPreviewHeight() {
        return previewHeight;
    }

    public void setPreviewHeight(String previewHeight) {
        this.previewHeight = previewHeight;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public String getPreviewWidth() {
        return previewWidth;
    }

    public void setPreviewWidth(String previewWidth) {
        this.previewWidth = previewWidth;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(largeImageURL);
        dest.writeString(webformatHeight);
        dest.writeString(webformatWidth);
        dest.writeString(likes);
        dest.writeString(imageWidth);
        dest.writeString(id);
        dest.writeString(user_id);
        dest.writeString(views);
        dest.writeString(comments);
        dest.writeString(pageURL);
        dest.writeString(imageHeight);
        dest.writeString(webformatURL);
        dest.writeString(type);
        dest.writeString(previewHeight);
        dest.writeString(tags);
        dest.writeString(downloads);
        dest.writeString(user);
        dest.writeString(favorites);
        dest.writeString(imageSize);
        dest.writeString(previewWidth);
        dest.writeString(userImageURL);
        dest.writeString(previewURL);
    }
}
