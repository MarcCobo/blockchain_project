import React, { useEffect, useState } from "react";
import { Button, Card, Form } from "react-bootstrap";
import axios from "axios";

const Question = () => {

  const [questions, setQuestions] = useState([]);
  const [counter, setCounter] = useState(0);
  const [loaded, setLoaded] = useState(false);
  const [responseId, setResponseId] = useState(0)

  useEffect(() => {
    axios.post("http://localhost:8080/question/get_all").then((response) => {
      setQuestions(response.data);
      setLoaded(true);
    });
  }, []);

  const changeRadioButtonHandler = (e) => {
    setResponseId(e.target.id)
  }

  const buttonClickHandler = () => {
    axios
      .post("http://localhost:8080/user_response/create", {
        question_id: questions[counter].id,
        response_id: responseId,
        user_id: 1
      })
      .then((response) => {
        for(let i = 0; i < questions[counter].responses.length; i++){
          document.getElementById(questions[counter].responses[i].id).checked = false
        }
        let newCounter = counter + 1;
        setCounter(newCounter);
      });
  };

  if (loaded) {
    return (
      <div className="col-8 offset-2 mt-5">
        <Card className="shadow rounded">
          <Card.Header>Questions</Card.Header>
          <Card.Body>
            <Card.Title className="mb-3">
              {questions[counter].question} ({questions[counter].vertical})
            </Card.Title>
            {questions[counter].responses.map((response, index) => (
              <Form.Check
                className="mt-2"
                label={response.response}
                name={questions[counter].question}
                type="radio"
                onClick={changeRadioButtonHandler}
                key={index}
                id={response.id}
              />
            ))}
            <div className="d-flex justify-content-end">
              <Button className="mt-4" onClick={buttonClickHandler}>
                Next
              </Button>
            </div>
          </Card.Body>
        </Card>
      </div>
    );
  }
};

export default Question;
