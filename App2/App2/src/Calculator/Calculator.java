package Calculator;

import java.sql.Date;

public class Calculator {
    
    private int id;
    private String data;
    private Date date;

    public Calculator(int id, String data, Date date) {
        this.id = id;
        this.data = data;
        this.date = date;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
