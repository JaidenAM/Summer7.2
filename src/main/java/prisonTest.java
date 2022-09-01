public class prisonTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        Prisoner twitch = new Prisoner();

        bubba.name ="Bubba";
        twitch.name = "Twitch";

        System.out.println(twitch == bubba);
    }
}
