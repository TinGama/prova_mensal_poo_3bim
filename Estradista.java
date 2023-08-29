class Estradista extends Pessoa implements Ciclista {

   public Estradista(String name) {
        super(4); 
        this.name = name;
    }

    public Estradista() {
        this("Manoela Assis");
    }
}