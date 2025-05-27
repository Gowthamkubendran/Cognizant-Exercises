const events = [
  { name: "Jazz Night", category: "Music", date: "2025-07-20" },
  { name: "Art Exhibition", category: "Art", date: "2025-06-15" },
  { name: "Rock Concert", category: "Music", date: "2025-08-10" },
];

const output = document.getElementById("output");

function renderEvents(list) {
  if (list.length === 0) {
    output.textContent = "No events to show.";
    return;
  }
  output.textContent = "";
  list.forEach(event => {
    output.textContent += `Event: ${event.name} | Category: ${event.category} | Date: ${event.date}\n`;
  });
}

function handleAddEvent() {
  const name = document.getElementById("name").value.trim();
  const category = document.getElementById("category").value.trim();
  const date = document.getElementById("date").value;

  if (!name || !category || !date) {
    alert("Please fill all fields");
    return;
  }

  // Add new event using push()
  events.push({ name, category, date });

  // Clear inputs
  document.getElementById("name").value = "";
  document.getElementById("category").value = "";
  document.getElementById("date").value = "";

  renderEvents(events);
}

function showMusicEvents() {
  // Filter music events
  const musicEvents = events.filter(event => event.category.toLowerCase() === "music");

  // Map to formatted strings
  const formatted = musicEvents.map(event => `Workshop on ${event.name} scheduled for ${event.date}`);

  if (formatted.length === 0) {
    output.textContent = "No music events found.";
    return;
  }

  output.textContent = formatted.join("\n");
}

// Initial render of all events
renderEvents(events);
