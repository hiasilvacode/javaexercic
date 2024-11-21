package telefone;

public class telefone {

    private String tipo;
    private String marca;
    private String cor;

    public telefone(String tipo, String marca, String cor) {

        public String gettipo(){
            return tipo;
        }

        public void settipo (Stringtipo){
        this.tipo = tipo
        }
    }

        public  String getmarca(){
            return marca;
    }

    public void setmarca(String marca){
        this.marca = marca;
    }

    public String getcor(){
            return cor;

    }

    public void setcor (stringcor){
        this.cor = cor
        }

    public static void main(String[] args) {
        telefone tel = new telefone();
        tel.setmarca("m");
        tel.settipo("t");
        tel.setcor("C");

    public void exibirInfo() {
        System.out.println("marca: " + cor);

    }
