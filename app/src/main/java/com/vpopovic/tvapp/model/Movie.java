package com.vpopovic.tvapp.model;

import java.io.Serializable;

/**
 * Created by Alen on 29-Jun-17.
 */

public class Movie implements Serializable {

    private String movie;
    private String image;
    private String bgImage;
    private String videoUrl;
    private String description;
    private String actors;
    private String url;

    public Movie() {}

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBgImage() {
        return bgImage;
    }

    public void setBgImage(String bgImage) {
        this.bgImage = bgImage;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie='" + movie + '\'' +
                ", image='" + image + '\'' +
                ", bgImage='" + bgImage + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", description='" + description + '\'' +
                ", actors='" + actors + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
