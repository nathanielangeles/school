public class NenSimulation {
    // main method that instantiates a NenType and a NenUser, then assigns the type to the user
    public static void main(String[] args) {
        /*
        in main(), create an array of multiple NenUser (Gon, Killua, Kurapika, Leorio, etc.)
        
        run showStats(), waterDivination(), and assignSubTypes() for each user
        
        compare their results.
        */
        NenUser[] users = new NenUser[4];
        users[0] = new NenUser("Gon Freecss");
        users[1] = new NenUser("Killua Zoldyck");
        users[2] = new NenUser("Kurapika");
        users[3] = new NenUser("Leorio Paradinight");

        System.out.println("==== HUNTER STATS ====");
        // process each hunter
        for (NenUser hunter : users) {
            hunter.showStats();
            System.out.println();
        }

        System.out.println("==== WATER DIVINATION TEST ====");
        for (NenUser hunter : users) {
            hunter.waterDivination();
            System.out.println();
        }

        System.out.println("==== SUBTYPE ASSIGNMENT ====");
        for (NenUser hunter : users) {
            hunter.assignSubTypes();
            System.out.println();
        }

        // create a summary of results
        System.out.println("==== SUMMARY OF RESULTS ====");
        for (NenUser hunter : users) {
            hunter.showStats();
            System.out.println();
        }
    }
}
