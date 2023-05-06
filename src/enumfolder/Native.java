package enumfolder;

import practiceAll.Time;

public class Native {
    private Day dateOfBirth;
    private Time timeOfArrival;
    private final Region quest;
    public Native(Region quest) {
        this.quest = quest;
    }

    public Time getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(Time timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public Region getQuest() {
        return quest;
    }

    public void setDateOfBirth(Day dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
