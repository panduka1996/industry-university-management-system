package modal;

import java.io.Serializable;

public class CalendarDTO implements Serializable {

    private int id;
    private String title;
    private String start;
    private String end;
    private String Campus;
      

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    
    public String getCampus() {
        return Campus;
    }

   
    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

}
