import React, { useEffect } from "react";
import { useParams } from "react-router-dom";

const UserGreet = () => {
    const [message, setMessage] = React.useState("");
    const {user} = useParams(); // Assuming user is passed as a URL parameter
  useEffect(() => {
    async function fetchGreeting() {
      const response = await fetch(`http://localhost:8080/message/${user}`);
      const data = await response.json();
      console.log("UserGreet", data);
      setMessage(data.message);
    }
    fetchGreeting();
  }, [user]);

  return (
    <div className="greet">
      <h1>Greeting</h1>
      <p>{message}</p>
    </div>
  );
};

export default UserGreet;
