const form = document.getElementById("registrationForm");
const messageDiv = document.getElementById("message");

form.addEventListener("submit", function(event) {
  event.preventDefault();

  // Clear previous message
  messageDiv.textContent = "";
  messageDiv.className = "message";

  const { name, email, event: selectedEvent } = form.elements;

  // Simple validation (you can expand this)
  if (!name.value.trim() || !email.value.trim() || !selectedEvent.value) {
    messageDiv.textContent = "Please fill in all fields.";
    messageDiv.classList.add("error");
    return;
  }

  const userData = {
    name: name.value.trim(),
    email: email.value.trim(),
    event: selectedEvent.value,
  };

  messageDiv.textContent = "Submitting...";
  
  // Simulate delayed server response with setTimeout inside fetch mock
  new Promise((resolve, reject) => {
    setTimeout(() => {
      // Simulate 90% success rate
      Math.random() < 0.9 ? resolve({ status: 201 }) : reject(new Error("Server error"));
    }, 1500);
  })
  .then(response => {
    if (response.status === 201) {
      messageDiv.textContent = "Registration successful! Thank you.";
      messageDiv.classList.add("success");
      form.reset();
    } else {
      throw new Error("Unexpected response");
    }
  })
  .catch(error => {
    messageDiv.textContent = `Registration failed: ${error.message}`;
    messageDiv.classList.add("error");
  });
});
