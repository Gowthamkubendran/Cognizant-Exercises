// Sample events array
const events = [
  { id: 1, name: "Community Clean-Up", date: "2025-07-01", seats: 5 },
  { id: 2, name: "Yoga Workshop", date: "2025-06-20", seats: 0 },
  { id: 3, name: "Rock Concert", date: "2025-08-10", seats: 10 },
];

// Grab container element
const eventsContainer = document.querySelector("#eventsContainer");

// Render events dynamically
function renderEvents() {
  // Clear container first
  eventsContainer.innerHTML = "";

  events.forEach(event => {
    // Create card div
    const card = document.createElement("div");
    card.className = "event-card";

    // Event info
    const info = document.createElement("p");
    info.textContent = `${event.name} — ${event.date} | Seats available: ${event.seats}`;
    card.appendChild(info);

    // Register button
    const registerBtn = document.createElement("button");
    registerBtn.textContent = "Register";
    registerBtn.disabled = event.seats === 0;
    registerBtn.onclick = () => register(event.id);
    card.appendChild(registerBtn);

    // Cancel button
    const cancelBtn = document.createElement("button");
    cancelBtn.textContent = "Cancel Registration";
    cancelBtn.disabled = event.seats === 5; // assuming 5 max seats per event
    cancelBtn.onclick = () => cancelRegistration(event.id);
    card.appendChild(cancelBtn);

    eventsContainer.appendChild(card);
  });
}

// Register user for event
function register(eventId) {
  const event = events.find(e => e.id === eventId);
  if (event.seats > 0) {
    event.seats--;
    alert(`Registered for ${event.name}. Seats left: ${event.seats}`);
  } else {
    alert("No seats left.");
  }
  renderEvents();
}

// Cancel registration
function cancelRegistration(eventId) {
  const event = events.find(e => e.id === eventId);
  if (event.seats < 5) { // max capacity assumed 5
    event.seats++;
    alert(`Cancelled registration for ${event.name}. Seats left: ${event.seats}`);
  } else {
    alert("No registrations to cancel.");
  }
  renderEvents();
}

// Initial render
renderEvents();
