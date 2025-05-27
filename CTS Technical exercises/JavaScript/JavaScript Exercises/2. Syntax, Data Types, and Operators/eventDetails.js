// Use const for event name and date
const eventName = "Community Clean-Up Drive";
const eventDate = "2025-06-15";

// Use let for available seats (since it changes)
var availableSeats = 30; // use var to make it globally accessible across both files

// Use template literals to display event info
const eventInfo = `Event: ${eventName}
Date: ${eventDate}
Available Seats: ${availableSeats}`;

console.log(eventInfo);
