public class NameGenerator {
    public NameGenerator() {
        String userName = "";
    }

    public String GetSillyName(String userName) {
        int randIndex = (int)(Math.random() * 19 + 1);
        String[] sillyNames = {
                "Palatine of the Wise", "Defender of Dreams", "Sultan of Green", "Director of Water", "Chairman of Emissaries",
                "Overlord of Farming", "Chief of Bows", "Seer of Freedom", "Elder of Faith", "Exalted of Eternity", "Mother of Green",
                "Headman of the Skies", "Herald of Swords", "Noble of Magic", "Delegate of Virtue",
                "Earl of Bows", "Official of Magic", "Divine of the Gardens", "High Priestess of Healing", "Bishop of Pestinence"
        };
        return "You are now known as " + userName + " the " + sillyNames[randIndex];
    }
}
