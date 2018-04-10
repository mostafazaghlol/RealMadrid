package com.example.android.realmadrid;

/**
 * Created by mostafa on 3/22/18.
 */
public class news{
    private String author,title,description,url,urlToImage,publishedAt;

    public news(String mauthor,String mtitle,String mdescription,String murl,String murlToImage,String mpublishedAt){
        this.author=mauthor;
        this.title=mtitle;
        this.description=mdescription;
        this.url=murl;
        this.urlToImage=murlToImage;
        this.publishedAt=mpublishedAt;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }
}