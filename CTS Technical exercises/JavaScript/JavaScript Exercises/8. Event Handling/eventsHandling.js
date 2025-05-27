const events = [
  { id: 1, name: "Community Clean-Up", date: "2025-07-01", seats: 5, category: "Environment" },
  { id: 2, name: "Yoga Workshop", date: "2025-06-20", seats: 0, category: "Health" },
  { id: 3, name: "Rock Concert", date: "2025-08-10", seats: 10, category: "Music" },
  { id: 4, name: "Jazz Night", date: "2025-09-15", seats: 7, category: "Music" },
];

const eventsContainer = document.querySelector("#eventsContainer");
const categoryFilter = document.querySelector("#categoryFilter");
const searchInput = document.querySelector("#searchInput");

let filteredEvents = [...events];

// Render events to DOM
function renderEvents(list) {
  eventsContainer.innerHTML = "";

  if (list.length === 0) {
    eventsContainer.textContent = "No events found.";
    return;
  }

  list.forEach(event => {
    const card = document.createElement("div");
    card.className = "event-card";

    const info = document.createElement("p");
    info.textContent = `${event.name} — ${event.date} | Seats available: ${event.seats} | Category: ${event.category}`;
    card.appendChild(info);

    const registerBtn = document.createElement("button");
    registerBtn.textContent = "Register";
    registerBtn.disabled = event.seats === 0;
    registerBtn.onclick = () => register(event.id);
    card.appendChild(registerBtn);

    eventsContainer.appendChild(card);
  });
}

// Register for event
function register(eventId) {
  const event = events.find(e => e.id === eventId);
  if (event.seats > 0) {
    event.seats--;
    alert(`Registered for ${event.name}. Seats left: ${event.seats}`);
  } else {
    alert("No seats left.");
  }
  applyFilters();
}

// Apply filters based on category and search text
function applyFilters() {
  const category = categoryFilter.value;
  const searchText = searchInput.value.trim().toLowerCase();

  filteredEvents = events.filter(event => {
    const matchesCategory = category === "All" || event.category === category;
    const matchesSearch = event.name.toLowerCase().includes(searchText);
    return matchesCategory && matchesSearch;
  });

  renderEvents(filteredEvents);
}

// Event listeners
categoryFilter.onchange = applyFilters;
searchInput.onkeydown = applyFilters;

// Initial render
renderEvents(events);
