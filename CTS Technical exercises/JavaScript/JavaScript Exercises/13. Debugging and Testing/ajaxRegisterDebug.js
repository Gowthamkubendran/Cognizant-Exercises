const form = document.getElementById("registrationForm");
const messageDiv = document.getElementById("message");

form.addEventListener("submit", function(event) {
  event.preventDefault();
  console.clear(); // Clear previous console logs on each submit
  console.log("➡️ Form submission started");

  const { name, email, event: selectedEvent } = form.elements;

  // Log input values
  console.log("Input values:", {
    name: name.value,
    email: email.value,
    event: selectedEvent.value,
  });

  // Simple validation
  if (!name.value.trim() || !email.value.trim() || !selectedEvent.value) {
    console.error("❌ Validation failed: Missing required fields.");
    messageDiv.textContent = "Please fill in all fields.";
    messageDiv.className = "message error";
    return;
  }

  const userData = {
    name: name.value.trim(),
    email: email.value.trim(),
    event: selectedEvent.value,
  };

  console.log("✅ Prepared userData for fetch:", userData);
  messageDiv.textContent = "Submitting...";
  messageDiv.className = "message";

  // Simulate fetch with delayed Promise (replace with actual fetch in production)
  new Promise((resolve, reject) => {
    console.log("⏳ Simulating server response delay...");
    setTimeout(() => {
      // Simulate 90% success rate
      if (Math.random() < 0.9) {
        resolve({ status: 201 });
      } else {
        reject(new Error("Server error simulated"));
      }
    }, 1500);
  })
  .then(response => {
    console.log("✅ Response received:", response);
    if (response.status === 201) {
      messageDiv.textContent = "Registration successful! Thank you.";
      messageDiv.className = "message success";
      form.reset();
      console.log("🎉 Registration completed and form reset.");
    } else {
      throw new Error("Unexpected response status: " + response.status);
    }
  })
  .catch(error => {
    console.error("❌ Registration failed:", error);
    messageDiv.textContent = `Registration failed: ${error.message}`;
    messageDiv.className = "message error";
  });
});
