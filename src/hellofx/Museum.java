package hellofx;

public class Museum {
    String name;
    String abstrc;
    int year;

   

    public Museum(String name, String abstrc, int year){
        this.setName(name);
        this.setAbstrc(abstrc);
        this.setYear(year);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbstrc() {
        return abstrc;
    }

    public void setAbstrc(String abstrc) {
        this.abstrc = abstrc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
