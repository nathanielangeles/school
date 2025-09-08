import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// represents a person with nen abilities
public class NenUser {
    private String userName;
    private NenType nenType;

    // add attributes
    private int determination;
    private int creativity;
    private int impulsiveness;

    // this belongs to the class, not the instance
    private static Random random = new Random();

    private List<String> subTypes = new ArrayList<>();

    // constructor - initializes fields
    public NenUser(String userName) {
        this.userName = userName;
        this.determination = random.nextInt(10);
        this.creativity = random.nextInt(10);
        this.impulsiveness = random.nextInt(10);
    }

    // method to display user stats
    public void showStats() {
        System.out.println("User:" + userName);
        System.out.println("Determination: " + determination);
        System.out.println("Creativity: " + creativity);
        System.out.println("Impulsiveness: " + impulsiveness);

        if (nenType != null) {
            System.out.println("Nen Type: " + nenType.getName());
        } else {
            System.out.println("Nen Type: Not determined yet");
        }
    }

    /* write a waterDivination() method.
     assign nen type based on which attribute is strongest:
     high determination -> enhancher
     high impulsiveness -> emitter
     high creativity -> transmuter
     add conjurer, manipulator, specialist
    */
    public void waterDivination() {
        System.out.println(userName + " performs the water divination test...");

        // create nentype objects for each category (conjurer, manipulator, specialist)
        NenType enhancer = new NenType("Enhancer", "The water volume changes");

        NenType emitter = new NenType("Emitter", "The water color changes");

        NenType transmuter = new NenType("Transmuter", "The water taste changes");

        NenType conjurer = new NenType("Conjurer", "Impurities appear in the water");

        NenType manipulator = new NenType("Manipulator", "The leaf moves on the water");

        NenType specialist = new NenType("Specialist", "Different change appears");

        // determine the user's nen type based on highest attribute
        if (determination >= creativity && determination >= impulsiveness) {
            this.nenType = enhancer;
            System.out.println("The water volume changed! " + userName + " is an Enhancer.");
        } else if (impulsiveness >= determination && impulsiveness >= creativity) {
            this.nenType = emitter;
            System.out.println("The water color changed! " + userName + " is an Emitter.");
        } else if (creativity >= determination && creativity >= impulsiveness) {
            this.nenType = transmuter;
            System.out.println("The water taste changed! " + userName + " is a Transmuter.");
        } else if (determination == creativity && determination == impulsiveness) {
            this.nenType = specialist;
            System.out.println("Different change appeared! " + userName + " is a Specialist.");
        } else if (creativity > determination && creativity > impulsiveness) {
            this.nenType = conjurer;
            System.out.println("Impurities appeared in the water! " + userName + " is a Conjurer.");
        } else {
            this.nenType = manipulator;
            System.out.println("The leaf moved on the water! " + userName + " is a Manipulator.");
        }

        System.out.println("Water Effect: " + nenType.getWaterEffect());
    }

    /*
     * add an assignSubTypes() method
     * use a random number (0-100) to decide sub-nen types
     * example: enhancers -> mostly emitters/transmuters, sometimes conjurers/manipulators
     */
    public void assignSubTypes() {
        if (nenType == null) {
            System.out.println("Cannot assign sub-types before determining main Nen type.");
            return;
        }

        subTypes.clear(); // reset previous sub-types

        System.out.println("Determining sub-types for " + userName + "...");
        String mainType = nenType.getName();
        int chance = random.nextInt(100);

        System.out.println(userName + "'s main Nen type is " + mainType + ".");
        System.out.print("Sub-types: ");

        if (mainType.equals("Enhancer")) {
            if (chance < 80) subTypes.add("Transmuter");
            if (chance < 80) subTypes.add("Emitter");
            if (chance < 40) subTypes.add("Conjurer");
            if (chance < 40) subTypes.add("Manipulator");
            if (chance < 10) subTypes.add("Specialist");
        } else if (mainType.equals("Emitter")) {
            if (chance < 80) subTypes.add("Transmuter");
            if (chance < 80) subTypes.add("Manipulator");
            if (chance < 40) subTypes.add("Conjurer");
            if (chance < 40) subTypes.add("Specialist");
        } else if (mainType.equals("Transmuter")) {
            if (chance < 80) subTypes.add("Emitter");
            if (chance < 80) subTypes.add("Manipulator");
            if (chance < 40) subTypes.add("Conjurer");
            if (chance < 40) subTypes.add("Specialist");
        } else if (mainType.equals("Conjurer")) {
            if (chance < 80) subTypes.add("Emitter");
            if (chance < 80) subTypes.add("Transmuter");
            if (chance < 40) subTypes.add("Manipulator");
            if (chance < 40) subTypes.add("Specialist");
        } else if (mainType.equals("Manipulator")) {
            if (chance < 80) subTypes.add("Emitter");
            if (chance < 80) subTypes.add("Transmuter");
            if (chance < 40) subTypes.add("Conjurer");
            if (chance < 40) subTypes.add("Specialist");
        } else if (mainType.equals("Specialist")) {
            if (chance < 80) subTypes.add("Emitter");
            if (chance < 80) subTypes.add("Transmuter");
            if (chance < 40) subTypes.add("Conjurer");
            if (chance < 40) subTypes.add("Manipulator");
        }

        // Print sub-types
        if (subTypes.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(String.join(", ", subTypes));
        }
    }

    // methods to set and get the nentype
    public void setNenType(NenType nenType) {
        this.nenType = nenType;
    }

    public NenType getNenType() {
        return nenType;
    }
}