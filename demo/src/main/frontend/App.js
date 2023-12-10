import React, { useState } from 'react';
import EventForm from './EventForm';
import EventList from './EventList';

function App() {
  const [events, setEvents] = useState([]);
  const [editingEvent, setEditingEvent] = useState(null);

  const addEvent = (event) => {
    setEvents([...events, { ...event, id: Date.now() }]);
  };

  const updateEvent = (updatedEvent) => {
    setEvents(events.map(event => event.id === updatedEvent.id ? updatedEvent : event));
    setEditingEvent(null);
  };

  const deleteEvent = (eventId) => {
    setEvents(events.filter(event => event.id !== eventId));
  };

  return (
    <div>
      {editingEvent ? (
        <EventForm onSubmit={updateEvent} initialEvent={editingEvent} />
      ) : (
        <EventForm onSubmit={addEvent} />
      )}
      <EventList events={events} onEdit={setEditingEvent} onDelete={deleteEvent} />
    </div>
  );
}

export default App;
