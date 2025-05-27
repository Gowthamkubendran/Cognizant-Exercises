const form = document.getElementById("registrationForm");

const nameError = document.getElementById("nameError");
const emailError = document.getElementById("emailError");
const eventError = document.getElementById("eventError");
const successMsg = document.getElementById("successMsg");

form.addEventListener("submit", function(event) {
  event.preventDefault(); // prevent default form submission

  // Clear previous errors and message
  nameError.textContent = "";
  emailError.textContent = "";
  eventError.textContent = "";
  successMsg.textContent = "";

  const { name, email, event: selectedEvent } = form.elements;
  let isValid = true;

  // Name validation (not empty)
  if (!name.value.trim()) {
    nameError.textContent = "Please enter your name.";
    isValid = false;
  }

  // Email validation (simple regex)
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!email.value.trim()) {
    emailError.textContent = "Please enter your email.";
    isValid = false;
  } else if (!emailPattern.test(email.value)) {
    emailError.textContent = "Please enter a valid email.";
    isValid = false;
  }

  // Event selection validation
  if (!selectedEvent.value) {
    eventError.textContent = "Please select an event.";
    isValid = false;
  }

  if (isValid) {
    successMsg.textContent = `Thank you, ${name.value}! You are registered for "${selectedEvent.value}".`;
    form.reset();
  }
});
