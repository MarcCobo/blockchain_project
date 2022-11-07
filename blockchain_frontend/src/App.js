import "./App.css";
import Login from "./components/Login";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Question from "./components/Question";

function App() {
  return (
    <div className="mx-auto">
    <Router>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/questions" element={<Question />} />
      </Routes>
    </Router>
    </div>
  );
}

export default App;
