package TheCollectionsFrameworks.List;

/*Program-02
===========
Travel Itinerary Planner:
Build a travel itinerary planner that organizes destinations, activities, and schedules for travelers using collections.

Activity:
Represents an activity with a name and schedule.
Contains a constructor to initialize the activity's details and getters to access these details.
Overrides the toString() method to provide a string representation of an activity.

Destination:
Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.

ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.

TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities.


Output:-
Destination: Paris
- Visit Eiffel Tower (Morning)
- Louvre Museum (Afternoon)

Destination: London
- British Museum (Morning)
- London Eye (Afternoon)

*/

import java.util.ArrayList;
import java.util.List;

class Activity {
    private String name;
    private String schedule;

    public Activity(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "- " + name + " (" + schedule + ")";
    }
}

class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public String getName() {
        return name;
    }
}

class ItineraryPlanner {
    private List<Destination> destinations = new ArrayList<>();

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return destinations;
    }
}

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        ItineraryPlanner planner = new ItineraryPlanner();

        // Setup Paris
        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
        paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

        // Setup London
        Destination london = new Destination("London");
        london.addActivity(new Activity("British Museum", "Morning"));
        london.addActivity(new Activity("London Eye", "Afternoon"));

        // Add to Planner
        planner.addDestination(paris);
        planner.addDestination(london);

        // Display Logic
        for (Destination dest : planner.getDestinations()) {
            IO.println("Destination: " + dest.getName());
            for (Activity act : dest.getActivities()) {
                IO.println(act);
            }
            IO.println(); // For spacing
        }
    }
}