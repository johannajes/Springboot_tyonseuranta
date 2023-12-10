import React, { useState } from 'react';

function EventForm({ onSubmit, initialEvent = {} }) {
  const [event, setEvent] = useState(initialEvent);

  const handleChange = (e) => {
    setEvent({ ...event, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    onSubmit(event);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Kuvaus:
        <input
          type="text"
          name="description"
          value={event.description || ''}
          onChange={handleChange}
        />
      </label>
      <label>
        Päivämäärä:
        <input
          type="date"
          name="date"
          value={event.date || ''}
          onChange={handleChange}
        />
      </label>
      <button type="submit">Tallenna</button>
    </form>
  );
}

export default EventForm;
