public class Map
{
    private Room startRoom;
    private Room outside;
    private Room theater;
    private Room pub;
    private Room lab;
    private Room office;
    private Room basketballCourt;




    public Map()
    {
        createRooms();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {


        // create the rooms

        createOutsideRoom();

        createTheaterRoom();

        createPubRoom();

        createLabRoom();

        createOfficeRoom();

        createBasketballCourt();


        startRoom = outside;  // start game outside
    }

    public void createBasketballCourt()
    {
        basketballCourt = new Room("Concrete Basketball court - Careful don't lose ya ankles! ;)");

        basketballCourt.setExit("South", outside);
    }


    private void createOfficeRoom()
    {
        office = new Room("in the computing admin office");
// initialise room exits
        office.setExit("west", lab);
    }

    private void createLabRoom() {
        lab = new Room("in a computing lab");
// initialise room exits
        lab.setExit("north", outside);
        lab.setExit("east", office);
    }

    private void createPubRoom() {
        pub = new Room("in the campus pub");
// initialise room exits
        pub.setExit("east", outside);
    }

    private void createTheaterRoom() {
        theater = new Room("in a lecture theater");
// initialise room exits
        theater.setExit("west", outside);
    }

    private void createOutsideRoom() {
        outside = new Room("outside the main entrance of the university");
// initialise room exits
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
        outside.setExit("North", basketballCourt);
    }

    public Room getStartRoom()
    {
        return startRoom;
    }
}
