import React from "react";
import "./App.css";
import "./index.css";
import {
  Route,
  Routes
} from "react-router-dom";
import Greet from "./components/Greet";
import UserGreet from "./components/UserGreet";

const App = () => {
  
 return (
      <div className="App">

        <Routes>
          <Route path="/message" element={<Greet />} />
          <Route path="/message/:user" element={<UserGreet />} />
        </Routes>
      </div> 
 );
};

export default App;