import React, { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch('http://localhost:8080/message')
      .then(response => response.text())
      .then(data => setMessage(data))
      .catch(error => console.error('Error fetching message:', error));
  }, []);

  return (
    <div style={{ padding: '20px' }}>
      <h1>Spring Boot Message:</h1>
      <p>{message}</p>
    </div>
  );
}

export default App;
