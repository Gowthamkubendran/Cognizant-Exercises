// Define the Event class
class Event {
  constructor(name, date, seats, category) {
    this.name = name;
    this.date = date;
    this.seats = seats;
    this.category = category;
  }

  // Add checkAvailability method to the prototype
  checkAvailability() {
    return this.seats > 0;
  }
}

// Create sample events
const event1 = new Event("Community Clean-Up", "2025-07-01", 10, "Environment");
const event2 = new Event("Yoga Workshop", "2025-06-20", 0, "Health");

// Get output element
const output = document.getElementById("output");

// Output helper
function log(message) {
  output.textContent += message + "\n";
}

// Check availability
log(`${event1.name} available? ${event1.checkAvailability()}`); // true
log(`${event2.name} available? ${event2.checkAvailability()}`); // false

// Show details using Object.entries
log("\nEvent 1 Details:");
Object.entries(event1).forEach(([key, value]) => {
  log(`${key}: ${value}`);
});

log("\nEvent 2 Details:");
Object.entries(event2).forEach(([key, value]) => {
  log(`${key}: ${value}`);
});
