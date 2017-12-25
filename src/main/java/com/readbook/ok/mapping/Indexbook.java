package com.readbook.ok.mapping;

public class Indexbook {
    private Integer bookId;

    private String urlinput;

    private String inputtime;

    private String tpinput;

    private String ipinput;

    private String getinput;

    private String post;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getUrlinput() {
        return urlinput;
    }

    public void setUrlinput(String urlinput) {
        this.urlinput = urlinput == null ? null : urlinput.trim();
    }

    public String getInputtime() {
        return inputtime;
    }

    public void setInputtime(String inputtime) {
        this.inputtime = inputtime == null ? null : inputtime.trim();
    }

    public String getTpinput() {
        return tpinput;
    }

    public void setTpinput(String tpinput) {
        this.tpinput = tpinput == null ? null : tpinput.trim();
    }

    public String getIpinput() {
        return ipinput;
    }

    public void setIpinput(String ipinput) {
        this.ipinput = ipinput == null ? null : ipinput.trim();
    }

    public String getGetinput() {
        return getinput;
    }

    public void setGetinput(String getinput) {
        this.getinput = getinput == null ? null : getinput.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }
}