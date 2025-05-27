const eventsContainer = document.getElementById("eventsContainer");
const spinner = document.getElementById("spinner");
const fetchThenBtn = document.getElementById("fetchThen");
const fetchAsyncBtn = document.getElementById("fetchAsync");

// Mock API URL (using jsonplaceholder's posts as dummy events)
const API_URL = "https://jsonplaceholder.typicode.com/posts?_limit=5";

// Clear container helper
function clearEvents() {
  eventsContainer.innerHTML = "";
}

// Render events on page
function renderEvents(events) {
  clearEvents();
  events.forEach(event => {
    const div = document.createElement("div");
    div.className = "event-item";
    div.textContent = `Event: ${event.title}`;
    eventsContainer.appendChild(div);
  });
}

// Fetch events using .then() and .catch()
function fetchEventsThen() {
  spinner.style.display = "block";
  clearEvents();

  fetch(API_URL)
    .then(response => {
      if (!response.ok) throw new Error("Network response not ok");
      return response.json();
    })
    .then(data => {
      spinner.style.display = "none";
      renderEvents(data);
    })
    .catch(error => {
      spinner.style.display = "none";
      eventsContainer.textContent = "Error fetching events: " + error.message;
    });
}

// Fetch events using async/await
async function fetchEventsAsync() {
  spinner.style.display = "block";
  clearEvents();

  try {
    const response = await fetch(API_URL);
    if (!response.ok) throw new Error("Network response not ok");
    const data = await response.json();
    spinner.style.display = "none";
    renderEvents(data);
  } catch (error) {
    spinner.style.display = "none";
    eventsContainer.textContent = "Error fetching events: " + error.message;
  }
}

// Attach button handlers
fetchThenBtn.onclick = fetchEventsThen;
fetchAsyncBtn.onclick = fetchEventsAsync;
