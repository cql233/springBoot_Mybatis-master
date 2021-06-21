package com.example.util;

public enum Url {
    OnepayUrl_1("dev.onepay.finance/gateway"),
    OnepayUrl_2("18.181.151.237/"),
    PaytreeUrl_1("paytreedev.onepay.work"),
    PaytreeUrl_2("54.64.136.145");
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    Url(String url) {
        this.url = url;
    }
}
