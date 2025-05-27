// Sample event data
const events = [
  { name: "Community Clean-Up", date: "2025-07-10", seats: 10 },
  { name: "Book Drive", date: "2024-12-01", seats: 0 }, // past & full
  { name: "Tech Meetup", date: "2025-08-05", seats: 5 },
  { name: "Charity Run", date: "2025-04-20", seats: 15 } // past
];

const today = new Date();
const eventList = document.getElementById("eventList");

// Loop through events and show only valid ones
events.forEach(event => {
  const eventDate = new Date(event.date);

  if (eventDate > today && event.seats > 0) {
    const li = document.createElement("li");
    li.textContent = `${event.name} - ${event.date} (${event.seats} seats left)`;
    eventList.appendChild(li);

    // Simulate a registration attempt
    try {
      registerUser(event);
    } catch (error) {
      console.error(`Error registering for ${event.name}: ${error.message}`);
    }
  } else {
    console.log(`Skipping invalid or full event: ${event.name}`);
  }
});

// Registration function with error handling
function registerUser(event) {
  if (event.seats <= 0) {
    throw new Error("No seats available.");
  }

  // Proceed with registration
  event.seats--;
  console.log(`Registered for ${event.name}. Seats remaining: ${event.seats}`);
}
