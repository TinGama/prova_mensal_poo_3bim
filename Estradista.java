class Estradista extends Pessoa implements Ciclista {
    
    public String nome;
   public Estradista(String name) {
        this.name = name;
    }

    public Estradista() {
        this("Manoela Assis");
    }

    @Override
    void bike() {
        System.out.println("Manoela is Cicling  .");
    }
}