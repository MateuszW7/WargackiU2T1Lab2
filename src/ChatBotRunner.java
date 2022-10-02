public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("Debbie",10);
        debbie.greeting("Mat");
        debbie.weather();
        debbie.pets("Duck");
        debbie.favoriteNumber(debbie.addNumbers((int)debbie.convertFeetToMeters(13),debbie.averageNumbers(10,7,9),10));
        debbie.goodbye();
    }
}
