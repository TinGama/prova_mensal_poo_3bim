class Maratonista extends Pessoa implements Corredor{

   public Estradista(String name) {
        super(13); 
        this.name = name;
    }

    public Estradista() {
        this("José dos Santos");
    }

     @Override
    void run() {
        System.out.println("José is Running .");
    }

}