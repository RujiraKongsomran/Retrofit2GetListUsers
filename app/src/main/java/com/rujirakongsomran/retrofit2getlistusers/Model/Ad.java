package com.rujirakongsomran.retrofit2getlistusers.Model;

public class Ad {
    private String company;
    private String url;
    private String text;

    public Ad() {
    }

    public Ad(String company, String url, String text) {
        this.company = company;
        this.url = url;
        this.text = text;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
