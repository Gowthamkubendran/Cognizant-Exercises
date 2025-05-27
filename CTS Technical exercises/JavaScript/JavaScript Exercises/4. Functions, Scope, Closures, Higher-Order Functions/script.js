// Global events array
const events = [];

// Add new event
function addEvent(name, date, seats, category) {
  events.push({ name, date, seats: parseInt(seats), category });
  renderEvents(events);
}

// Register user
function registerUser(eventName) {
  const event = events.find(e => e.name === eventName);
  if (!event) {
    alert("Event not found.");
    return;
  }

  if (event.seats > 0) {
    event.seats--;
    alert(`Registered for ${event.name}. Seats left: ${event.seats}`);
  } else {
    alert("No seats left.");
  }

  renderEvents(events);
}

// Filter by category
function filterEventsByCategory(category) {
  return events.filter(event => event.category.toLowerCase() === category.toLowerCase());
}

// Higher-order filter
function filterEvents(callback) {
  return events.filter(callback);
}

// Closure tracker (optional use)
function createCategoryRegistrationTracker(category) {
  let total = 0;

  return function (eventName) {
    const event = events.find(e => e.name === eventName && e.category === category);
    if (event && event.seats > 0) {
      event.seats--;
      total++;
      console.log(`Registered in ${category}. Total: ${total}`);
    } else {
      console.warn("Registration failed.");
    }
    renderEvents(events);
  };
}

// Render events to DOM
function renderEvents(list) {
  const ul = document.getElementById("eventList");
  ul.innerHTML = "";
  list.forEach(event => {
    const li = document.createElement("li");
    li.textContent = `${event.name} | ${event.date} | ${event.category} | Seats: ${event.seats}`;
    ul.appendChild(li);
  });
}

// Handlers for HTML buttons
function handleAddEvent() {
  const name = document.getElementById("name").value;
  const date = document.getElementById("date").value;
  const seats = document.getElementById("seats").value;
  const category = document.getElementById("category").value;

  if (!name || !date || !seats || !category) {
    alert("Please fill all fields.");
    return;
  }

  addEvent(name, date, seats, category);
  document.getElementById("name").value = "";
  document.getElementById("date").value = "";
  document.getElementById("seats").value = "";
  document.getElementById("category").value = "";
}

function handleFilterEvents() {
  const category = document.getElementById("filterCategory").value;
  const filtered = filterEventsByCategory(category);
  renderEvents(filtered);
}

function handleRegister() {
  const name = document.getElementById("registerName").value;
  if (!name) {
    alert("Enter an event name to register.");
    return;
  }

  try {
    registerUser(name);
  } catch (e) {
    alert(`Error: ${e.message}`);
  }

  document.getElementById("registerName").value = "";
}
