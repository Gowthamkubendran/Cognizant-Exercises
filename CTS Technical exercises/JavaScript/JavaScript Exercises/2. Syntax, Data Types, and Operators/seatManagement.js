// Simulate a registration
availableSeats--; // One person registered
console.log(`Seat booked! Seats remaining: ${availableSeats}`);

// Simulate a cancellation
availableSeats++; // One person canceled
console.log(`Seat released! Seats available again: ${availableSeats}`);