package chapter5;
//        (Global Warming Facts Quiz) The controversial issue of global warming has been widely
//        publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
//        and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
//        Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
//        about man-made climate change.” Research both sides of the issue online. Create a five-question
//        multiple-choice quiz on global warming, each question having four possible answers (numbered 1–
//        4). Be objective and try to fairly represent both sides of the issue. Next, write an application that
//        administers the quiz, calculates the number of correct answers (zero through five) and returns a message to the user.
//        If the user correctly answers five questions, print “Excellent”; if four, print “Very
//        good”; if three or fewer, print “Time to brush up on your knowledge of global warming,”
//        and include a list of some websites where you found your facts.

public class GlobalWarmingFacts {
    private String playerName;
    private int score;

    public void setPlayerName(String name){
        this.playerName = playerName;
    }
    public String getPlayerName(){
        return playerName;
    }

    public void increaseScore(){
    score++;
    }

    public String getQuestions(int q) {
        switch (q) {
            case 1:
                return """
                        Which of the following is a greenhouses gas?
                        A.Carbonic acid
                        B. Carbon dioxide
                        C. Carbon monoxide
                        D. Nitrous dioxide
                        """;

            case 2:
                return """
                        Which is the greenhouse gas among the following?
                        A. Nitrogen
                        B. Oxygen
                        C. Carbon monoxide
                        D.  Methane
                        """;

            case 3:
                return """
                        Which country currently emits the most greenhouse gases?
                        A. India
                        B. China
                        C. U.K
                        D. U.S
                        """;

            case 4:
                return """
                        How do scientists collect evidence about climate?
                        A. Using ground-based measurements of surface temperature, carbon dioxide concentration, and sea level
                        B. By using remote sensing from space with satellites
                        C. By collecting "proxy data" from tree rings, ice cores, and historical records
                        D. By using all of these points
                        """;

            case 5:
                return """
                        Which of the following is a greenhouse gas?
                        A. CH4
                        B. Water
                        C. O3
                        D. All of the above
                        """;

            default:
                return null;
        }
    }

    public int getScore(){
            if (score == 5) {
                System.out.println("Excellent!!!");
            }
            if (score == 4) {
                System.out.println("Very Good!! TRY MORE");
            }
            if (score <= 3) {
                System.out.println("""
                        BLOODY WIMP!
                        Time to brush up on your knowledge of global warming.
                        Visit: https://www.proprofs.com/quiz-school/story.php?title=global-warming-quiz
                        to know about the "Global Warming!"
                        """);
            }
        return 0;
    }
}




