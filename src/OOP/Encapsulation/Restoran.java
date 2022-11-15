package OOP.Encapsulation;

public class Restoran {
    //Variable (Private)
    private String menu;
    private float harga;

    //Method Setter (Public) dengan Parameter
    public void setMenu(String menu){
        this.menu = menu;
    }
    public void setharga(float harga){
        this.harga = harga;
    }

    //Method Getter (Public) dengan Parameter
    public String getMenu(){
        return menu;
    }
    public double getHarga(){
        return harga;
    }
}
