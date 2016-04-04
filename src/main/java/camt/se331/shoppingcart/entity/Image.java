package camt.se331.shoppingcart.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Family on 29/3/2559.
 */
@Entity
public class Image {
    @Id
    @GeneratedValue
    private Long id;

    String fileName;
    @Lob
    byte[] content;
    String contentType;

    public Image() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIME)
    Date created;
}