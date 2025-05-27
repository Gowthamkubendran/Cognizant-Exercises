const events = [
  { id: 1, name: "Community Clean-Up", category: "Environment", date: "2025-07-01", seats: 5 },
  { id: 2, name: "Yoga Workshop", category: "Health", date: "2025-06-20", seats: 0 },
  { id: 3, name: "Rock Concert", category: "Music", date: "2025-08-10", seats: 10 },
  { id: 4, name: "Jazz Night", category: "Music", date: "2025-09-15", seats: 7 },
];

const eventsContainer = document.getElementById("eventsContainer");

function filterEventsByCategory(eventList = [], category = "All") {
  const clonedEvents = [...eventList];
  if (category === "All") return clonedEvents;
  return clonedEvents.filter(({ category: eventCategory }) => eventCategory === category);
}

function renderEvents(eventList = []) {
  eventsContainer.innerHTML = "";
  if (eventList.length === 0) {
    eventsContainer.textContent = "No events found.";
    return;
  }
  for (const { name, date, seats } of eventList) {
    const div = document.createElement("div");
    div.className = "event-item";
    div.textContent = `${name} — ${date} | Seats available: ${seats}`;
    eventsContainer.appendChild(div);
  }
}

function filterAndRender(category = "All") {
  const filtered = filterEventsByCategory(events, category);
  renderEvents(filtered);
}

// Initial render all events
filterAndRender();
