import React, { useEffect } from "react";

const UserGreet = () => {
    const [users, setUsers] = React.useState([]);
  useEffect(() => {
    async function fetchUsers() {
      const response = await fetch(`http://localhost:8080/users`);
      const data = await response.json();
      console.log("Users", data);
      setUsers(data);
    }
    fetchUsers();
  }, []);

  return (
    <div className="greet">
      <h1>Greeting</h1>
      {users.map((user) => (
        <div key={user.id}>
          <h2>{user.username}</h2>
          <p>{user.password}</p>
        </div>
      ))}
    </div>
  );
};

export default UserGreet;
