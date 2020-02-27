public class Messages {
    protected Bien bienconcerne;
    protected String message;

    public Messages(Bien bienconcerne, String message) {
        this.bienconcerne = bienconcerne;
        this.message = message;
    }
    public void afficher(){
        System.out.println(ConsoleColors.GREEN_BOLD);

        System.out.println("************************************************");
        System.out.println(ConsoleColors.WHITE_BOLD);

        System.out.println("Adresse du bien concerné "+bienconcerne.adresse);
        System.out.println("Message : "+message);

        System.out.println(ConsoleColors.RESET );

    }
}