package cn.book.pojo;

public class Book {
    private Integer bid;

    private String bname;

    private Integer cid;

    private String bimg;

    private String writer;

    private String publishing;

    private Integer currentnumber;

    private String description;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBimg() {
        return bimg;
    }

    public void setBimg(String bimg) {
        this.bimg = bimg == null ? null : bimg.trim();
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer == null ? null : writer.trim();
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing == null ? null : publishing.trim();
    }

    public Integer getCurrentnumber() {
        return currentnumber;
    }

    public void setCurrentnumber(Integer currentnumber) {
        this.currentnumber = currentnumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}