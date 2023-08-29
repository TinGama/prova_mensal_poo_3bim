class Maratonista extends Pessoa implements Corredor{
    public String nome;
   public Maratonista(String name) { 
        this.nome = nome;
    }

    public Maratonista() {
        this("José dos Santos");
    }

     @Override
    void run() {
        System.out.println("José is Running .");
    }

}