package hellofx;

public class Lakes {
    String name;
    String abstrc;
    int year;
    
    
    public Lakes(){}
    public Lakes(String name, String abstrc, int year){
        setAbstrc(abstrc);
        setName(name);
        setYear(year);
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
