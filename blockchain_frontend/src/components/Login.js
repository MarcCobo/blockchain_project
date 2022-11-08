import React, { useState } from "react";
import { Button } from "react-bootstrap";
import Card from "react-bootstrap/Card";
import FloatingLabel from "react-bootstrap/FloatingLabel";
import Form from "react-bootstrap/Form";
import axios from "axios";
import "./Login.css";
import { useNavigate } from "react-router";

const Login = () => {
  const [email, setEmail] = useState("");
  const navigate = useNavigate();

  const emailChangeHandler = (e) => {
    setEmail(e.target.value);
  };

  const checkEmailPost = () => {
    axios
      .get("http://localhost:8080/user/check_email", {
        params: {
          email: email,
        },
      })
      .then((response) => {
        if (response.data === "") {
          axios
            .post("http://localhost:8080/user/create", {
              email: email,
            })
            .then((response) => {
              navigate("/questions");
            });
        } else if (response.data === "empty string") alert("Empty email");
        else if (response.data === "wrong email format")
          alert("Wrong email format");
        else alert("This user already answered the questions");
      });
  };

  return (
    <div className="mt-5 col-sm-4 offset-4">
      <Card className="shadow p-3 mb-5 bg-white rounded">
        <Card.Body>
          <Card.Title className="d-flex justify-content-center">
            Login
          </Card.Title>
          <FloatingLabel
            controlId="floatingInput"
            label="Email address"
            className="mb-3"
          >
            <Form.Control
              className="mt-4"
              type="email"
              placeholder="Enter email"
              onChange={emailChangeHandler}
            ></Form.Control>
          </FloatingLabel>
          <div className="d-flex justify-content-center">
            <Button className="mt-2" onClick={checkEmailPost}>
              Submit
            </Button>
          </div>
        </Card.Body>
      </Card>
    </div>
  );
};

export default Login;
