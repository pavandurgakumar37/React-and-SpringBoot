import React, { useEffect } from "react";

const Greet = () => {
    const [message, setMessage] = React.useState("");
  useEffect(() => {
    async function fetchGreeting() {
      const response = await fetch("http://localhost:8080/message");
      const data = await response.json();
      console.log("Greet", data);
      setMessage(data.message);
    }
    fetchGreeting();
  }, []);

  return (
    <div className="greet">
      <h1>Greeting</h1>
      <p>{message}</p>
    </div>
  );
};

export default Greet;
