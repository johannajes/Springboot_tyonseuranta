import React from 'react';

function EventList({ events, onEdit, onDelete }) {
  return (
    <div>
      {events.map((event) => (
        <div key={event.id}>
          <div>{event.description} - {event.date}</div>
          <button onClick={() => onEdit(event)}>Muokkaa</button>
          <button onClick={() => onDelete(event.id)}>Poista</button>
        </div>
      ))}
    </div>
  );
}

export default EventList;
