package model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Set {

    private int setId;
    private String setName;
    private Date releaseDate;
    private String setCode;

    public Set() {}

    public Set(int setId, String setName, Date releaseDate, String setCode) {
        this.setId = setId;
        this.setName = setName;
        this.releaseDate = releaseDate;
        this.setCode = setCode;
    }

    public int getSetId() {
        return setId;
    }

    public void setSetId(int setId) {
        this.setId = setId;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSetCode() {
        return setCode;
    }

    public void setSetCode(String setCode) {
        this.setCode = setCode;
    }
}
