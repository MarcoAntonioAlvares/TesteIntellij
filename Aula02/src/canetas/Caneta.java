package canetas;

public class Caneta {

    public String modelo;
    public float ponta;

    public int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga restante: " + this.carga);
    }
}
